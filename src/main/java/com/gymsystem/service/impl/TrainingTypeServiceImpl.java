package com.gymsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymsystem.dao.TrainingTypeDao;
import com.gymsystem.models.TrainingType;
import com.gymsystem.service.TrainingTypeService;

@Service
public class TrainingTypeServiceImpl implements TrainingTypeService{

	@Autowired
	TrainingTypeDao trainingTypeDao;
	
	@Override
	public TrainingType createTrainingType(TrainingType trainingType) {
		return trainingTypeDao.save(trainingType);
	}

	@Override
	public TrainingType updateTrainingType(TrainingType trainingType) {
		return trainingTypeDao.save(trainingType);
	}

	@Override
	public void deleteTrainingType(Long id) {
		trainingTypeDao.deleteById(id);
	}

	@Override
	public TrainingType getTrainingTypeById(Long id) {
		return trainingTypeDao.getById(id);
	}

	@Override
	public List<TrainingType> getAllTTrainingTypes() {
		return trainingTypeDao.findAll();
	}
}
