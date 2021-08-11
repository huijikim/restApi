package kr.ac.gwnu.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@NoArgsConstructor
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