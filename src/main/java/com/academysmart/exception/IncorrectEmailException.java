package com.academysmart.exception;

@SuppressWarnings("serial")
public class IncorrectEmailException extends ServletException {
	
	public IncorrectEmailException() {super();
		}

	public IncorrectEmailException (String er2) {
		super(er2); 		
	}

//	public String toString() {
//		return "Exception " + er2;
//	}
//}

//@SuppressWarnings("serial")
//class MyIncorrectEmailException extends Throwable {
//	static void compute(String b) throws IncorrectEmailException {
//		System.out.println("Compute() method is called");
//		if (!b.equalsIgnoreCase(b)) {
//			throw new IncorrectEmailException();
//		}
//		System.out.println("Ok");
	}


