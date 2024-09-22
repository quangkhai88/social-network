package network.infra.database;

import network.domain.Post;
import network.domain.User;
import network.repository.PostRepository;

import java.util.List;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class PostRepositoryImpl implements PostRepository {
    @Override
    public void save(Post post) {
        FakeDatabase.savePost(post.getAuthor(), post);
    }

    @Override
    public List<Post> findByUser(User user) {
        return FakeDatabase.findPost(user);
    }

}
