package main.java.com.useManager.infrastructure;

import main.java.com.useManager.domain.User;
import main.java.com.useManager.interfaces.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository {
    private final Map<Integer, User> users = new HashMap<>();

    @Override
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User getUserById(int id) {
        return users.get(id);
    }

    @Override
    public void updateUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void deleteUser(int id) {
        users.remove(id);
    }

    @Override
    public Map<Integer, User> getAllUsers() {
        return users;
    }
}
