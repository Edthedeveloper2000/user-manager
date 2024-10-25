package main.java.com.useManager.application;

import main.java.com.useManager.domain.User;
import main.java.com.useManager.interfaces.UserRepository;

import java.util.Map;

public class FindManyUsersUseCase {
    UserRepository userRepository;

    public FindManyUsersUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Map<Integer, User> execute() {
        return this.userRepository.getAllUsers();
    }
}
