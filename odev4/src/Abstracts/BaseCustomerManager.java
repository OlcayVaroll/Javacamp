package Abstracts;
import Entities.Customer;


public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("veritaban�na kaydedildi." + customer.getFirstName());
		
	}

}