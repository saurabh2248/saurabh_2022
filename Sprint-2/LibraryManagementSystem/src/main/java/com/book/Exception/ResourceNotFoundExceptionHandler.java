package com.book.Exception;

public class ResourceNotFoundExceptionHandler extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String ResourceName;
	private String fieldName;
	private Object fieldValue;

	public String getResourceName() {
		return ResourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}

	public ResourceNotFoundExceptionHandler(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
		ResourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;	
	}

}
