package ie.atu.iocdi;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final EmailService emailService;
    private List<User> UserRepository = new ArrayList<>();

    public boolean registerUser(User user){
        if (!isEmailRegistered(user.getEmail())){
            UserRepository.add(user);
            return true;
        }
        else
        {
            return false;
        }

        private boolean isEmailRegistered(String email){
            return UserRepository.stream().anyMatch(u -> u.getEmail().equals(email));
        }
    }
}
