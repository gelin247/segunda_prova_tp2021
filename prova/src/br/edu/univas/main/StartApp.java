package br.edu.univas.main;

import br.edu.univas.controller.Customer;
import br.edu.univas.controller.CustomerController;
import br.edu.univas.controller.PaymentMethodNotAllowedException;

public class StartApp {
	public static void main(String[] args) {
		CustomerController controller = new CustomerController();
		try {
			Customer c = controller.createCustomer();
			System.out.println(c.getName());
			System.out.println(c.getCpf());
			System.out.println(c.getPaymentMethod().data());
		} catch (PaymentMethodNotAllowedException e) {
			e.printStackTrace();
		}
	}
}
