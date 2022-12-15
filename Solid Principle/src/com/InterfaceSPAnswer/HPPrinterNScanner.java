package com.InterfaceSPAnswer;

public class HPPrinterNScanner implements Iprint, IScan {

	@Override
	public void scan() {
		System.out.println("scan");

	}

	@Override
	public void scanPhoto() {
		System.out.println("scanPhoto");

	}

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void getPrintSpoolDetails() {
		System.out.println("getPrintSpoolDetails");

	}

}
