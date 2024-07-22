package se.norrwing.policeapi.security.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import se.norrwing.policeapi.security.service.UserService;

@Service
public class DefaultUser {

    private final UserService userService;

    public DefaultUser(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void defaultAdminUser() {
        //Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //Collection<GrantedAuthority> authorities = authentication.getAuthorities();
        User user = new User("EricN", "Eric", "ADMIN");


    }


}
