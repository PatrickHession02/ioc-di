package ie.atu.iocdi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }


    @GetMapping("/registerUser/{Name}/{Email}")
    public ResponseEntity<String> registerUser(@PathVariable String Name, @PathVariable String Email)
    {
        // Your registration logic here
        return null;
    }
}

