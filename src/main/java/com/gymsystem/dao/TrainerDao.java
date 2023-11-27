package com.gymsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gymsystem.models.Trainer;

@Repository
public interface TrainerDao extends JpaRepository<Trainer, Long> {

	List<Trainer> getAllTrainers();

	Trainer getTrainerById(long id);

	void createTrainer(Trainer trainer);

	void updateTrainer(Trainer trainer);

	void deleteTrainer(long id);

}
