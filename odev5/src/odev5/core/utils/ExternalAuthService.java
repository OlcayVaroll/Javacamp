package odev5.core.utils;

import odev5.entities.concretes.LoginDto;
import odev5.entities.concretes.User;

public interface ExternalAuthService {
	
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);

}
