package au.com.charles.springboot.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerUserApplication.class, args);
    }

    @LoadBalanced // Enable load-balancing mode
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

