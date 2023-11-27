package com.gymsystem.service;

import java.util.List;

import com.gymsystem.models.TrainingType;

public interface TrainingTypeService {
	
	public TrainingType createTrainingType(TrainingType trainingType);
	
	public TrainingType updateTrainingType(TrainingType trainingType);
	
	public void deleteTrainingType(Long id);
	
	public TrainingType getTrainingTypeById(Long id);
	
	public List<TrainingType> getAllTTrainingTypes();
}
