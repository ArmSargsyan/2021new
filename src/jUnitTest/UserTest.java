package jUnitTest;


import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class UserTest {
    private User user;
    private User user1;
    private User user2;

    @BeforeEach
    public void createUser() throws Exception {
        user = new User("Max", 35, Sex.MALE);
        user1 = new User("Anna", 34, Sex.FEMALE);
        user2 = new User("Joanna", 7, Sex.FEMALE);
    }

    @Test
    void getAllUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGetAllUsers_NO_Null() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }

    @Test
    void getAllUsers_MALE() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void getAllUsers_MALE_NO_NULL() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void getAnyUsers() {
        int expected = User.getAnyUsers();
        int actual = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();
        int actual = 34 + 35 + 7;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testGetAllAgeUsers_FEMALE() {

        int expected = User.getAllAgeUsers(Sex.FEMALE);
        int actual = 34 + 7;
        Assert.assertEquals(expected, actual);
    }

}