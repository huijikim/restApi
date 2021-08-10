package kr.ac.gwnu.model;

import lombok.*;
import org.apache.ibatis.javassist.runtime.Inner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
//클래스에 존재하는 모든 필드에 대한 생성자를 자동 생성
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Teacher {

    @Id
    @GeneratedValue
    private String id;
    private String email;
    private ArrayList<Student> studentArrayList = new ArrayList<>();
}