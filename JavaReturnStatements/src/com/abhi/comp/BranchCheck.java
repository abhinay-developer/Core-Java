package com.abhi.comp;

public class BranchCheck {

	public boolean k;
	public boolean verify(String br) {
		
		switch(br) {
		case "CSE":k=true;
		break;
		case "ECE":k=true;
		break;
		case "EEE":k=true;
		break;
		case "IT":k=true;
		break;
		default: k=false;
		}//switch
		return k;
	}//verify(_)
}//class
