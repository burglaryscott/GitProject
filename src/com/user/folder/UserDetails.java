package com.user.folder;

public class UserDetails {
	int UserId;
	String UserName;
	String UserAddress;
	
	public UserDetails() {
		super();
		UserId = 0;
		UserName = null;
		UserAddress = null;
	}
	
	public UserDetails(int userId, String userName, String userAddress) {
		super();
		UserId = userId;
		UserName = userName;
		UserAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserDetails [UserId=" + UserId + ", UserName=" + UserName + ", UserAddress=" + UserAddress + "]";
	}
	
	
	
	
	
}
