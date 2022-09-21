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
 * Provides a wrapper for {@link FacturaService}.
 *
 * @author Brian Wing Shun Chan
 * @see FacturaService
 * @generated
 */
public class FacturaServiceWrapper
	implements FacturaService, ServiceWrapper<FacturaService> {

	public FacturaServiceWrapper() {
		this(null);
	}

	public FacturaServiceWrapper(FacturaService facturaService) {
		_facturaService = facturaService;
	}

	@Override
	public java.util.Map<String, Object> buscarFacturaPorId(long facturaId) {
		return _facturaService.buscarFacturaPorId(facturaId);
	}

	@Override
	public java.util.Map<String, Object> crearFactura(
		long clienteId, String total, String items) {

		return _facturaService.crearFactura(clienteId, total, items);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _facturaService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.Map<String, Object> probandoObjetoDTO(
		String prueba, java.io.File[] archivosAdjuntos, String idInfoArchivos) {

		return _facturaService.probandoObjetoDTO(
			prueba, archivosAdjuntos, idInfoArchivos);
	}

	@Override
	public FacturaService getWrappedService() {
		return _facturaService;
	}

	@Override
	public void setWrappedService(FacturaService facturaService) {
		_facturaService = facturaService;
	}

	private FacturaService _facturaService;

}