package typeshi.SpringBooty.service;
import org.springframework.stereotype.Service;

@Service("TestService")
public class Student implements TestInterface {
	
	public boolean signUp(String a, String b) {
		if (a.equals(b)) {
			return false;
		}
		return true;
	}
	
	public boolean login(String a, String b) {
		if (!a.equals(b)) {
			return false;
		}
		return true;
	}
}
