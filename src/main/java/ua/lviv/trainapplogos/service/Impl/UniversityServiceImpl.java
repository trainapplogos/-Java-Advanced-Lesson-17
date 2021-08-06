package ua.lviv.trainapplogos.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.trainapplogos.dao.UniversityRepository;
import ua.lviv.trainapplogos.domain.University;
import ua.lviv.trainapplogos.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {
	@Autowired
	private UniversityRepository universityRepository;
	
	@Override
	public University save(University university) {
		return universityRepository.saveAndFlush(university);
	}

	@Override
	public University update(University university) {
		return universityRepository.save(university);
	}

	@Override
	public University readById(long id) {
		return universityRepository.getById(id);
	}

	@Override
	public void deleteById(long id) {
		universityRepository.deleteById(id);
	}

	@Override
	public long count() {
		return universityRepository.count();
	}
}
