package com.example.RegisterUser.repository;

import com.example.RegisterUser.model.RgUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RgRepository extends JpaRepository<RgUser, Integer> {
}
