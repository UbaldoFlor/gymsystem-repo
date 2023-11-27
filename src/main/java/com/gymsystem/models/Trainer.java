package com.gymsystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trainer")
public class Trainer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

	@OneToMany
    @JoinColumn(name="Specialization", nullable=false, referencedColumnName="trainingName", table="Training")
    private String specialization;
    
    @OneToOne
    @JoinColumn(name="UserID", nullable=false, referencedColumnName="id", table="User")
    private Long userId;

    //getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.id) + "," +
				this.specialization + "," +
				this.userId;
	}
}
