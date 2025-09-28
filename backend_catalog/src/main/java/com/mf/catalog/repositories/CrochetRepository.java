package com.mf.catalog.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mf.catalog.entities.Crochet;

public interface CrochetRepository extends JpaRepository<Crochet, UUID>{

}
