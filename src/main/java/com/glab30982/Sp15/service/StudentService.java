package com.glab30982.Sp15.service;

import com.glab30982.Sp15.dto.StudentDto;
import com.glab30982.Sp15.model.Student;
import com.glab30982.Sp15.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();

}
