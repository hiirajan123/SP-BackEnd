package com.example.School_Portal.repository;

import com.example.School_Portal.model.teacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface teacherEntityRepository extends JpaRepository<teacherEntity, Long> {
}
