package com.gymsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gymsystem.models.TrainingType;

@Repository
public interface TrainingTypeDao extends JpaRepository<TrainingType, Long> {

	List<TrainingType> getAllTrainingTypes();

	TrainingType getTrainingTypeById(long id);

	void createTrainingType(TrainingType trainingType);

	void updateTrainingType(TrainingType trainingType);

	void deleteTrainingType(long id);

}
