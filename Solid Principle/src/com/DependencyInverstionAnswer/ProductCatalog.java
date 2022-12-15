package com.DependencyInverstionAnswer;

public class ProductCatalog {

	public void listAllProduct() {
		
		ProductRepository productrepo = ProductFactory.create();
		
		productrepo.getAllProduct();
		//List all product
	}
}
