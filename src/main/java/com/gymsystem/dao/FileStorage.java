package com.gymsystem.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import com.gymsystem.models.Trainee;
import com.gymsystem.models.Trainer;
import com.gymsystem.models.Training;
import com.gymsystem.models.TrainingType;
import com.gymsystem.models.User;

@Repository
public class FileStorage implements Storage {

    //private final Resource filePath;
    private List<Object> data;
    private File filePath = new File(
            "C:\\Users\\ubaldo_flor\\eclipse-workspace\\gymsystem\\src\\main\\resources\\data.txt");

    /*public FileStorage(@Value("C:\\Users\\ubaldo_flor\\eclipse-workspace\\gymsystem\\src\\main\\resources\\data.txt") Resource filePath) {
        this.filePath = filePath;
    }*/

    @Override
    public List<Object> getData() {
    	loadDataFromFile();
    	if (data == null) {
            loadDataFromFile();
        }
        return data;
    }

    @Override
    public void storeData(List<Object> data) {
    	PrintWriter writer;
		try {
			writer = new PrintWriter(filePath);
			for (Object obj : data) {
                writer.write(obj.toString());
            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            
        this.data = data;
    }

    @PostConstruct
    public void init() {
    	loadDataFromFile();
    }
    
    private void loadDataFromFile() {
        data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse line into an object and add to data list
            	String[] attributes = line.split(",");
            	if(attributes.length == 6) {
            		addUserEntity(attributes);
            	}
            	else if(attributes.length == 4) {
            		addTraineeEntity(attributes);
            	}
            	else if(attributes.length == 3) {
            		addTrainerEntity(attributes);
            	}
            	else if(attributes.length == 2) {
            		addTrainingTypeEntity(attributes);
            	}
            	else if(attributes.length == 7) {
            		addTrainingEntity(attributes);
            	}
            	else {
            		System.out.println("This line doesn't match any entity.");; 
            	}
            }
        } catch (IOException e) {
            throw new RuntimeException("Could not load data from file: " + e.getMessage());
        }
    }
    
    private void addUserEntity(String[] attributes) {
    	User user = new User(attributes[1], attributes[2], Boolean.valueOf(attributes[5]));
    	user.setId(Long.getLong(attributes[0]));
    	user.setUsername(attributes[3]);
    	user.setPassword(attributes[4]);
    }
    
    private void addTraineeEntity(String[] attributes) {
    	Trainee trainee = new Trainee();
    	trainee.setId(Long.getLong(attributes[0]));
    	trainee.setDateOfBirth(Date.valueOf(attributes[1]));
    	trainee.setAddress(attributes[2]);
    	trainee.setUserId(Long.valueOf(attributes[3]));
    }
    
    private void addTrainerEntity(String[] attributes) {
    	Trainer trainer = new Trainer();
    	trainer.setId(Long.getLong(attributes[0]));
    	trainer.setSpecialization(attributes[1]);
    	trainer.setUserId(Long.valueOf(attributes[2]));
    }
    
    private void addTrainingTypeEntity(String[] attributes) {
    	TrainingType trainingType = new TrainingType();
    	trainingType.setId(Long.getLong(attributes[0]));
    	trainingType.setTrainingTypeName(attributes[1]);
    }
    
    private void addTrainingEntity(String[] attributes) {
    	Training training = new Training();
    	training.setId(Long.getLong(attributes[0]));
    	training.setTraineeId(Long.valueOf(attributes[1]));
    	training.setTrainerId(Long.valueOf(attributes[2]));
    	training.setTrainingName(attributes[3]);
    	training.setTrainingTypeId(Long.valueOf(attributes[4]));
    	training.setTrainingDate(Date.valueOf(attributes[5]));
    	training.setTrainingDuration(Long.valueOf(attributes[6]));
    }
}
