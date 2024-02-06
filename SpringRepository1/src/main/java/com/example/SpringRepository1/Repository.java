package com.example.SpringRepository1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Car, Long> {
}
