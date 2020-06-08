package com.example.postgresdemo.repository;

import com.example.postgresdemo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
