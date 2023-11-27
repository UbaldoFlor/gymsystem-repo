package com.gymsystem.service;

import java.util.List;

import com.gymsystem.models.Trainee;

public interface TraineeService {
	
	public Trainee createTrainee(Trainee trainee);
	
	public Trainee updateTrainee(Trainee trainee);
	
	public void deleteTrainee(Long id);
	
	public Trainee getTraineeById(Long id);
	
	public List<Trainee> getAllTrainees();
	
}
