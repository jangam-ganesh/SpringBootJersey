package com.interview.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class NotFounException extends WebApplicationException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotFounException() {
		super();
	}
	
	public NotFounException(String message) {
		super(message,Response.status(Response.Status.NOT_FOUND).build());
	}

	public NotFounException(String msg , int httpStatusCode) {
		super(msg,Response.status(httpStatusCode).build());
	}
}
