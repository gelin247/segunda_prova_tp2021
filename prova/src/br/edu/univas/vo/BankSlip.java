package br.edu.univas.vo;

public class BankSlip implements PaymentMethod {

	@Override
	public String data() {
		return "BankSlip";
	}

}
