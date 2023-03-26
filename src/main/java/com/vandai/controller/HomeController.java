package com.vandai.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class HomeController {
    @GetMapping("{id}")
    public String pathVariable(@PathVariable String id) {
        return "Path variable " + id;
    }

    @GetMapping("requestParam")
    public String pathVariable(@RequestParam String id,
                               @RequestParam(name = "email", required = false, defaultValue = "") String email) {
        return "Path variable " + id + email;
    }


}
