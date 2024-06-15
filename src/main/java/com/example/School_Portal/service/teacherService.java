package com.example.School_Portal.service;

import com.example.School_Portal.model.teacherEntity;

import java.util.List;

public interface teacherService {
    teacherEntity createTeacher(teacherEntity teacherentity);
    teacherEntity getTeacherEntityById(Long id);
    teacherEntity updateStudentById(Long id, teacherEntity teacherentity);
    List<teacherEntity> getallteacher();
    void deleteteacherEntity(Long id);
}
