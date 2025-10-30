package kr.co.ch07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @PostMapping("/user/hello")
    public String hello(@RequestBody Map<String, String> req){
        String name = req.get("name");
        return "hello "+name+ "!!!";
    }
}
