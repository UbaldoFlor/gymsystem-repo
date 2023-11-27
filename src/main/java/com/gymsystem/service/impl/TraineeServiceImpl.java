package com.gymsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gymsystem.dao.impl.TraineeDaoImpl;
import com.gymsystem.models.Trainee;
import com.gymsystem.service.TraineeService;

@Service
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDaoImpl traineeDao;
	
	@Override
	public Trainee createTrainee(Trainee trainee) {
		return traineeDao.save(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		return traineeDao.save(trainee);
	}

	@Override
	public void deleteTrainee(Long id) {
		traineeDao.deleteById(id);
	}

	@Override
	public Trainee getTraineeById(Long id) {
		return traineeDao.getById(id);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		return traineeDao.findAll();
	}
	
}
