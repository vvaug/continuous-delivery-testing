package br.com.vvaug.continuousdeliverytesting.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/greetings")
public class GreetingResource {
	
	@GetMapping
	public ResponseEntity<?> get() {
		return ResponseEntity.ok(new Object(){ 
			 public String content = "Hello World!";
			}
		);
	}
}
