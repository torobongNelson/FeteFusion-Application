package com.fetefusion.FeteFusion.Interface;

import com.fetefusion.FeteFusion.Dtos.Request.UserRegistrationRequest;
import com.fetefusion.FeteFusion.Model.User;

public interface UserServiceInterface {

    User createAccount(UserRegistrationRequest request);

    User updateAccount(User user);
    void deleteAccount(Long id);

    String register(User user);


}
