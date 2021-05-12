package br.com.vvaug.continuousdeliverytesting.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/environment")
public class EnvironmentResource {

	@Value("${env}")
	private String environment;
	
	@GetMapping
	public ResponseEntity<?> get(){
		return ResponseEntity.ok(new Object() {
			public String environment = EnvironmentResource.this.environment;
		});
	}
}
