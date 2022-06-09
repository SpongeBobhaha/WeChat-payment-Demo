package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags="product management")
@RestController
@RequestMapping(value="/api/product")
public class ProductController {

    @ApiOperation("test interface")
    @GetMapping(value="/test")
    public String test(){

        return "hello";
    }
}
