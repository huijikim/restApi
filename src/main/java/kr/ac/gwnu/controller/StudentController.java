//package kr.ac.gwnu.controller;
//
//import kr.ac.gwnu.model.Student;
//import kr.ac.gwnu.service.MemberService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/student")
//public class StudentController {
//
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    //의존관계를 자동으로 설정할 때 사용
//    @Autowired
//    private MemberService memberService;
//
//    @RequestMapping(value = "/register", method = RequestMethod.POST) //RequestMapping은 http 전송 방식
//    @ResponseBody //@ResponseBody - 자바객체를 응답 몸체로 변환하기 위해
//
//    public void register(@RequestBody List<Student> student) {  //@RequestBody - 요청 몸체를 자바 객체로 변환
//
//        try {
//            memberService.registerStudent(student);
//        } catch (Exception e) {
//            logger.debug(e.getMessage(), e);
//            logger.debug("cannot register to registerStudent!!");
//        }
//
//    }
//}