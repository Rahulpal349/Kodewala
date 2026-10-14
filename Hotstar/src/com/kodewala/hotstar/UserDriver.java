package com.kodewala.hotstar;
import com.kodewala.hotstar.user.*;
public class UserDriver {

	public static void main(String[] args) {
	 
		User u1 = new User("guest", "free");
//        User u2 = new User("guest", "free");
//        User u3 = new User("guest", "free");
//        User u4 = new User("guest", "free");
//        User u5 = new User("guest", "free");
//        User u6 = new User("guest", "free");

        User u7 = new User("Kodewala", "paid");
        User u8 = new User("Kodewala Academy", "paid");

        System.out.println("Total live users: " + User.liveUserCount);
       
	}
}
