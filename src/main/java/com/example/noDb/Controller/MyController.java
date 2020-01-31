package com.example.noDb.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/cool")

public class MyController {
	
	/* @ResponseBody */
	@GetMapping("/get")
	public String myMethod()
	{
		System.out.println("inside get");
		return "hello gubal";
	}
	
	@PostMapping("/post")
	public String myMethod1() {
		System.out.println("inside post");
		return "hello again";
	}

}
