package br.edu.univas.si8.ta.fcalc.api;

public class Result {

	
	private int number;
	private int fibonacci;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Result FNumber(int number) {
		this.number = number;
		return this;
	}

	public int getFibonacci() {
		return fibonacci;
	}

	public void setFibonacci(int fibonacci) {
		this.fibonacci = fibonacci;
	}

	public Result withFibonacci(int fibonacci) {
		this.fibonacci = fibonacci;
		return this;
	}

}
