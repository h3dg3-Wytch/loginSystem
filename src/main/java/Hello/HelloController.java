package Hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by h3dg3wytch on 8/22/16.
 */
@Controller
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired private UserRepository userRepository;

    @RequestMapping("/")
    public String helloWorldGet(Model model){
        User user = new User("Hello", "World");
        userRepository.save(user);
        for(User world: userRepository.findByLastName("World")){
            System.out.println(world.toString());
        }
        return "home";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
