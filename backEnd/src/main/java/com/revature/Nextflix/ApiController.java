package com.revature.Nextflix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api")
    public Movie api() {
        return restTemplate.getForObject("http://localhost:8081/arists/1", Movie.class);
    }
}
