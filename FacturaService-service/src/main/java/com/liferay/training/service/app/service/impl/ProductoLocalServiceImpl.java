/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.service.app.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.training.service.app.exception.NoSuchProductoException;
import com.liferay.training.service.app.model.Producto;
import com.liferay.training.service.app.service.base.ProductoLocalServiceBaseImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.training.service.app.model.Producto",
	service = AopService.class
)
public class ProductoLocalServiceImpl extends ProductoLocalServiceBaseImpl {
	
	public Map<String, Object> crearProducto(String name, Double precio) {
		Map<String, Object> respuesta = new HashMap<String, Object>();
		
		long idProducto = super.counterLocalService.increment(Producto.class.getName());
		Producto producto = super.productoLocalService.createProducto(idProducto);
		producto.setName(name);
		producto.setPrecio(precio);
		
		super.addProducto(producto);
		
		respuesta.put("success", "Datos registrados de manera exitosa");
		respuesta.put("estatus", 200);
		
		return respuesta;
	}
	
	public Producto buscarProductoPorId(long idProducto) {
		
		try {
			Producto producto = super.productoPersistence.findByPrimaryKey(idProducto);
			return producto;
		} catch (NoSuchProductoException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Producto> buscarProductos() {
		return super.productoPersistence.findAll();
	}
	
}