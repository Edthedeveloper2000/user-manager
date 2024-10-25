package main.java.com.useManager.application;

import main.java.com.useManager.domain.User;
import main.java.com.useManager.interfaces.UserRepository;

public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(User user) {
        userRepository.addUser(user);
    }
}
