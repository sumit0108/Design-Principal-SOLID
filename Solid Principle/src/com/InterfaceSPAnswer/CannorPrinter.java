package com.InterfaceSPAnswer;

public class CannorPrinter implements Iprint {

	@Override
	public void print() {
		System.out.println("print");

	}

	@Override
	public void getPrintSpoolDetails() {
		System.out.println("getPrintSpoolDetails");
	}

}
