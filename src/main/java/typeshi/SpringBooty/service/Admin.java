package typeshi.SpringBooty.service;
import org.springframework.stereotype.Service;

@Service("CRUDService")
public class Admin implements TestInterface {
	@Override
	public boolean signUp(String username, String password) {
		if (username.isBlank() || password.isBlank()) {
			return false;
		}
		if (username.equals("sigma")) {
			return false;
		}
		return true;
	}
	@Override
	public boolean login(String username, String password) {
		if (username.equals("sigma") && (password.equals("123"))) {
			return true;
		}
		return false;
	}
}
