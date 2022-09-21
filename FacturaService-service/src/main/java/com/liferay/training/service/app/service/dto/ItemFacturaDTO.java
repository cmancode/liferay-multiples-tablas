package com.liferay.training.service.app.service.dto;

import java.io.Serializable;

public class ItemFacturaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private long idProducto;
	private long cantidad;
	
	
	public long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

}
