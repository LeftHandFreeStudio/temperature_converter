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
			endExecution = processValidInput(input);
		}else{
			System.out.println("invalid input!");
		}
		return endExecution;
	}
	public boolean processValidInput(String input){
		boolean end = false;
		input = input.toLowerCase();
		if(input.equals("exit")){
			end = true;
		}else if(input.equals("help")){
			printHelp();
		}
		
		return end;
	}
	public void printHelp(){
			System.out.println("help placeholder");
	}
}
