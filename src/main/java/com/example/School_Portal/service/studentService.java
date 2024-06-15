package com.example.School_Portal.service;

import com.example.School_Portal.model.studentEntity;

import java.util.List;

public interface studentService {

    studentEntity createStudent(studentEntity studententity);
    studentEntity getStudentEntityById(Long id);
//    studentEntity updateStudentById(Long id, studentEntity studententity);
    List<studentEntity> getallstudent();
     void deleteStudentEntity(Long id);

}
