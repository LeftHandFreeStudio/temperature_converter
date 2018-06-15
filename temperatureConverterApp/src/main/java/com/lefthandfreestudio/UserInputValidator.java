package com.lefthandfreestudio;
public class UserInputValidator 
{
	public boolean isInputValid(String input){
		// input already to lower case
		boolean isInputValid = true;
		if(input == null || input.isEmpty()){
			isInputValid = false;
			return isInputValid;
		}
		if(input.length() > 20 || input.length() <= 1){
			isInputValid = false;
			return isInputValid;
		}
		
		if(!(input.charAt(0) >= 48 && input.charAt(0) <= 57)){
			isInputValid = false;
			return isInputValid;
		}
		char[] inputChars = input.substring(1).toCharArray();
		for(int i = 0; i < inputChars.length; i++){
			if(!(inputChars[i] >= 48 && inputChars[i] <= 57)){
				if(inputChars[i] == 99 || inputChars[i] == 102 || inputChars[i] == 107){
					if(inputChars[i +1] == 32){
						if(inputChars[i] == 99 || inputChars[i] == 102 || inputChars[i] == 107){
							break;
						}else{
							isInputValid = false;
							return isInputValid;
						}
					}else{
							isInputValid = false;
							return isInputValid;
						}
				}else{
							isInputValid = false;
							return isInputValid;
						}
			}
		}
		return isInputValid;
	}
}
