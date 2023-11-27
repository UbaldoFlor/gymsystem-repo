package com.gymsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.gymsystem.facade.FacadeImpl;
import com.gymsystem.models.User;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FacadeImpl facade = context.getBean(FacadeImpl.class);

        // Invoke facade methods
        User user = new User("Ubaldo", "Flor", true);
        System.out.println("All users: " + facade.getAllUsers());
        facade.createUser(user);
        
        System.out.println("Stored models:");
        facade.storeAllModels();
        System.out.println("Model with ID 1: " + facade.getUserById(1L));
        facade.updateUser(new User("Ubaldo", "Flor", false));
        System.out.println("Model with ID 1 (after update): " + facade.getUserById(1L));
        facade.deleteUser(1L);
        System.out.println("All models (after delete): " + facade.getAllUsers());
        
        
        // Close the application context
        ((AnnotationConfigApplicationContext) context).close();
    }
}