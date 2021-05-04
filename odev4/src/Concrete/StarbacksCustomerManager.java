package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbacksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService checkService;
	
	public StarbacksCustomerManager(CustomerCheckService checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		if(this.checkService.CheckIfRealPerson(customer)) {
		System.out.println("veritabanýna kaydedildi." + customer.getFirstName());
		}else {
			System.out.println("not a valid person");
		}
	}

}
