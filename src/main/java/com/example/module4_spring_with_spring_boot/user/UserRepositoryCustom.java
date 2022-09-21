package com.example.module4_spring_with_spring_boot.user;

import java.util.List;

public interface UserRepositoryCustom {

    List<UserShortWithIP> findAllByEmailContainingIgnoreCaseWithIP(String emailSearch);

}
