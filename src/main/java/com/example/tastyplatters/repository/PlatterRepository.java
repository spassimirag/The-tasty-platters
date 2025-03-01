package com.example.tastyplatters.repository;

import com.example.tastyplatters.domain.PlatterEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatterRepository extends JpaRepository<PlatterEntity, Integer> {

}





