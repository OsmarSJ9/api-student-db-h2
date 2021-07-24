package com.asus.apistudent.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ResAdvice {

	@ExceptionHandler(NotFoundExceptionGeneric.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Response handleNotFoundException(NotFoundExceptionGeneric e, HttpServletRequest request) {
		Response obj = new Response(404, e.getMessage(), request.getServletPath());
		return obj;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Response handleMethodArgNotValid(MethodArgumentNotValidException e, HttpServletRequest request) {
		
		Response obj = new Response(400, e.getMessage(), request.getServletPath());
		BindingResult bindingResult = e.getBindingResult();
		Map<String, String> validationErrors = new HashMap<>();
		
		for(FieldError fieldError: bindingResult.getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		obj.setValidationErrors(validationErrors);
		return obj;
		
	}
}
