package typeshi.SpringBooty.controller;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import jdk.incubator.vector.VectorOperators.Test;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import typeshi.SpringBooty.service.TestInterface;
import typeshi.SpringBooty.service.TestHashMap;
@RestController
public class TestController {
	private final TestInterface service1;
	private final TestInterface service2;
	private final TestHashMap test1;
	
	@Autowired
	public TestController (
			@Qualifier("CRUDService") TestInterface service1,
			@Qualifier("TestService") TestInterface service2,
			@Qualifier("TestHashMap") TestHashMap test1
			) {
		this.service1=service1;
		this.service2=service2;
		this.test1=test1;
	}
	
	@GetMapping("/login")
	public boolean login(@RequestParam String name,
						 @RequestParam String password) {
		return service1.login(name, password);
	}
	
	@GetMapping("/signUp")
	public boolean signUp(@RequestParam String name,
						  @RequestParam String password) {
		return service2.signUp(name, password);
	}
	
	@GetMapping("/test")
	public void test() {
		test1.test();
	}
	
	@GetMapping("/test2")
	public void test2() {
		// will add constrainant and how to use the h2 and jpa to connect db
	}
	
}
