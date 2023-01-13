package com.example.springdatajpa.service;

import com.example.springdatajpa.dto.UserDTO;
import com.example.springdatajpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public ResponseEntity save(UserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseEntity update(Long id, UserDTO requestDTO) {
        return null;
    }

    @Override
    public ResponseEntity delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity getAll() {
        return null;
    }

    @Override
    public ResponseEntity findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity deleteAll() {
        return null;
    }
}
