package com.example.School_Portal.controller;

import com.example.School_Portal.model.studentEntity;
import com.example.School_Portal.service.studentServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/studententity")
public class studentEntityController {

    @Autowired
    private studentServiceImp studentserviceimp;
    private static final Logger logger = LoggerFactory.getLogger(studentEntityController.class);

    @PostMapping("/create")
    public ResponseEntity<studentEntity> createStudentEntity(@RequestBody studentEntity studententity)
    {
        studentEntity thestudententity = studentserviceimp.createStudent(studententity);
        return new ResponseEntity<>(thestudententity, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<studentEntity> getStudentEntity(@PathVariable("id") Long id)
    {
        try {
            studentEntity thestudententity = studentserviceimp.getStudentEntityById(id);
            if (thestudententity != null) {
                return new ResponseEntity<>(thestudententity, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
        catch (Exception e) {
            logger.error("Error occurred while fetching student entity: ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/all")
    public ResponseEntity<List<studentEntity>> getallStudentEntity()
    {
    try {
        List<studentEntity> studentEntities = studentserviceimp.getallstudent();

        if (!studentEntities.isEmpty()) {
            return new ResponseEntity<>(studentEntities, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    } catch (Exception e) {
        logger.error("Error occurred while fetching student entities: ", e);
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
     @DeleteMapping("/{id}")
     public void deleteStudentEntity(@PathVariable("id") Long id)
     {
         studentEntity thestudententity = studentserviceimp.getStudentEntityById(id);
         if(thestudententity!=null) studentserviceimp.deleteStudentEntity(id);
     }

}
