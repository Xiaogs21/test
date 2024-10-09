package com.xgs.dao;

import com.xgs.entity.Student;

import java.util.List;

public interface StudentDao {
//    查询所有
    List<Student> findAll ();
//     根据名称查询
    Student findByName (String name);

}
