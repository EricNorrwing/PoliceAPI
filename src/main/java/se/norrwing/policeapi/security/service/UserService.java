package se.norrwing.policeapi.security.service;

import org.springframework.security.core.userdetails.User;

public interface UserService {
    User getUserByUsername(String username);
}
