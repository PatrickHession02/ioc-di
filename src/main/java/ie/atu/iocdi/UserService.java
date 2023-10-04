package ie.atu.iocdi;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    private List<User> C = new ArrayList<>();

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
