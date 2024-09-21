package network.service;

import network.domain.Post;
import network.domain.User;

import java.util.List;

public interface PostService {
    void post(User user, String text);
    List<Post> getPosts(User user);
}
