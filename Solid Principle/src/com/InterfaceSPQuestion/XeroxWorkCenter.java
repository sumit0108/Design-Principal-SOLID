package com.InterfaceSPQuestion;

public class XeroxWorkCenter implements IMultiFunction {

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
		System.out.println("fax");

	}

	@Override
	public void internetFax() {
		System.out.println("internetFax");

	}

}
