package com.siva.security.app.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements UserDetails {

    private UserRepository userRepository;

    public UserDetailsService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    
}
