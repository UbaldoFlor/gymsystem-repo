package com.gymsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymsystem.dao.impl.TrainingDaoImpl;
import com.gymsystem.models.Training;
import com.gymsystem.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService{
	
	@Autowired
	TrainingDaoImpl trainingDao;
	
	@Override
	public Training createTraining(Training training) {
		return trainingDao.save(training);
	}

	@Override
	public Training updateTraining(Training training) {
		return trainingDao.save(training);
	}

	@Override
	public void deleteTraining(Long id) {
		trainingDao.deleteById(id);
	}

	@Override
	public Training getTrainingById(Long id) {
		return trainingDao.getById(id);
	}

	@Override
	public List<Training> getAllTTrainings() {
		return trainingDao.findAll();
	}
}
