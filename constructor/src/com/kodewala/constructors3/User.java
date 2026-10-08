package com.kodewala.constructors3;

class SuperUser extends Object {

}

public class User extends SuperUser {

	String userName;
	String userId;
	String mobileNumber;

	User(String _userName, String _userId, String _mobileNumber) {
		this(300); //calling same class(User) constructor
		this.userName = _userName;
		this.userId = _userId;
		this.mobileNumber = _mobileNumber;
	}
	User(int age){
		System.out.println("User() ..no arg");
	}
 }

