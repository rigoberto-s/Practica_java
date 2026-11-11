package com.practica.melody.features.users;

import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository){
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

    @Override
    public User getUserByUsername(String username) {
        //por que aqui no tenemos una validacion de null? por no ser llave primaria?
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
