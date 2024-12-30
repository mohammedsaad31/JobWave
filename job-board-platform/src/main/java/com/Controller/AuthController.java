package com.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        //TODo process POST request
        
    if ("user".equals(request.getUsername( ))&&"password".equals(request.getPassword()))
                {
            return "login successfull!";
                }
            else {
                return "invalid Credentials";
            }
        }
    }
    
