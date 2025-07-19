import com.example.demo.HelloController;
import com.myserver.framework.Router;
import com.myserver.server.BhaiServer;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Router router = new Router();
        router.registerControllers(List.of(
                HelloController.class
        ));

        BhaiServer bhaiServer = new BhaiServer(8088, 10, router);
        bhaiServer.start();
    }
}
