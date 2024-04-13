package com.fetefusion.FeteFusion.Service;

import com.fetefusion.FeteFusion.Dtos.Request.UserRegistrationRequest;
import com.fetefusion.FeteFusion.Interface.UserServiceInterface;
import com.fetefusion.FeteFusion.Model.User;
import com.fetefusion.FeteFusion.Repository.UserRepository;
import com.fetefusion.FeteFusion.Exception.UserAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserService implements UserServiceInterface {
   private final PasswordEncoder bCryptPasswordEncoder;
   @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserService( PasswordEncoder bCryptPasswordEncoder, UserRepository userRepository) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userRepository = userRepository;
    }


    @Override
    public User createAccount(UserRegistrationRequest request) {
       User user = userRepository.findByEmail(request.getEmail());
        if(user != null){
            throw new UserAlreadyExistException("Sorry, this user already exist!");
        }
        else{
            user = new User();
            user.setFirstName(request.getFirstName());
            user.setLastName(request.getLastName());
            user.setEmail(request.getEmail());
            user.setPassword(request.getPassword());
            user.setRole(request.getRole());
            register(user);

        }
        return user;
    }



    @Override
    public User updateAccount(User user) {
        return userRepository.save(user);

    }


    @Override
    public void deleteAccount(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public String register(User user) {
        userRepository.save(user);
        return "User created successfully";
    }
}
