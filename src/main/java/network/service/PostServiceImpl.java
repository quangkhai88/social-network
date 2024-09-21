package network.service;

import network.domain.Post;
import network.domain.User;
import network.repository.PostRepository;

import java.util.List;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void post(User user, String text) {
        Post post = new Post(user, text);
        postRepository.save(post);
    }

    @Override
    public List<Post> getPosts(User user) {
        return postRepository.findByUser(user);
    }

}
