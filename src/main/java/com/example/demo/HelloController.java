package com.example.demo;

import com.myserver.annotations.*;
import com.myserver.http.BhaiPlease;
import com.myserver.http.BhaiMila;

import java.io.IOException;

@BhaiControl
public class HelloController {

    @BhaiDe("/hello")
    public void hello(BhaiPlease request, BhaiMila response) throws IOException {
        System.out.println("Inside user controller: Hello!");
        String name = request.getQueryParam("name");
        response.bhaiBhejDe(200, "Hi " + (name != null ? name : "Bhai"));
    }

    @BhaiLe("/echo")
    public void submit(BhaiPlease request, BhaiMila response) throws IOException {
        System.out.println("Inside POST handler");
        response.bhaiBhejDe(200, "You sent: " + request.getBody());
    }
}
