package com.example.skincareshop.service;

import com.example.skincareshop.domain.User;
import com.example.skincareshop.dto.UserDto;
import com.example.skincareshop.exception.UserNotFoundException;
import com.example.skincareshop.mapper.UserMapper;
import com.example.skincareshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserDto getOne(String Name) {
        Optional<User> user = Optional.ofNullable(userRepository.findUserByLastName(Name));
        if (user.isEmpty()) {
            throw new UserNotFoundException("This supplier does not exist");
        }
        return userMapper.mapToDto(user.get());
    }

    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
