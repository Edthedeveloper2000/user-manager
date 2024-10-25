package main.java.com.useManager.application;

import main.java.com.useManager.domain.User;
import main.java.com.useManager.interfaces.UserRepository;

public class UpdateUserUseCase {
    private final UserRepository userRepository;

    public UpdateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(User user) {
        userRepository.updateUser(user);
    }
}
