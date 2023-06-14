package com.project1.board.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project1.board.dto.BoardForm;
import com.project1.board.dto.UserForm;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter

public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idx")
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Lob
    @Column(name = "contents")
    private String contents;

    @Column(name = "created_at")
    private LocalDateTime createdDate;

    @ManyToOne()
    @JoinColumn(name = "user_idx")
    private User user;

    public Board(){}

    public Board(String title, String contents, User user) {
        this.contents = contents;
        this.title = title;
        this.user = user;
        this.createdDate = LocalDateTime.now();
    }
//
//    public static Board createBoard(BoardForm form) {
//        return new Board(form);
//    }
}
