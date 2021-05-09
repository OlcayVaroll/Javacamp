package odev5.business.concretes;

import java.util.Iterator;
import java.util.List;

import odev5.business.abstracts.UserService;
import odev5.core.utils.EmailService;
import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private EmailService emailService;
	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}
	@Override
	public void add(User user) {
		if(userValidate(user)) {
			userDao.add(user);
			emailService.send(user.getePosta(), "kayýt olumlu");
		}
		
	}
	@Override
	public void update(User user) {
		if(userValidate(user)) {
			userDao.update(user);
		}
		
		
	}
	@Override
	public void delete(int userId) {
		userDao.delete(userId);
	}
	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getId() +" "+ user.getePosta()+" "+user.getFullName());
		}
		return userDao.getAll();
	}
	@Override
	public User get(String email) {
		
		return userDao.get(email);
	}

	public boolean userValidate(User user) {
		if(user.getFirstName().length()>2&& user.getLastName().length()>2) {
			return true;
		}
		System.out.println("adýnýz ve soyadýnýz minumunm 2 karakter olmalý");
		return false;
	}
	
	
	
	
	
	
	
}
