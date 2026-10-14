package com.student;

public class UserDao {

    public void login(String username, String password) throws Exception {

        if (username == null || password == null) {
            throw new Exception("Invalid input");
        }

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login successful");
        } else {
            throw new RuntimeException("Bad credentials");
        }
    }
}