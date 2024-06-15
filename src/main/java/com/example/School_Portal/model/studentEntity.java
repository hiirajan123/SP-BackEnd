package com.example.School_Portal.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class studentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String roll_no;
    private long classname;
    private String mother_name;
    private String father_name;
    private String age;
    private String mobile_number;
    private String parentEmailId;
    private String address;
    private String dateofBirth;
}
