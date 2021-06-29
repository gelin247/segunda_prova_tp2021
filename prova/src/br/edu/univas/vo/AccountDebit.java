package br.edu.univas.vo;

public class AccountDebit implements PaymentMethod {

	@Override
	public String data() {
		return "AccountDebit";
	}

}
