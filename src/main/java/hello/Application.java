package hello;

import hello.domain.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by h3dg3wytch on 8/19/16.
 */

@SpringBootApplication
public class Application {

    @Autowired
    private static UserRepository repository;

    private static final Logger log = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }


}
