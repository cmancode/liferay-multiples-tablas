package com.liferay.training.service.app.service.dto;

import java.io.Serializable;

public class PruebaObjetoDTO implements Serializable{
	

	private long id;
	private String name;
	private String lastName;
	private String cell;
	private static final long serialVersionUID = 1L;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	
	

}
