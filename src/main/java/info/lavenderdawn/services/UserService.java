package info.lavenderdawn.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import info.lavenderdawn.dto.UserRegistrationDto;
import info.lavenderdawn.entities.UserName;

public interface UserService extends UserDetailsService {

    UserName findByEmail(String email);

    UserName save(UserRegistrationDto registration);
}