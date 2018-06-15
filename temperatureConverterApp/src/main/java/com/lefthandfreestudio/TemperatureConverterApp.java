package com.lefthandfreestudio;


public class TemperatureConverterApp 
{
    public static void main( String[] args )
    {
		LogicController controller = new LogicController();
        System.out.println( "Enter unit you want to convert from: (for unit types type \"help\")" );
		while(true){
			controller.communicateWithUser();
		}
    }
}
