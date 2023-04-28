/**
 * 
 */
package com.personal.projects.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shayn
 * Should serve as a demo to print out Hello World
 */

@RestController
public class HelloWorldController {
	
	@PostMapping("/")
	String home() {
		return "Hello world";
		
	}
	

    @GetMapping("/test")
    // @ResponseBody tells Spring Web to put the return value into the HTTP response body
    public /* @ResponseBody */ String getTest() {
        return "GET /test invoked";
    }

    @PostMapping("/test2")
    public String postTest() {
        return "POST /test2 invoked";
    }

    @DeleteMapping("/test3")
    public String deleteTest() {
        return "DELETE /test3 invoked";
    }

    @PutMapping("/test4")
    public String putTest() {
        return "PUT /test4 invoked";
    }

}
