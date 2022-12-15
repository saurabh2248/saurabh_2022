package com.book.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptionHandler extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String ResourceName;
	private String fieldName;
	private Integer fieldValue;

	public String getResourceName() {
		return ResourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Integer getFieldValue() {
		return fieldValue;
	}

	public ResourceNotFoundExceptionHandler(String resourceName, String fieldName, Integer fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
		this.ResourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;	
	}

}
