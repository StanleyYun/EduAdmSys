package com.qifangli.edumanage.dao.mapper;

import com.qifangli.edumanage.dao.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
//   @Select("select stu_no,stu_name from tbl_student")
   List<Student> getStudent();
}

