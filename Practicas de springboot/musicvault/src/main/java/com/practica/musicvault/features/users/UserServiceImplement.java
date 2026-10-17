package com.practica.musicvault.features.users;

import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class UserServiceImplement implements UserService{

    public final UserRepository userRepository;

    public UserServiceImplement(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    //pir que arribada si no lo encontramos por id devoldemos nulo pero aqui no?
    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        User us = userRepository.findById(id).orElse(null);

        if(us != null){
            userRepository.delete(us);
        }
    }

}
