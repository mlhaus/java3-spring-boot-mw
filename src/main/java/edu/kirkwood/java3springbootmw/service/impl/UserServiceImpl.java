package edu.kirkwood.java3springbootmw.service.impl;

import edu.kirkwood.java3springbootmw.model.User;
import edu.kirkwood.java3springbootmw.repository.RoleRepository;
import edu.kirkwood.java3springbootmw.repository.UserRepository;
import edu.kirkwood.java3springbootmw.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
    
    public User registerNewUser(User user) {
        // Hash the user's password
        // Default the user's default role
        // Save the user's data
        return userRepository.save(user);
    }
}
