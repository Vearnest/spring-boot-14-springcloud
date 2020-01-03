package au.com.charles.springboot.provider.controller;

import au.com.charles.springboot.provider.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charles Dai
 * @create 2020-01-03 10:38
 **/
@RestController
public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/ticket")
    public String ticket() {
        System.out.println(8001);
        return ticketService.getTicket();
    }

}
