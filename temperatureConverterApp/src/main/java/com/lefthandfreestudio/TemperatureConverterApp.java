package com.lefthandfreestudio;


public class TemperatureConverterApp 
{
    public static void main( String[] args )
    {
		LogicController controller = new LogicController();
        System.out.println( "Enter temperature including unit followed by output unit: (for unit types type \"help\")" );
        System.out.println( "e.g. 20K C -> results in conversion 20 Kelvin to Celsius" );
		
		boolean end = false;
		while(!end){
			end = controller.communicateWithUser();
		}
        System.out.println( "Thanks for using great programs from LeftHandFreeStudio!" );
        System.out.println( "for more visit our website: www.lefthandfreestudio.com" );
    }
}
