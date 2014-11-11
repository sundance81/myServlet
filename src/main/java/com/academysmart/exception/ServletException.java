package com.academysmart.exception;

@SuppressWarnings("serial")
public class ServletException extends Exception {
	public ServletException() {
		super();
	}
	
	public ServletException(String er1) {
		super(er1);
	}
//	private String er1;
//
//	void MyServletException(String a) {
//		er1 = a;
//	}
//
//	public String toString() {
//		return "Exception " + er1;
//	}
//}
//
//@SuppressWarnings("serial")
//class MyServletException extends Throwable {
//	static void compute(String a) throws MyServletException {
//		System.out.println("Compute() method is called");
//		if (a != null) {
//			throw new MyServletException();
//		}
//		System.out.println("Ok");
	
}