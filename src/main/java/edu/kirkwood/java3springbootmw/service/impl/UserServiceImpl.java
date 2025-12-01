package edu.kirkwood.java3springbootmw.service.impl;

import edu.kirkwood.java3springbootmw.model.Role;
import edu.kirkwood.java3springbootmw.model.User;
import edu.kirkwood.java3springbootmw.repository.RoleRepository;
import edu.kirkwood.java3springbootmw.repository.UserRepository;
import edu.kirkwood.java3springbootmw.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    public User registerNewUser(User user) {
        // Hash the user's password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        // Default the user's default role
        Role studentRole = roleRepository.findByName("STUDENT").orElseThrow(() -> new RuntimeException("Student Role Not Found"));
        Set<Role> roles = new HashSet<>();
        roles.add(studentRole);
        user.setRoles(roles);
        // Save the user's data
        return userRepository.save(user);
    }
}
