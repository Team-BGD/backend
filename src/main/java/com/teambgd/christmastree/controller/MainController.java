package com.teambgd.christmastree.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "hello~ merry christmas!!";
    }
}
