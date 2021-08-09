package kr.ac.gwnu.model;

import lombok.*;

//파라미터가 없는 생성자를 생성
//@NoArgsConstructor
//클래스에 존재하는 모든 필드에 대한 생성자를 자동 생성
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private String id;
    private String email;
    private Integer age;

//    Teacher t = new Teacher();
//    Teacher.Outer outer = t.new Outer();
//    Teacher.Outer a = new Teacher().new Outer();

}
