package main.java.com.useManager.application;

import main.java.com.useManager.domain.User;
import main.java.com.useManager.interfaces.UserRepository;

public class FindUserUseCase {
    UserRepository userRepository;

    public FindUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(Integer id) {
        return this.userRepository.getUserById(id);
    }
}
