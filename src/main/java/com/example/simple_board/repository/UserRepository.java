package com.example.simple_board.repository;

import com.example.simple_board.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);//Id로 찾는것만 제공하기 때문에 나머진 구현
}