package com.security.Security.repository;

import com.security.Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
      User findByUsername(String username);
}
