package odev5.business.abstracts;

import odev5.entities.concretes.LoginDto;
import odev5.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);

}
