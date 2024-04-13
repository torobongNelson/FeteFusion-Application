package com.fetefusion.FeteFusion.Dtos.Request;

import com.fetefusion.FeteFusion.Model.UserRoles;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserRoles Role;

}
