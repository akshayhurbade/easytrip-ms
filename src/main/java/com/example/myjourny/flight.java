package com.example.myjourny;

import org.springframework.web.bind.annotation.GetMapping;

public class flight {
    @GetMapping("/myflight")
    public String getData(){
        return "Please book your tickrt";
    }
}