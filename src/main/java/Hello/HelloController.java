package Hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by h3dg3wytch on 8/22/16.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String helloWorldGet(Model model){
        return "hello";
    }

}
