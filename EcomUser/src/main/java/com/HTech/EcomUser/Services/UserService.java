package com.HTech.EcomUser.Services;

import com.HTech.EcomUser.Models.Users;
import com.HTech.EcomUser.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void createuser(Users users) {
        userRepository.save(users);
    }

    public List<Users> allUsers() {
        return userRepository.findAll();
    }
    public Users findUserById(String userid) {
        return userRepository.findById(userid).orElse(null);
    }
    public Users updateUser(String userid,Users user){
        Users existingUser= userRepository.findById(userid).orElse(null);
        if(existingUser != null){
            existingUser.setAddress(user.getAddress());
            existingUser.setEmail(user.getEmail());
            existingUser.setContact(user.getContact());
            return userRepository.save(existingUser);
        }
        return null;
    }
    public  Users deletedUser( String userid){
        Users deleteuser =  userRepository.findById(userid).orElse(null);
        return deleteuser;
    }
}
