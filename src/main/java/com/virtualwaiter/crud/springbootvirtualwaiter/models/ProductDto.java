package com.virtualwaiter.crud.springbootvirtualwaiter.models;

import jakarta.validation.constraints.*;

public class ProductDto {
	
	@NotEmpty(message="El nombre es obligatorio")
	private String name;
	
	@Size(min=10, message = "La descripción debe tener mas de 10 caracteres")
	@Size(max=2000, message = "La descripcion no debe exceder los 2000 caracteres")
	private String description;
	
	@Min(0)
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
