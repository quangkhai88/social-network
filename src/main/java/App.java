import network.controller.*;
import network.infra.database.FollowRepositoryImpl;
import network.infra.database.PostRepositoryImpl;
import network.infra.database.UserRepositoryImpl;
import network.service.FollowServiceImpl;
import network.service.PostServiceImpl;
import network.service.UserServiceImpl;
import network.service.WallServiceImpl;

public class App {
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );


        // done by Spring boot
        UserController userController = new UserController(new UserServiceImpl(new UserRepositoryImpl()));
        PostController postController = new PostController(new PostServiceImpl(new PostRepositoryImpl()), new UserServiceImpl(new UserRepositoryImpl()));
        FollowController followController = new FollowController(new FollowServiceImpl(new FollowRepositoryImpl()), new UserServiceImpl(new UserRepositoryImpl()));
        WallController wallController = new WallController(new UserServiceImpl(new UserRepositoryImpl()),
                                                            new WallServiceImpl(new PostRepositoryImpl(), new FollowRepositoryImpl()));
        userController.createUser("Alice");
        userController.createUser("Bob");
        postController.post(new PostRequestDto("Alice", "Hello World"));
        Thread.sleep(1000);
        postController.post(new PostRequestDto("Bob", "I am Bob"));

        Thread.sleep(1000);
        wallController.getWallOf("Alice").print();
        wallController.getWallOf("Bob").print();

        followController.follow(new FollowRequestDto("Alice", "Bob"));
        wallController.getWallOf("Alice").print();
        wallController.getWallOf("Bob").print();

        followController.unfollow(new FollowRequestDto("Alice", "Bob"));
        postController.post(new PostRequestDto("Alice", "Message of Alice"));
        wallController.getWallOf("Alice").print();
        wallController.getWallOf("Bob").print();

    }
}
