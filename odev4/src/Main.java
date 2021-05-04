import Abstracts.BaseCustomerManager;
import Abstracts.MernisServiceAdaptor;
import Concrete.NeroCustomerManager;
import Concrete.StarbacksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customerStarbucks = new Customer();
		customerStarbucks.setId(51);
		customerStarbucks.setFirstName("olcay");
		customerStarbucks.setLastName("Varol");
		customerStarbucks.setNationalId("66328049558");
		customerStarbucks.setDateOfBird(2000);
		
		BaseCustomerManager baseCustomerManager = new StarbacksCustomerManager(new MernisServiceAdaptor());
		baseCustomerManager.save(customerStarbucks);
		
		
	}	

}
