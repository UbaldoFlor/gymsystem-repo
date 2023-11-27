package com.gymsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gymsystem.models.Trainee;

@Repository
public interface TraineeDao extends JpaRepository<Trainee, Long> {

	void deleteTrainee(long id);

	void updateTrainee(Trainee trainee);

	void createTrainee(Trainee trainee);

	Trainee getTraineeById(long id);

	List<Trainee> getAllTrainees();
	
}
