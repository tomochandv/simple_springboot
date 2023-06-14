package com.project1.board.service;

import com.project1.board.domain.User;
import com.project1.board.dto.UserForm;
import com.project1.board.exception.DuplicateEmailException;
import com.project1.board.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSerivce {
    private final UserRepository userRepository;

    @Transactional
    public void signUpUser(UserForm userForm) throws Exception {
        validateDuplicateEmail(userForm.getEmail());
        userRepository.save(User.createUser(userForm));
    }

    private void validateDuplicateEmail(String email) throws Exception {
        if(userRepository.existsByEmail(email)){
            throw new DuplicateEmailException();
        }
    }

    @Transactional
    public boolean login(UserForm userForm) {
        List<User> user = userRepository.findByEmail(userForm.getEmail());
        return (long) user.size() > 0;
    }

}
