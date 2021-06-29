package br.edu.univas.vo;

public class CreditCard implements PaymentMethod {

	@Override
	public String data() {
		return "CreditCard";
	}

}
