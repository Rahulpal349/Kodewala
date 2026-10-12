package com.kodewala.sb;

public class QueryGeneratorDriver {

	public static void main(String[] args) {
		
		QueryGenerator generator = new QueryGenerator();
		StringBuilder result =  generator.generatorQuery(0, "Raj");
		System.out.println(result);
		
		
		 
	}

}
