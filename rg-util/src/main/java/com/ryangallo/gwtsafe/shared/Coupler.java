package com.ryangallo.gwtsafe.shared;

public class Coupler<A, B> {

	private A a;
	private B b;

	public Coupler() {

	}

	public Coupler(A a, B b) {
		this.setA(a);
		this.setB(b);
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}
