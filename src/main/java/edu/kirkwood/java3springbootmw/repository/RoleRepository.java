package edu.kirkwood.java3springbootmw.repository;

import edu.kirkwood.java3springbootmw.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(String name);
}
