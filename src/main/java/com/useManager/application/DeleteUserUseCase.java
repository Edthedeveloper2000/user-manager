package main.java.com.useManager.application;

import main.java.com.useManager.interfaces.UserRepository;

public class DeleteUserUseCase {
    private final UserRepository userRepository;

    public DeleteUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    };

    public void execute(int userId) {
        userRepository.deleteUser(userId);
    }
}
