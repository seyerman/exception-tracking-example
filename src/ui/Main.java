package ui;

import customExceptions.OneException;
import model.AClass;

public class Main {

	public static void main(String[] args) {
		AClass aObject = new AClass("this program", 4);
		try {
			System.out.println("aMethod:"+aObject.aMethod(3.6));
			System.out.println("aMethod:"+aObject.aMethod(2.9));
		}catch(OneException oe) {
			System.out.println(oe.getMessage());
		}
		
		aObject = new AClass("another program", 0);
		try {
			System.out.println("aMethod:"+aObject.aMethod(4.8));
		}catch(OneException oe) {
			System.out.println(oe.getMessage());
		}
	}
}

