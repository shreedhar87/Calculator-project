package com.calculator;

public class CalculaterImpl implements Calculator {

	@Override
	public String add(int a, int b) {	
		int ans=a+b;
		return "add="+ans;
	}

	@Override
	public String sub(int a, int b) {
		int ans=a-b;
		return "sub="+ans;
	}

	@Override
	public String mul(int a, int b) {
		int ans=a*b;
		return "mul="+ans;
	}

	@Override
	public String div(int a, int b) {
		int ans=a/b;
		return "div="+ans;
	}

	@Override
	public String errorMsgDisplay() {
	
		return "Error";
	}
	
	

}
