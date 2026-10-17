package com.practica.musicvault.features.users;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Integer id);

    User getUserByUsername(String username);

    User saveUser(User user);

    public void deleteUser(Integer id);
    
}
