package pl.coderslab.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @GetMapping("/")
    public String index() {
        return "start";
    }

//    @GetMapping("/")
//    @ResponseBody
//    public String home() { return "home"; }

    @GetMapping("/admin")
    public String admin() { return "admin"; }
}

