package odev5.core.utils;

import odev5.amazonEmail.AmazonManager;

public class AmazonMailManagerAdaptor implements EmailService {

	private AmazonManager amazonManager;

	public AmazonMailManagerAdaptor() {
		super();
		this.amazonManager = new AmazonManager();
	}

	@Override
	public void send(String email, String message) {
		amazonManager.send(email, message);
		
	}
	
	

}
