package com.lefthandfreestudio;

import junit.framework.Test;
public class TemperatureConverterAppTest{
	
    public void testInputValidator(){
		UserInputValidator inputValidator = new UserInputValidator()
        assertFalse(inputValidator.isInputValid(""));
        assertFalse(inputValidator.isInputValid(null));
        assertFalse(inputValidator.isInputValid("asdasdddddddddd[o[o[orh[qwourh[noxzc[m"));
        assertTrue(inputValidator.isInputValid("help"));
        assertTrue(inputValidator.isInputValid("K"));
        assertTrue(inputValidator.isInputValid("250C"));
    }
}
