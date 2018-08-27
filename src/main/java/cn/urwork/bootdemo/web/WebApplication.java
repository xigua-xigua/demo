package cn.urwork.bootdemo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.executable.ValidateOnExecution;
import java.util.HashMap;

@RestController
@SpringBootApplication
public class WebApplication {

    @Value("${book.author}")
    private String author;
    @Value("${book.name}")
    private String name;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

//	@RequestMapping("/")
	@GetMapping("/")
	String index() {
		return "Hello Spring Boot";
	}

	@RequestMapping("/rest")
	@ResponseBody
	public HashMap<String, Object> rest() {
		HashMap<String, Object> m = new HashMap<String, Object>();
		m.put("1", "A");
		m.put("2", "B");

		return m;
	}

}