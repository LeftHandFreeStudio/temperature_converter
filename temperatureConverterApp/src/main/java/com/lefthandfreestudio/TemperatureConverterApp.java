package com.lefthandfreestudio;


public class TemperatureConverterApp 
{
    public static void main( String[] args )
    {
		LogicController controller = new LogicController();
        System.out.println( "Enter unit you want to convert from: (for unit types type \"help\")" );
		
		boolean end = false;
		while(!end){
			end = controller.communicateWithUser();
		}
        System.out.println( "Thanks for using great programs from LeftHandFreeStudio!" );
        System.out.println( "for more visit our website: www.lefthandfreestudio.com" );
    }
}
