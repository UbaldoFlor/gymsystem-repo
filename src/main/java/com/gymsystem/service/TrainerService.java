package com.gymsystem.service;

import java.util.List;

import com.gymsystem.models.Trainer;

public interface TrainerService {
	
	public Trainer createTrainer(Trainer trainer);
	
	public Trainer updateTrainer(Trainer trainer);
	
	public void deleteTrainer(Long id);
	
	public Trainer getTrainerById(Long id);
	
	public List<Trainer> getAllTrainers();
}
