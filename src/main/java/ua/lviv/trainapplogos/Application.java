package ua.lviv.trainapplogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.trainapplogos.domain.University;
import ua.lviv.trainapplogos.service.UniversityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(Application.class, args);
		UniversityService service = cxt.getBean(UniversityService.class);
		
		University univerMIT = new University();
		univerMIT.setName("Massachusetts Institute of Technology");
		univerMIT.setAddress("77 Massachusetts Ave, Cambridge, MA 02139, United States");
		univerMIT.setLevelOfAccreditation(4);
		univerMIT.setNumberOfInstitutes(14);
		univerMIT.setNumbetOfStudents(2457);
		
		University UCU = new University();
		UCU.setName("Ukrainian Catholig University");
		UCU.setAddress("17 Sventsitskoho street, 79011, Lviv, Ukraine");
		UCU.setLevelOfAccreditation(4);
		UCU.setNumberOfInstitutes(6);
		UCU.setNumbetOfStudents(2060);
		
		service.save(univerMIT);
		service.save(UCU);
		
		System.out.println("\n> There are " + service.count() + " records in DB");
		
		System.out.println("\n> University with id = 1: " + service.readById(1));
		
		univerMIT.setNumberOfInstitutes(503);
		service.update(univerMIT);
		System.out.println("\n> Updated MIT:" + univerMIT);

		service.deleteById(2);
		
		System.out.println();
		
		
	}

}
