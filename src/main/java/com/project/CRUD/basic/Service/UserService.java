package com.project.CRUD.basic.Service;

import com.project.CRUD.basic.Model.User;
import com.project.CRUD.basic.Repositoory.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public String addUser(User user) {
        userRepo.save(user);
        return "UserSaved";
    }

    public Iterable<User> getUser() {
        return userRepo.findAll();
    }

    public String deleteUser(User user) {
        userRepo.delete(user);
        return "user deleted Successfully";
    }

    public String updateUser(Long userId,User user) {
    Optional<User> newUser=userRepo.findById(userId);
    if(newUser!=null){
        userRepo.save(user);

        return "User Updated";
    }
    return "User with this userId not found";


    }
}
