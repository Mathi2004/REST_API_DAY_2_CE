package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_1 {
@Value("${name}")
private String name;
@GetMapping("/name2")
public String name()
{
	return name;
}
}
