package com.gymsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gymsystem.dao.TraineeDao;
import com.gymsystem.dao.TrainerDao;
import com.gymsystem.dao.TrainingDao;
import com.gymsystem.dao.TrainingTypeDao;
import com.gymsystem.dao.UserDao;
import com.gymsystem.dao.impl.TraineeDaoImpl;
import com.gymsystem.dao.impl.TrainerDaoImpl;
import com.gymsystem.dao.impl.TrainingDaoImpl;
import com.gymsystem.dao.impl.TrainingTypeDaoImpl;
import com.gymsystem.dao.impl.UserDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.gymsystem")
public class AppConfig {
	@Bean
    public UserDao userDao() {
        return new UserDaoImpl();
    }
	@Bean
    public TraineeDao traineeDao() {
        return new TraineeDaoImpl();
    }
	@Bean
    public TrainerDao trainerDao() {
        return new TrainerDaoImpl();
    }
	@Bean
    public TrainingDao trainingDao() {
        return new TrainingDaoImpl();
    }
	@Bean
    public TrainingTypeDao trainingTypeDao() {
        return new TrainingTypeDaoImpl();
    }
}
