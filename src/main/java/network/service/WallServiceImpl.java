package network.service;

import network.domain.Post;
import network.domain.User;
import network.repository.FollowRepository;
import network.repository.PostRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class WallServiceImpl implements WallService {

    private final PostRepository postRepository;
    private final FollowRepository followRepository;

    public WallServiceImpl(PostRepository postRepository, FollowRepository followRepository) {
        this.postRepository = postRepository;
        this.followRepository = followRepository;
    }

    @Override
    public List<Post> getWallPostsFor(User user) {

        List<Post> posts = postRepository.findByUser(user);

        List<Post> postByFollowingUsers = followRepository.findFollowing(user).stream()
                                            .flatMap(following -> postRepository.findByUser(following).stream())
                                            .toList();

        return Stream.concat(posts.stream(), postByFollowingUsers.stream())
                    .sorted(Comparator.comparing(Post::getTime).reversed())
                    .toList();
    }



}
