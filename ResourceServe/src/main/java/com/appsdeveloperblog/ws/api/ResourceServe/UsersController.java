package com.appsdeveloperblog.ws.api.ResourceServe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@EnableW
public class UsersController {

    @GetMapping("/status/check")
    public String status(){
        return "Working...";
    }


}
