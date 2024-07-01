package se.norrwing.policeapi.security.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DefaultUser {

    @PostConstruct
    public void defaultAdminUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<GrantedAuthority> authorities = authentication.getAuthorities();
        User user = new User("EricN", "Eric", "ADMIN");
    }


}
