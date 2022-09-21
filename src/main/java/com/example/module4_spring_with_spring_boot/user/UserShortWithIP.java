package com.example.module4_spring_with_spring_boot.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserShortWithIP implements UserShort {

    private String firstName;
    private String email;
    private String ip;


    public UserShortWithIP(UserShort user, String ip){
        this.firstName = user.getFirstName();
        this.email = user.getEmail();
        this.ip = ip;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }
}
