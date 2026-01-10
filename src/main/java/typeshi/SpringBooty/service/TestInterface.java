package typeshi.SpringBooty.service;
// I will use the interface for menu for students and admin who have different function but similar use
public interface TestInterface {
	boolean login(String username, String password);
	boolean signUp(String username, String password);
}
