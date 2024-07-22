package se.norrwing.policeapi.security.service;

import org.springframework.security.core.userdetails.User;
import se.norrwing.policeapi.database.repository.UserRepository;

public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User getUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
