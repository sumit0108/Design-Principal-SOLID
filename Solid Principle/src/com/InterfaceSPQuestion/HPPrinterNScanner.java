package com.InterfaceSPQuestion;

public class HPPrinterNScanner implements IMultiFunction {

	@Override
	public void print() {
		System.out.println("Print");

	}

	@Override
	public void getPrintSpoolDetails() {
		System.out.println("getPrintSpoolDetails");

	}

	@Override
	public void scan() {
		System.out.println("scan");

	}

	@Override
	public void scanPhoto() {
		System.out.println("scanPhoto");

	}

	@Override
	public void fax() {
		// UnImplemented Method

	}

	@Override
	public void internetFax() {
		// UnImplemented Method
	}

}
