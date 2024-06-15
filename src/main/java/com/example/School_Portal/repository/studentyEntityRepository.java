package com.example.School_Portal.repository;

import com.example.School_Portal.model.studentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentyEntityRepository extends JpaRepository<studentEntity, Long> {
}
