package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;

import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser =OK

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier = OK
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: A modifier = OK
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier = OK
        apiService.deleteUser(user);

    }


}

