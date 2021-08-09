package kr.ac.gwnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//자동설정, 스프링 Bean 읽기와 생성이 모두 자동 생성 됨
@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

}
