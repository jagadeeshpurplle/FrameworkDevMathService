package com.example.maths.service;

public class Response {

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public int getResult() {
		return result;
	}


	private int n1;
	private int n2;
	private int result;
	
	public Response(int n1, int n2, int results) {
		this.n1 = n1;
		this.n2 = n2;
		this.result = results;
	}
	
}
