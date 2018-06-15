package com.lefthandfreestudio;
public class UserInputValidator 
{
	public boolean isInputValid(String input){
		boolean isInputValid = true;
		if(input == null || input.isEmpty()){
			isInputValid = false;
			return isInputValid;
		}
		if(input.length() > 20 || input.length() <= 1){
			isInputValid = false;
			return isInputValid;
		}
	}
}
