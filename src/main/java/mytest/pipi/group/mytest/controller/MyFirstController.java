package mytest.pipi.group.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyFirstController {
    @RequestMapping("/hello")
    public String myhello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        //////2132132
        return "hello";
    }
}
