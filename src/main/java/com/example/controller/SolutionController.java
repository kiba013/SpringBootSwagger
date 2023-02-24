package com.example.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@Api(value = "Solution Controller", description = "API for Solution Controller")
public class SolutionController {


    @GetMapping("/hello")
    @ApiOperation(value = "Get string")
    public String getExample() {
        return "Hello World!";
    }
}
