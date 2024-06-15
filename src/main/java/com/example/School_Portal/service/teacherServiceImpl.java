package com.example.School_Portal.service;

import com.example.School_Portal.model.teacherEntity;
import com.example.School_Portal.repository.teacherEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class teacherServiceImpl implements teacherService{

    @Autowired
    private teacherEntityRepository teacherentityrepository;

    @Override
    public teacherEntity createTeacher(teacherEntity teacherentity) {
           return teacherentityrepository.save(teacherentity);
    }

    @Override
    public teacherEntity getTeacherEntityById(Long id) {
        return teacherentityrepository.findById(id).orElse(null);
    }

    @Override
    public teacherEntity updateStudentById(Long id, teacherEntity teacherentity) {
        return null;
    }

    @Override
    public List<teacherEntity> getallteacher() {
        return teacherentityrepository.findAll();
    }

    @Override
    public void deleteteacherEntity(Long id) {
        teacherEntity theteacherentity = teacherentityrepository.findById(id).orElse(null);
        if(theteacherentity!=null)
        {
            teacherentityrepository.deleteById(id);
        }
    }
}
