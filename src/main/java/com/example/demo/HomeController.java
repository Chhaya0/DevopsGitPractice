package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/demo")
    public String demo() {
        return "index"; // This assumes "index.html" is in the static folder
    }
}
