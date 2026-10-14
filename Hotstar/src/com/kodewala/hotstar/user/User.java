package com.kodewala.hotstar.user;

public class User {

	String userId;
	String userName;
	String type;

	public static int liveUserCount = 0;
	

	public User(String _userId, String _userName, String _type) {
		this();
		this.userId = _userId;
		this.userName = _userName;
		this.type = _type;
		liveUserCount= liveUserCount+1;
		
	}

	public User(String _userName, String _type) {
		this.userName = _userName;
		this.type = _type;
		liveUserCount= liveUserCount+1;
	
	}

	public User() {

		liveUserCount= liveUserCount+1;
	}

}