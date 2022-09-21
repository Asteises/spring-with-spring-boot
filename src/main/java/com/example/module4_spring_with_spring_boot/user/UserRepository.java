package com.example.module4_spring_with_spring_boot.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

    List<User> findByEmailContainingIgnoreCase(String emailSearch);

    List<UserShort> finAllByEmailContainingIgnoreCase(String emailSearch);
}
