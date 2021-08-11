package kr.ac.gwnu.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;

//파라미터가 없는 생성자를 생성
@NoArgsConstructor
//클래스에 존재하는 모든 필드에 대한 생성자를 자동 생성
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private String id;
    private String email;
    private Integer age;

//    Teacher t = new Teacher();
//    Teacher.Outer outer = t.new Outer();
//    Teacher.Outer a = new Teacher().new Outer();

}
