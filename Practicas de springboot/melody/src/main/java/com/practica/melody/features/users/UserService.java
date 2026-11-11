package com.practica.melody.features.users;

import java.util.List;

public interface UserService {

    //conseguir todos los usuarios
    public List<User> getAllUsers();
    //conseguirlos por id
    public User getUserById(Integer id);
    //conseguirlos por usuario
    public User getUserByUsername(String username);
    //guardarlos
    public User saveUser(User user);
    //eliminarlos
    public void deleteUser(Integer id);
}
