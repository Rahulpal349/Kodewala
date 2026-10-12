package com.kodewala.sb;

public class QueryGenerator {
	
	public StringBuilder generatorQuery(int salary, String empID){
		StringBuilder query = new StringBuilder("Select * from employee ");
		if(salary >0) {
			query.append(" Where Salary = " +salary + ";");
		}
		else if (empID!=null) {
			query.append("Where empID = "+empID +";");
		}
		else {
			query.append(";");
		}
		return query;
	}
}
