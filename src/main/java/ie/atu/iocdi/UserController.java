package ie.atu.iocdi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService  userService;

    @Autowired
    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping ("/registerUser/{name}/{email}")
    public ResponseEntity<String> registerUser (@PathVariable String name, @PathVariable String email){

        User user = new  User();
        user.setEmail(email);
        user.setName(name);
        boolean registrationSuccessful = userService.registerUser(user);

        if (registrationSuccessful) {
            return ResponseEntity.ok("Registration Successful");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration Unsuccessful");

        }

    }


}
