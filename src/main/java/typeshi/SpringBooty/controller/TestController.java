package typeshi.SpringBooty.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import typeshi.SpringBooty.service.TestInterface;

@RestController
public class TestController {
	private final TestInterface service;
	
	@Autowired
	public TestController (TestInterface service) {
		this.service=service;
	}
	
	@GetMapping("/hello")
	public String hello(String name) {
		return service.hello("Hi, " + name);
	}
	
	@GetMapping("/sup")
	public String test(@RequestParam String name) {
		return service.hi(name);
	}
	
	@GetMapping("/tumesting/{num1}/{num2}")
	public String dota(@PathVariable int num1,
					   @PathVariable int num2) {
		return service.minusNum(num1, num2);
	}
	
	
}
