package com.project1.board.repository;

import com.project1.board.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    List<User> findByEmail(String email);

    Optional<User> findById(Long userIdx);

}
