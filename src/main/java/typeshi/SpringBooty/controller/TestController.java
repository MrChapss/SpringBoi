package typeshi.SpringBooty.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {
	
	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello, " + name;
	}
	
	@GetMapping("/hello/hi")
	public String what(String name) {
		return "What?! the " + name;
	}
	
	@GetMapping("/sup")
	public int baliw(@RequestParam (required = false, defaultValue = "0") int num) {
		return num;
	}
}
