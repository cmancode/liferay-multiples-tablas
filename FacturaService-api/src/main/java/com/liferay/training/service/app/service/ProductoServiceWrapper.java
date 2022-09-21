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

package com.liferay.training.service.app.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductoService
 * @generated
 */
public class ProductoServiceWrapper
	implements ProductoService, ServiceWrapper<ProductoService> {

	public ProductoServiceWrapper() {
		this(null);
	}

	public ProductoServiceWrapper(ProductoService productoService) {
		_productoService = productoService;
	}

	@Override
	public com.liferay.training.service.app.model.Producto buscarProductoPorId(
		long idProducto) {

		return _productoService.buscarProductoPorId(idProducto);
	}

	@Override
	public java.util.List<com.liferay.training.service.app.model.Producto>
		buscarProductos() {

		return _productoService.buscarProductos();
	}

	@Override
	public java.util.Map<String, Object> crearProducto(
		String name, Double precio) {

		return _productoService.crearProducto(name, precio);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productoService.getOSGiServiceIdentifier();
	}

	@Override
	public ProductoService getWrappedService() {
		return _productoService;
	}

	@Override
	public void setWrappedService(ProductoService productoService) {
		_productoService = productoService;
	}

	private ProductoService _productoService;

}