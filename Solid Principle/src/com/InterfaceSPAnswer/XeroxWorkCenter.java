package com.InterfaceSPAnswer;

public class XeroxWorkCenter implements Iprint, IScan, IFax {

	@Override
	public void fax() {
		System.out.println("fax");

	}

	@Override
	public void internetFax() {
		System.out.println("internetFax");
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
	public void print() {
		System.out.println("print");
	}

	@Override
	public void getPrintSpoolDetails() {
		System.out.println("getPrintSpoolDetails");
	}

}
