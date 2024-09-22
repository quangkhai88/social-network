package network.infra.database;

import network.domain.User;
import network.repository.UserRepository;


/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void save(User user) {
        FakeDatabase.saveUser(user);
    }

    @Override
    public User findByName(String name) {
        return FakeDatabase.findUser(name);
    }
}
