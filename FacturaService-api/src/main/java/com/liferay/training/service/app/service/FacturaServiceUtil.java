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

import java.util.Map;

/**
 * Provides the remote service utility for Factura. This utility wraps
 * <code>com.liferay.training.service.app.service.impl.FacturaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see FacturaService
 * @generated
 */
public class FacturaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.training.service.app.service.impl.FacturaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Map<String, Object> buscarFacturaPorId(long facturaId) {
		return getService().buscarFacturaPorId(facturaId);
	}

	public static Map<String, Object> crearFactura(
		long clienteId, String total, String items) {

		return getService().crearFactura(clienteId, total, items);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Map<String, Object> probandoObjetoDTO(
		String prueba, java.io.File[] archivosAdjuntos, String idInfoArchivos) {

		return getService().probandoObjetoDTO(
			prueba, archivosAdjuntos, idInfoArchivos);
	}

	public static FacturaService getService() {
		return _service;
	}

	private static volatile FacturaService _service;

}