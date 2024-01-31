package com.sunabse.CustomerApplication.repo;


import com.sunabse.CustomerApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepo extends JpaRepository<User,Long> {
    public Optional<User> findByEmail(String email);

}
