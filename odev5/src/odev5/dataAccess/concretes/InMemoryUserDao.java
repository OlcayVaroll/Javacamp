package odev5.dataAccess.concretes;

import java.util.List;
import java.util.ArrayList;

import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	
	private List<User> users = new ArrayList<User>();

	
	
	public InMemoryUserDao() {
		super();
		User user1 = new User(1, "Olcay","Varol","olcayvarol@gmail.com","123456", true);
		User user2 = new User(2, "Engin","Demiro�","engindemiro�@gmail.com","123456789", true);
		User user3 = new User(3, "�smet","Songur","ismetsongur@gmail.com","12345678910", true);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
	
	
	}

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void update(User user) {
		
		User userToUpdate=users.stream()
			.filter(u->u.getId()==user.getId())
			.findFirst()
			.orElse(null);
		
		userToUpdate.setePosta(user.getePosta());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());
		
		
	}

	@Override
	public void delete(int userId) {
		
		User userToDelete=users.stream()
				.filter(u->u.getId() == userId)
				.findFirst()
				.orElse(null);
		
		users.remove(userToDelete);
		
	}

	private int userId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User get(String email) {
		User user=users.stream()
				.filter(u->u.getePosta() == email)
				.findFirst()
				.orElse(null);
		return user;
	}

}
