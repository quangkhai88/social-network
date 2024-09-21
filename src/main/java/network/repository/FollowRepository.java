package network.repository;

import network.domain.Follow;
import network.domain.User;

import java.util.List;

public interface FollowRepository {
    void saveFollow(Follow follow);
    void deleteFollow(Follow follow);
    List<User> findFollowing(User user);
}
