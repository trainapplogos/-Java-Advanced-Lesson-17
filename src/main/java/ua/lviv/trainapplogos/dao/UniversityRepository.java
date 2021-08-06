package ua.lviv.trainapplogos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ua.lviv.trainapplogos.domain.University;

public interface UniversityRepository extends CrudRepository<University, Long>, JpaRepository<University, Long> {
	
}
