package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.vo.CreditCard;
import br.edu.univas.vo.*;

public class CustomerController {

	@SuppressWarnings("resource")
	public Customer createCustomer() throws PaymentMethodNotAllowedException {
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("Nome");
		customer.setName(scanner.nextLine());
		System.out.println("Cpf");
		customer.setCpf(scanner.nextLine());
		System.out.println("Id");
		customer.setId(scanner.nextLong());
		System.out.println("Metodo de pagamento");
		String payment = scanner.next();

		if (payment.equals("Pix")) {
			customer.setPaymentMethod(new Pix());
		} else if (payment.equals("CreditCard"))
			customer.setPaymentMethod(new CreditCard());
		else if (payment.equals("AccountDebit"))
			customer.setPaymentMethod(new AccountDebit());
		else if (payment.equals("BankSlip"))
			customer.setPaymentMethod(new BankSlip());
		else {
			scanner.close();
			throw new PaymentMethodNotAllowedException("PaymentMethod isn't accepted");

		}
		return customer;

	}

}
