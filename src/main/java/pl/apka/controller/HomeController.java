package pl.apka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.apka.model.Person;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
       model.addAttribute("person",new Person());
        return "index";
    }

}