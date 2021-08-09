package kr.ac.gwnu.mapper;

import kr.ac.gwnu.model.Student;
import kr.ac.gwnu.model.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@Entity
public interface MemberMapper {

    void insertStudents(List<Student> student);

    void insertTeacher(Teacher teacher);

    void selectStudent(List<Student> student);

    void countStudent(List<Student> student);

    boolean existsStudent(List<Student> student);

    boolean existsTeacher(Teacher teacher);


}
