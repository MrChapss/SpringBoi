package typeshi.SpringBooty.controller;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import typeshi.SpringBooty.service.TestInterface;

@RestController
public class TestController {
	private final TestInterface service1;
	private final TestInterface service2;
	
	@Autowired
	public TestController (
			@Qualifier("CRUDService") TestInterface service1,
			@Qualifier("TestService") TestInterface service2
			) {
		this.service1=service1;
		this.service2=service2;
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
	
}
