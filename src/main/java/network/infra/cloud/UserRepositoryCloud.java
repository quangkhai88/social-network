package network.infra.cloud;

import network.domain.User;
import network.repository.UserRepository;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class UserRepositoryCloud implements UserRepository {
    @Override
    public void save(User user) {
        // Save user to cloud
    }

    @Override
    public User findByName(String name) {
        return null;
    }


}
