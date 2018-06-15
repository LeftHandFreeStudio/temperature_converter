package com.lefthandfreestudio;

import java.util.Scanner;

public class LogicController 
{
	private UserInputValidator inputValidator;
	private Scanner userInput;
	public LogicController(){
		inputValidator = new UserInputValidator()
		userInput = new Scanner(System.in);
	}
	public boolean communicateWithUser(){\
		boolean endExecution = false;
		String input = userInput.readLine();
		if(inputValidator.isInputValid(input)){
			processValidInput(input);
		}else{
			System.out.println("invalid input!")
		}
		return endExecution;
	}
	public void processValidInput(String input){
		
	}
}
