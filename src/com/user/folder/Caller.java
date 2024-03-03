package com.user.folder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caller {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter id: ");
		String Sid = br.readLine();
		int id = Integer.parseInt(Sid);
		
		System.out.print("Enter name: ");
		String name = br.readLine();
		
		System.out.print("Enter Address");
		String address = br.readLine();
		//creating an object
		UserDetails user = new UserDetails(id, name, address);
		System.out.println(user);
		
	}
}
