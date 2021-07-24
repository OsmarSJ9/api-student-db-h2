package com.asus.apistudent.exception;

import java.util.Date;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@RestControllerAdvice
public class RestExceptionHandler{// extends ResponseEntityExceptionHandler{
/*	
	@ExceptionHandler(NotFoundExceptionGeneric.class)
	public Response notFoundExceptionHandler(NotFoundExceptionGeneric e) {
		Response response = new Response(404,e.getMessage(), new Date());
		return response;
		
	}
	
	@ExceptionHandler(Exception.class)
	public Response handleValidationExceptions(Exception e) {
		Response response = new Response(400,e.getMessage(), new Date());
	    return response;
	}
*/
}
