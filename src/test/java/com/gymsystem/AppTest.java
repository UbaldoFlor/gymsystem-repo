package com.gymsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.gymsystem.facade.FacadeImpl;
import com.gymsystem.models.User;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @Mock
    private FacadeImpl facade;

    @InjectMocks
    private App app;

    private User user;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        user = new User("Ubaldo", "Flor", true);
        List<User> users = Arrays.asList(user);
        
        // Define mock behavior for FacadeImpl methods
        Mockito.when(facade.getAllUsers()).thenReturn(users);
        Mockito.doNothing().when(facade).createUser(user);
        Mockito.when(facade.getUserById(1L)).thenReturn(user);
        Mockito.doNothing().when(facade).updateUser(user);
        Mockito.doNothing().when(facade).deleteUser(1L);
    }

    @Test
    public void testCreateUser() {
        app.main(new String[] {});
        Mockito.verify(facade).createUser(user);
    }

    @Test
    public void testGetUserById() {
        app.main(new String[] {});
        User result = facade.getUserById(1L);
        assertEquals(user, result);
    }

    @Test
    public void testUpdateUser() {
        app.main(new String[] {});
        facade.updateUser(user);
        Mockito.verify(facade).updateUser(user);
    }

    @Test
    public void testDeleteUser() {
        app.main(new String[] {});
        facade.deleteUser(1L);
        Mockito.verify(facade).deleteUser(1L);
    }

    @Test
    public void testGetAllUsers() {
        app.main(new String[] {});
        List<User> result = facade.getAllUsers();
        assertEquals(1, result.size());
        assertEquals(user, result.get(0));
    }
}