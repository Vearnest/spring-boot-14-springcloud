package au.com.charles.springboot.provider.service;

import org.springframework.stereotype.Service;

/**
 * @author Charles Dai
 * @create 2020-01-03 10:35
 **/
@Service
public class TicketService {

    public String getTicket() {
        return "The Lord of the Rings";
    }

}
