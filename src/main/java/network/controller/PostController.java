package network.controller;

import network.domain.User;
import network.service.PostService;
import network.service.UserService;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class PostController {

    private final PostService postService;

    private final UserService userService;
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    public void post(PostRequestDto postRequest) {
        String author = postRequest.getAuthor();
        String content = postRequest.getContent();
        User user = this.userService.findByName(author);
        this.postService.post(user, content);
    }

}
