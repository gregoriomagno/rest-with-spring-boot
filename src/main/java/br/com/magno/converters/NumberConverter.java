package br.com.magno.converters;

import br.com.magno.exceptions.UnsupportedMathOperationException;

public class NumberConverter {

	public static Double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");

		if (isNumeric(number))
			return Double.parseDouble(number);
		return 0D;
	}

	public static void verifyNumbers(String numberOne, String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
	}

	public static  boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
