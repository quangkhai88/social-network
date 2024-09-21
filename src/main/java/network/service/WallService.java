package network.service;

import network.domain.Post;
import network.domain.User;

import java.util.List;

public interface WallService {
    List<Post> getWallPostsFor(User user);
}
