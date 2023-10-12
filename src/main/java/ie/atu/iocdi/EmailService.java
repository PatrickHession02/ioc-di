package ie.atu.iocdi;


import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void SendEmail(String to, String message){
        System.out.println(to+ " "+ message);
    }
}