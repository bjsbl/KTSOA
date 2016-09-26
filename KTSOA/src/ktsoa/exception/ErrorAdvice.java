package ktsoa.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorAdvice {

	@ExceptionHandler
	public String exceptionHandler(Exception ex) {
		System.out.println("ErrorAdvice: " + ex.getMessage());
		return "error";
	}
}
