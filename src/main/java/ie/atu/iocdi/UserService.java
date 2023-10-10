package ie.atu.iocdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private EmailService emailService;
    @Autowired
    public UserService(EmailService emailService)
    {
        this.emailService = emailService;
    }
    public void registerUser(String username,String email){
        emailService.SendEmail(email,"Email test");
    }
}

