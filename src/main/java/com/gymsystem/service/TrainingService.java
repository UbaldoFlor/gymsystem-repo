package com.gymsystem.service;

import java.util.List;

import com.gymsystem.models.Training;

public interface TrainingService {
	
	public Training createTraining(Training training);
	
	public Training updateTraining(Training Training);
	
	public void deleteTraining(Long id);
	
	public Training getTrainingById(Long id);
	
	public List<Training> getAllTTrainings();
}
