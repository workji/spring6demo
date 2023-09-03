package org.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path")
public class PathTestController {

    /* /path/{username}/{password}    */
    @RequestMapping(value = "/{username}/{password}/{something}")
    public String path1(@PathVariable(required = true) String username, @PathVariable String password, @PathVariable(value = "something") String pathKey) {
        return "username:" + username + " password:" + password + " pathKey:" + pathKey;
    }
}
