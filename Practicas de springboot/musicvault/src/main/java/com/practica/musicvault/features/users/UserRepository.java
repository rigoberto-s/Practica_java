package com.practica.musicvault.features.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface UserRepository extends  JpaRepository<User, Integer>{

    //esta bien se le puse el public? es que tengo constumbre ya, pero si esta mal dime
    public User findByUsername(String username);

}
