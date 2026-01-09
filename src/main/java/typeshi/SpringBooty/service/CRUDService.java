package typeshi.SpringBooty.service;
import org.springframework.stereotype.Service;

@Service
public class CRUDService implements TestInterface {
	public int addNum(int num1, int num2) {
		return num1 + num2;
	}
	
	public String minusNum(int a, int b) {
		return "The result is " + a + b;
	}
	
	public String hi(String name) {
		return "Hello, " + name;
	}
	
	public String hello(String word) {
		return word;
	}
}
