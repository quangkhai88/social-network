package network.service;

import network.domain.User;

public interface FollowService {
    void follow(User follower, User followee);
    void unfollow(User follower, User followee);
}
