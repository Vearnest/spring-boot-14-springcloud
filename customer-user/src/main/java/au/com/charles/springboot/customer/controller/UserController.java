package au.com.charles.springboot.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Charles Dai
 * @create 2020-01-03 11:04
 **/
@RestController
public class UserController {

    RestTemplate restTemplate;

    public UserController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/buy")
    public String buy(String name) {
        String ticket = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name + " bought a " + ticket;
    }

}
