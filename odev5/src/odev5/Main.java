package odev5;

import odev5.business.concretes.UserManager;
import odev5.core.utils.AmazonMailManagerAdaptor;
import odev5.dataAccess.concretes.InMemoryUserDao;
import odev5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdaptor());
		User mert = new User(4,"ahmet","mehmet","ahmetmehmet@gmail.com","1234566",true);
		userManager.add(mert);
		
		User engin=new User(2, "þekil", "isim", "þekilisim@gmail.com", "1223331", false);
		userManager.update(engin);
		
		userManager.getAll();
	}

}
