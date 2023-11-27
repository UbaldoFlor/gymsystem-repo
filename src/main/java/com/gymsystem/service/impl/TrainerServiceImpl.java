package com.gymsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymsystem.dao.impl.TrainerDaoImpl;
import com.gymsystem.models.Trainer;
import com.gymsystem.service.TrainerService;

@Service
public class TrainerServiceImpl implements TrainerService{
	
	@Autowired
	TrainerDaoImpl trainerDao;
	
	@Override
	public Trainer createTrainer(Trainer trainer) {
		return trainerDao.save(trainer);
	}

	@Override
	public Trainer updateTrainer(Trainer trainer) {
		return trainerDao.save(trainer);
	}

	@Override
	public void deleteTrainer(Long id) {
		trainerDao.deleteById(id);
	}

	@Override
	public Trainer getTrainerById(Long id) {
		return trainerDao.getById(id);
	}

	@Override
	public List<Trainer> getAllTrainers() {
		return trainerDao.findAll();
	}
}
