package network.repository;

import network.domain.Post;
import network.domain.User;

import java.util.List;

public interface PostRepository {
    void save(Post post);
    List<Post> findByUser(User user);
}
