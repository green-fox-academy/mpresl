package HelloDIproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorld implements CommandLineRunner {

    private final Printer printer;

    @Autowired
    public HelloBeanWorld(Printer printer){
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloBeanWorld.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("What up Baby?");
    }
}
