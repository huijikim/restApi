package kr.ac.gwnu.service;

import kr.ac.gwnu.model.Student;
import kr.ac.gwnu.mapper.MemberMapper;
import kr.ac.gwnu.model.Teacher;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MemberMapper memberMapper;

    public int getCount(){
        int result = 0;


        return result;

    }
    public boolean registerStudent(List<Student> student) {
        boolean result = false;

        try {
            if((memberMapper.existsStudent(student))) {
                throw new Exception("student id already exist");
            }else{
                memberMapper.insertStudents(student);
            }
            result = true;
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            logger.debug("registerStudent Exception");
        }

        return result;
    }



    public boolean registerTeacher(Teacher teacher){

        try {
            if((memberMapper.existsTeacher(teacher))) {
                throw new Exception("teacher id already exist");
            }else{
                memberMapper.insertTeacher(teacher);
            }
        }catch (Exception e){
            logger.debug(e.getMessage(), e);
            logger.debug("registerTeacher Exception");
        }

        return true;

    }
}
