package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    @GetMapping(value="/getDemoVO/{name}")
    public @ResponseBody DemoVO getDemoVO(@PathVariable String name){
        return new DemoVO(name, 99);
    }
}
