package com.LSP;

public class Ostrich extends Bird {

	@Override
	public void fly() {
		System.out.println(this.getClass().getSimpleName()+ " This bird is not flying and it's voilating the principle of LSP, and compiler doesn't warn to do this, total mistake of programmer  ");
	}
	
}
