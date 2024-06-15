package com.example.School_Portal.controller;


import com.example.School_Portal.model.studentEntity;
import com.example.School_Portal.model.teacherEntity;
import com.example.School_Portal.service.teacherServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/teacherentity")
public class teacherEntityController {

    @Autowired
    private teacherServiceImpl teacherserviceimpl;
    private static final Logger logger = LoggerFactory.getLogger(teacherEntityController.class);

    @PostMapping("/create")
    public ResponseEntity<teacherEntity> createStudentEntity(@RequestBody teacherEntity teacherentity)
    {
        teacherEntity theteacherentity = teacherserviceimpl.createTeacher(teacherentity);
        return new ResponseEntity<>(theteacherentity, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<teacherEntity> getStudentEntity(@PathVariable("id") Long id)
    {
        try {
            teacherEntity theteacherentity = teacherserviceimpl.getTeacherEntityById(id);
            if (theteacherentity != null) {
                return new ResponseEntity<>(theteacherentity, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
        catch (Exception e) {
            logger.error("Error occurred while fetching teacher entity: ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/all")
    public ResponseEntity<List<teacherEntity>> getallTeacherEntity()
    {
        try {
            List<teacherEntity> teacherentities = teacherserviceimpl.getallteacher();

            if (!teacherentities.isEmpty()) {
                return new ResponseEntity<>(teacherentities, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            logger.error("Error occurred while fetching teacher entities: ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
