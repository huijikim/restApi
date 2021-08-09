package kr.ac.gwnu.model;

import lombok.*;
import org.apache.ibatis.javassist.runtime.Inner;

import java.util.List;

@NoArgsConstructor
//클래스에 존재하는 모든 필드에 대한 생성자를 자동 생성
@AllArgsConstructor
@Getter
@Setter
public class Teacher {
    private String id;
    private String email;
    List<Student> students;


//    public class Outer{
//        Student student;
//        public Outer(){
//            Student student;
//        }
//    }

}