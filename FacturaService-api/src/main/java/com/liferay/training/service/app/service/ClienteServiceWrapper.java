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
 * Provides a wrapper for {@link ClienteService}.
 *
 * @author Brian Wing Shun Chan
 * @see ClienteService
 * @generated
 */
public class ClienteServiceWrapper
	implements ClienteService, ServiceWrapper<ClienteService> {

	public ClienteServiceWrapper() {
		this(null);
	}

	public ClienteServiceWrapper(ClienteService clienteService) {
		_clienteService = clienteService;
	}

	@Override
	public com.liferay.training.service.app.model.Cliente buscarclientePorId(
		long idCliente) {

		return _clienteService.buscarclientePorId(idCliente);
	}

	@Override
	public java.util.List<com.liferay.training.service.app.model.Cliente>
		buscarclientes() {

		return _clienteService.buscarclientes();
	}

	@Override
	public java.util.Map<String, Object> crearCliente(
		String name, String cell) {

		return _clienteService.crearCliente(name, cell);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _clienteService.getOSGiServiceIdentifier();
	}

	@Override
	public ClienteService getWrappedService() {
		return _clienteService;
	}

	@Override
	public void setWrappedService(ClienteService clienteService) {
		_clienteService = clienteService;
	}

	private ClienteService _clienteService;

}