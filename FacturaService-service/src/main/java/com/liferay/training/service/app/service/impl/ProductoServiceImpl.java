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
import com.liferay.training.service.app.model.Producto;
import com.liferay.training.service.app.service.base.ProductoServiceBaseImpl;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=facturaservice",
		"json.web.service.context.path=Producto"
	},
	service = AopService.class
)
public class ProductoServiceImpl extends ProductoServiceBaseImpl {
	
	
	public Map<String, Object> crearProducto(String name, Double precio) {
		return super.productoLocalService.crearProducto(name, precio);
	}
	
	public Producto buscarProductoPorId(long idProducto) {
		return super.productoLocalService.buscarProductoPorId(idProducto);
	}
	
	public List<Producto> buscarProductos() {
		return super.productoLocalService.buscarProductos();
	}
	
}