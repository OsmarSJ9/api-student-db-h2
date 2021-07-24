package com.asus.apistudent.exception;

public class NotFoundExceptionGeneric extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NotFoundExceptionGeneric(String message) {
		super(message);
	}
}
