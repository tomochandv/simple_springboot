package com.project1.board.domain;

import com.project1.board.dto.UserForm;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_idx")
    private Long id;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(name = "created_at")
    private LocalDateTime createdDate;

    public User(){}

    public User(UserForm userForm) {
        this.email = userForm.getEmail();
        this.createdDate = LocalDateTime.now();
    }

    public static User createUser(UserForm userForm){
        return new User(userForm);
    }

}
