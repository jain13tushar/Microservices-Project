package com.microservice.user.controller;

import com.microservice.user.VO.ResponseTemplateVO;
import com.microservice.user.entity.User;
import com.microservice.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// @RestController is a specialized version of the controller.
// It includes the @Controller and @ResponseBody annotations,
// and as a result, simplifies the controller implementation
@RestController

// To configure the mapping of web requests, RequestMapping annotation is used.
// This annotation can be applied to class-level and/or method-level in a controller.
// The class-level annotation maps a specific request path or pattern onto a controller.
// We can apply additional method-level annotations to make mappings more specific to handler methods.
@RequestMapping("/users")
@Slf4j
public class UserController {

    // @Autowired is one of the key annotation in annotation based Dependency Injection.
    // Spring provides the @Autowired annotation to discover the beans automatically and
    // inject collaborating beans (other associated dependent beans) into our bean.
    @Autowired
    private UserService userService;

    // @PostMapping is a specialized version of @RequestMapping annotation that acts as a shortcut
    // for @RequestMapping(method = RequestMethod.POST).
    // @PostMapping annotated methods handle the HTTP POST requests matched with given URI expression.
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    // @GetMapping is a specialized version of @RequestMapping annotation that acts
    // as a shortcut for @RequestMapping(method = RequestMethod.GET).
    // @GetMapping annotated methods handle the HTTP GET requests matched with given URI expression.
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
