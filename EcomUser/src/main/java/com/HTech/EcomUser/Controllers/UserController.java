package com.HTech.EcomUser.Controllers;

import com.HTech.EcomUser.Models.Users;
import com.HTech.EcomUser.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody Users users) {
        if (users != null) {
            userService.createuser(users); // Ensure the method name is consistent
            return new ResponseEntity<>(users, HttpStatus.CREATED);
        }
        return new ResponseEntity<>("User not created", HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/{userid}")
    public ResponseEntity<Users> findById(@PathVariable String userid) {
        if (userid == null || userid.trim().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Users user = userService.findUserById(userid);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/Users")
    public ResponseEntity<List<Users>> GetAllUsers(){
        List<Users> allUser=userService.allUsers();
        return new ResponseEntity<>(allUser,HttpStatus.OK);
    }
    @PutMapping("/{userid}")
    public  ResponseEntity<?> UpdateUser(@PathVariable String userid,@RequestBody Users users){
        Users updatedUser = userService.updateUser(userid,users);
        if(updatedUser != null){
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        }else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{userid}")
    public ResponseEntity<?> DeleteUser(@PathVariable String userid){
        if (userid == null || userid.trim().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Users deletedUser=userService.deletedUser(userid);
        if(deletedUser != null){
            return new ResponseEntity<>(deletedUser,HttpStatus.CREATED);
        }
        return new ResponseEntity<>("user not present ",HttpStatus.NOT_FOUND);
    }
}
