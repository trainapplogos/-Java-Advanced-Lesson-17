package ua.lviv.trainapplogos.service;

import ua.lviv.trainapplogos.domain.University;

public interface UniversityService {
	University save(University university);
	
	University update(University university);
	
	University readById(long id);
	
	void deleteById(long id);
	
	long count();
}
