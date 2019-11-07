package hu.kacsandi.apps.infosystembuild.service;

import hu.kacsandi.apps.infosystembuild.db.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.getAllUser(new user);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyUserPrincital(user);
    }
}
