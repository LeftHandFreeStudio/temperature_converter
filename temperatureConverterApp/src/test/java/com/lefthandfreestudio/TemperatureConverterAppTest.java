package com.lefthandfreestudio;

import junit.framework.Test;
public class TemperatureConverterAppTest{
	
    public void testInputValidatorCommonFailCases(){
		UserInputValidator inputValidator = new UserInputValidator()
        assertFalse(inputValidator.isInputValid(""));
        assertFalse(inputValidator.isInputValid(null));
        assertFalse(inputValidator.isInputValid("asdasdddddddddd[o[o[orh[qwourh[noxzc[m"));
        assertTrue(inputValidator.isInputValid("help"));
        assertTrue(inputValidator.isInputValid("K"));
        assertTrue(inputValidator.isInputValid("250C"));
    }
	public void testInputValidatorConversionInputs(){
		UserInputValidator inputValidator = new UserInputValidator()
        assertFalse(inputValidator.isInputValid("20kk"));
        assertFalse(inputValidator.isInputValid("20k 0"));
        assertFalse(inputValidator.isInputValid("2f1c"));
        assertTrue(inputValidator.isInputValid("20f c"));
        assertTrue(inputValidator.isInputValid("5000000k f"));
        assertTrue(inputValidator.isInputValid("200k c"));
    }
}
