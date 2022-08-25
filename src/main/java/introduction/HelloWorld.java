package introduction;

import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String [ ] args) {
        System.out.println("Hello World");

        Logger log = Logger.getLogger("name");
        log.info("message");
    }
}