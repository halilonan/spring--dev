package com.medipol.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedipolUserRestController {

    @Autowired
    private UserService userService;
    @Autowired
    private SingerService singerService;

    @RequestMapping(path = "/users")
    public List<User> findUsers() {

        return userService.findUsers();
    }

    @RequestMapping(path = "/addUser")
    public List<User> addUser(@RequestParam String name, @RequestParam String surName) {

        //  userService.addUser(name, surName);

        return userService.findUsers();
    }

    @RequestMapping(path = "/usersByName")
    public List<User> findUsersByName(@RequestParam String name) {
        System.out.println( "Disardan gonderilen deger : " + name );

        return userService.findUsersByName( name );
    }

    @RequestMapping(path = "/singers")

    public List<Singer> findSinger() {
        return singerService.findSinger();
    }

    @RequestMapping(path = "/addSinger")
    public List<Singer> addSinger(@RequestParam String name, @RequestParam String surName) {

        //  userService.addUser(name, surName);

        return singerService.findSinger();
    }

    @RequestMapping(path = "/usersById")
    public List<User> findUsersById(@RequestParam Long id) {
        System.out.println( "Disardan gonderilen deger : " + id );

        return userService.findUsersById( id );
    }

    @RequestMapping(path = "/singersById")
    public List<Singer> findSingersById(@RequestParam Long id) {
        System.out.println( "Disardan gonderilen deger : " + id );

        return singerService.findSingersById( id );
    }
}

