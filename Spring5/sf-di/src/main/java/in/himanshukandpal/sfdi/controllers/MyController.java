package in.himanshukandpal.sfdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hi there.");
        return "Good day folks!";
    }
}