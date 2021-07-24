package com.asus.apistudent.exception;

import java.util.Date;
import java.util.Map;

public class Response {
	
	private int code;
	private String message;
	private Date timestamp;
	private String path;
	private Map<String, String> validationErrors;
	
	public Response() {
	}

	public Response(int code, String message, String path) {
		this.code = code;
		this.message = message;
		this.path = path;
		this.timestamp = new Date();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, String> getValidationErrors() {
		return validationErrors;
	}

	public void setValidationErrors(Map<String, String> validationErrors) {
		this.validationErrors = validationErrors;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
		
	
	
}
