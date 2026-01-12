package typeshi.SpringBooty.service;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import java.util.Scanner;

@Service("TestHashMap")
public class TestHashMap {
	HashMap<String, String> acc = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);
	
	public void test() {
		for (int i=1; i<=3; i++) {
			System.out.print("Enter you username: ");
			String username = sc.nextLine();
			
			System.out.print("Enter your password: ");
			String password = sc.nextLine();
			
			acc.put(username, password);
		}
		System.out.println(acc.keySet());
	}
	
}
