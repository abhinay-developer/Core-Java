package com.abhi.core;
import com.abhi.core.UserAddress;
import com.abhi.core.UserDetails;
public class Test {

	public static void main(String[] args) {
		
		UserDetails ud=new UserDetails();
		ud.fName="abhinay";
		ud.lName="galipally";
		ud.mId="abhinay.galipally@gmail.com";
		ud.phNo=9666147856l;
		ud.getUserDetails();
		UserAddress ua=new UserAddress();
		ua.hNo="12-10-89";
		ua.sName="abhinayGalipally";
		ua.city="Hyderabad";
		ua.pinCode=505301;
		ua.getUserAddress();
	}

}
