package network.infra.database;

import network.domain.Follow;
import network.domain.User;
import network.repository.FollowRepository;

import java.util.List;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class FollowRepositoryImpl implements FollowRepository {


    @Override
    public void saveFollow(Follow follow) {
        FakeDatabase.saveFollow(follow);
    }

    @Override
    public void deleteFollow(Follow follow) {
        FakeDatabase.deleteFollow(follow);
    }

    @Override
    public List<User> findFollowing(User user) {
        return FakeDatabase.findFollowing(user);
    }
}
