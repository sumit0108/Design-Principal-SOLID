package com.LSP;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.println(this.getClass().getSimpleName() + " The bird is fly");
	}
		
}
