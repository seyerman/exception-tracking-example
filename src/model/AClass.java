package model;

import customExceptions.OneException;

public class AClass {
	private String name;
	private int number;
	
	public AClass(String na, int nu) {
		name = na;
		number = nu;
	}
	
	private int adjustNumber(double rNum)  throws OneException{
		if(rNum<3.0) {
			throw new OneException(name);
		}
		int x;
		x = ((int)rNum)/number;
		return x;
	}
	
	public boolean aMethod(double realNumber) throws OneException{
		int rNum = adjustNumber(realNumber);
		boolean aM;
		if(number<rNum) {
			aM = true;
		}else {
			aM = false;
		}
		return aM;
	}
}

