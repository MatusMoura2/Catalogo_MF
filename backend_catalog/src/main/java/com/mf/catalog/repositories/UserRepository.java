package com.mf.catalog.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mf.catalog.entities.Crochet;
import com.mf.catalog.entities.User;

public interface UserRepository extends JpaRepository<User, UUID>{

}
