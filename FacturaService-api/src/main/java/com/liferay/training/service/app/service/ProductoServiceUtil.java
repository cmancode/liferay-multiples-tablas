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

import com.liferay.training.service.app.model.Producto;

import java.util.List;
import java.util.Map;

/**
 * Provides the remote service utility for Producto. This utility wraps
 * <code>com.liferay.training.service.app.service.impl.ProductoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ProductoService
 * @generated
 */
public class ProductoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.service.app.service.impl.ProductoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Producto buscarProductoPorId(long idProducto) {
		return getService().buscarProductoPorId(idProducto);
	}

	public static List<Producto> buscarProductos() {
		return getService().buscarProductos();
	}

	public static Map<String, Object> crearProducto(
		String name, Double precio) {

		return getService().crearProducto(name, precio);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ProductoService getService() {
		return _service;
	}

	private static volatile ProductoService _service;

}