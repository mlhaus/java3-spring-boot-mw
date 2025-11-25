package edu.kirkwood.java3springbootmw.service;

import edu.kirkwood.java3springbootmw.model.User;

public interface UserService {
    /**
     * Handles business logic for registering a new user(password hashing, role assignments)
     * @param user The User object containing new user details.
     * @return The saved User object
     */
    User registerNewUser(User user);
}
