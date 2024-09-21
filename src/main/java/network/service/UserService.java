package network.service;

import network.domain.User;

public interface UserService {
    void create(User user);

    User findByName(String name);
}
