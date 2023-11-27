package com.gymsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gymsystem.models.Training;

@Repository
public interface TrainingDao extends JpaRepository<Training, Long> {

	List<Training> getAllTrainings();

	Training getTrainingById(long id);

	void createTraining(Training training);

	void updateTraining(Training training);

	void deleteTraining(long id);
	
}
