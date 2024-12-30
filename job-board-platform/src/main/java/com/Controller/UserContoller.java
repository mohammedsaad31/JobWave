package com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@SuppressWarnings("unused")
@RestController
@RequestMapping("/users")
public class UserContoller {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private List <User> users =new ArrayList();
    
@PostMapping("/create")
public String
createUser(@RequestBody User user){
    users.add(user);
    return "User ccreated sucessfully";
};
//Get all the users/retreivethem
@GetMapping("/all")
public List<User>getAllUsers()
{
    return users;
}
// getting them by username
@SuppressWarnings("unlikely-arg-type")
@GetMapping("/{Username}")
public User getUserByUsername(@PathVariable String username){
    return users.stream().filter(user ->user.equals(username)).findFirst().orElse(null);

}

}