package com.siva.security.app.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SivaUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public SivaUserDetailsService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(username);
        if ( user == null){
            throw new UsernameNotFoundException("User is not found:"+ username);

        }
        return new UserPrincipal(user);
    }
}
