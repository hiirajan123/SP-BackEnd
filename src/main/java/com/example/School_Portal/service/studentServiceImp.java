package com.example.School_Portal.service;

import com.example.School_Portal.model.studentEntity;
import com.example.School_Portal.repository.studentyEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class studentServiceImp implements studentService {

    @Autowired
    private studentyEntityRepository studententityrepository;

    @Override
    public studentEntity createStudent(studentEntity studententity) {
        return studententityrepository.save(studententity);
    }

    @Override
    public studentEntity getStudentEntityById(Long id) {
        return studententityrepository.findById(id).orElse(null);
    }

//   @Override
//    public studentEntity updateStudentById(Long id, studentEntity studententity) {
//        studentEntity  thestudententity = studententityrepository.findById(id).orElse(null);
//        thestudententity.set
//       return studententityrepository.save(thestudententity);
//    }

    @Override
    public List<studentEntity> getallstudent() {
        return studententityrepository.findAll();
    }

    @Override
    public void deleteStudentEntity(Long id) {
           studententityrepository.deleteById(id);
    }
}
