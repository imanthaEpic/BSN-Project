package com.osh.devhub.booknetwork.auth;

import com.osh.devhub.booknetwork.role.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private RoleRepository roleRepository;

    public void register(RegistrationRequest request) {
        var userRole = roleRepository.findByName("USER");
    }
}
