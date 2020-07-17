package snippet.hello;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/hello")
	public String sayHi() {
		
		return "This is my first Spring Boot Application";
	}
	
	
	

}

