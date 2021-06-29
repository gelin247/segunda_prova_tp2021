package br.edu.univas.controller;

public class PaymentMethodNotAllowedException extends Exception {

	private static final long serialVersionUID = -413894201321915294L;

	public PaymentMethodNotAllowedException(String message) {
		super(message);
	}
}
