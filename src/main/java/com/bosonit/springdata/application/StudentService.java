package com.bosonit.springdata.application;

import com.bosonit.springdata.controller.dto.StudentInputDto;
import com.bosonit.springdata.controller.dto.StudentOutputDto;

import java.util.HashMap;

public interface StudentService {

    StudentOutputDto addStudent(StudentInputDto student);
    StudentOutputDto getStudentById(int id);
    void deleteStudentById( int id);
    Iterable<StudentOutputDto> getAllStudents(int pageNumber, int pageSize);
    StudentOutputDto updateStudent(StudentInputDto student);

    Iterable<StudentOutputDto> getAllStudentsByNameLike(String name);

    Iterable<StudentOutputDto> getAllStudentsByNameLikeJQPL(String name);

    Iterable<StudentOutputDto> getAllStudentsByNameLikeNative(String name);

}
