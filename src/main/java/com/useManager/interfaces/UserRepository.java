package main.java.com.useManager.interfaces;

import main.java.com.useManager.domain.User;

import java.util.Map;

public interface UserRepository {
    void addUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUser(int id);
    Map<Integer, User> getAllUsers();
}
