package com.project1.board.service;

import com.project1.board.domain.Board;
import com.project1.board.domain.User;
import com.project1.board.dto.BoardForm;
import com.project1.board.exception.NonUserException;
import com.project1.board.repository.BoardRepository;
import com.project1.board.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final UserRepository userRepository;

    @Transactional
    public boolean boardCreated(BoardForm boardForm) throws Exception {
        Optional<User> user = userRepository.findById(boardForm.getUserIdx());

        if (user.isPresent()) {
            boardRepository.save(new Board(boardForm.getTitle(),
                    boardForm.getContents(),
                    user.get()));
            return true;
        } else {
            throw new NonUserException();
        }
    }

    @Transactional
    public List<Board> boardList() throws Exception {
        return boardRepository.findAll();
    }
}
