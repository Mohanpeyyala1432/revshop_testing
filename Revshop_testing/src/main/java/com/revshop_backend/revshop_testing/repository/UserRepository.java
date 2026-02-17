package com.revshop_backend.revshop_testing.repository;

import com.revshop_backend.revshop_testing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
