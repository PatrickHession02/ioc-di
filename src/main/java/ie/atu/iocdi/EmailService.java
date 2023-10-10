package ie.atu.iocdi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void SendEmail(String to, String message){
        System.out.println(to+ " "+ message);
    }
}