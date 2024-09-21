package network.repository;

import network.domain.User;

public interface UserRepository {
    void save(User user);
    User findByName(String name);
}
