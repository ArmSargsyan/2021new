package com.epam.model;

import com.epam.manager.UserManager;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        List<User> users = userManager.getAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
