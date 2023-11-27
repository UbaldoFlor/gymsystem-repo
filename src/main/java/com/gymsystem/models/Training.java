package com.gymsystem.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "training")
public class Training {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@OneToMany
    @JoinColumn(name="TraineeID", nullable=false, referencedColumnName="id", table="Trainee")
    private Long traineeId;
	
	@OneToMany
    @JoinColumn(name="TrainerID", nullable=false, referencedColumnName="id", table="Trainer")
    private Long trainerId;
	
	@NotNull
    @Column(name="TrainingName")
    private String trainingName;
	
	@OneToMany
    @JoinColumn(name="TrainingTypeID", nullable=false, referencedColumnName="id", table="TrainingType")
    private Long trainingTypeId;
	
	@NotNull
	@Column(name="TrainingDate")
	private Date trainingDate;
	
	@NotNull
	@Column(name="TrainingDuration")
	private Long trainingDuration;
	
	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}

	public Long getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public Long getTrainingTypeId() {
		return trainingTypeId;
	}

	public void setTrainingTypeId(Long trainingTypeId) {
		this.trainingTypeId = trainingTypeId;
	}

	public Date getTrainingDate() {
		return trainingDate;
	}

	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}
	
	public Long getTrainingDuration() {
		return trainingDuration;
	}

	public void setTrainingDuration(Long trainingDuration) {
		this.trainingDuration = trainingDuration;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.id) + "," +
				String.valueOf(this.traineeId) + "," +
				String.valueOf(this.trainerId) + "," +
				this.trainingName + "," +
				String.valueOf(this.trainingTypeId) + "," +
				String.valueOf(this.trainingDate) + "," +
				String.valueOf(this.trainingDuration);
	}
}
