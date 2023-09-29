package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.HelloService;


@RestController
public class Hello {


    @Autowired
    public HelloService helloService;

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World Get " + helloService.quantidadeGets() + " (=======) " +
       "Hello World Post " + helloService.quantidadePosts() + " (=======) " +
       "Hello World Put " + helloService.quantidadePuts() + " (=======) " +
       "Hello World Delete " + helloService.quantidadeDeletes() + " (======) ";
    }

    @PostMapping("/hello")
    public String postHelloPost1(){
        return "Hello World Post " + helloService.quantidadePosts();
    }

    @PutMapping("/hello")
    public String postHelloPost2(){
        return "Hello World Put " + helloService.quantidadePuts();
    }

    @DeleteMapping("/hello")
    public String postHelloPost3(){
        return "Hello World Delete " + helloService.quantidadeDeletes();
    }
}