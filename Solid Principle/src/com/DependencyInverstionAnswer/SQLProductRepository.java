package com.DependencyInverstionAnswer;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository{

	public List<String> getAllProduct(){
		return Arrays.asList("soap", "tootpaste");
	}
}
