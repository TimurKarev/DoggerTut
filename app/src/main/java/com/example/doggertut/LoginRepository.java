package com.example.doggertut;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}