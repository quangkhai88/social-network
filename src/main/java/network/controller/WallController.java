package network.controller;

import network.domain.Post;
import network.domain.User;
import network.service.UserService;
import network.service.WallService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class WallController {

    private final UserService userService;
    private final WallService wallService;

    public WallController(UserService userService, WallService wallService) {
        this.userService = userService;
        this.wallService = wallService;
    }

    public WallResponseDto displayWall(String name) {
        User user = userService.findByName(name);
        List<Post> wallPosts = this.wallService.getWallPostsFor(user);
        return WallResponseDto.builder()
                .posts(wallPosts.stream().map(Post::toString).collect(Collectors.toList()))
                .build();
    }

}
