package odev5.core.utils;

import odev5.googleEmail.GoogleMailManager;

public class GoogleMailManagerAdaptor implements EmailService {

		private GoogleMailManager googleMailManager;
		
		public GoogleMailManagerAdaptor() {
			googleMailManager= new GoogleMailManager();		}
		
		
	
	@Override
	public void send(String email, String message) {
		googleMailManager.send(email, message);
		
	}

}
