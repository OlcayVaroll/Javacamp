package odev5.business.concretes;

import odev5.business.abstracts.AuthService;

import odev5.business.abstracts.UserService;
import odev5.core.utils.Utils;
import odev5.entities.concretes.LoginDto;
import odev5.entities.concretes.User;

public class AuthManager implements AuthService {
	private UserService userService;
	

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(userValidate(user) 
				&& passwordValidate(user.getPassword()) 
				&& !userExists(user.getePosta()) == false 
				&& Utils.emailValidate(user.getePosta())) 
		{
			userService.add(user);	
		}
		else {
			System.out.println("Kay�t ba�ar�s�z");
		}
		
	}
	

	@Override
	public void verify(User user, String token) {
		if(user!=null && token.length()>15) {
			User existUser = userService.get(user.getePosta());
			existUser.setVerify(true);
			
			userService.update(existUser);
			System.out.println("email do�ruland�");
		}
		else {
			System.out.println("email do�rulanamad�");
		}
		
	}

	@Override
	public boolean userExists(String email) {
		if(userService.get(email)!=null) {
			return true;
		}
		
		System.out.println("email zaten mevcut.");
		
		return false;
	}

	@Override
	public void login(LoginDto dto) {
		User user=userService.get(dto.getEmail());
		
		if(user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("ba�ar�yla giri� yapt�n�z.");
		}
		else {
		System.out.println("kullan�c� ad� ve �ifren yanl��");
		}
	}

	public boolean userValidate(User user) {
		boolean isValid = false;
		
		if(user!=null 
				&& !user.getLastName().isEmpty()
				&& !user.getFirstName().isEmpty()
				&& !user.getePosta().isEmpty()
				&& !user.getPassword().isEmpty()) {
			return true;	
		}
		System.out.println("Bo� alan b�rakmay�n�z.");
		
		return false;
		
	}
	
	public boolean passwordValidate(String password) {
		if(password.length()>=6) {
			return true;
		}
		System.out.println("�ifreniz 6 karakterden uzun olmal�d�r. ");
		
		return false;
	}
	

}
