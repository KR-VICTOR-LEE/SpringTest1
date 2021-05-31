package com.example.studyone.repository;

import com.example.studyone.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByAccount(String ac);

    Optional<User> findByEmail(String Email);

    Optional<User> findByAccountAndEmail(String ac, String email);

}
