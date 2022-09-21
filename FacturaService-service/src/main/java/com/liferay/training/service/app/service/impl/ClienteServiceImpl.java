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
import com.liferay.training.service.app.model.Cliente;
import com.liferay.training.service.app.service.base.ClienteServiceBaseImpl;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=facturaservice",
		"json.web.service.context.path=Cliente"
	},
	service = AopService.class
)
public class ClienteServiceImpl extends ClienteServiceBaseImpl {
	
	public Map<String, Object> crearCliente(String name, String cell) {
		return super.clienteLocalService.crearCliente(name, cell);
	}
	
	public Cliente buscarclientePorId(long idCliente) {
		return super.clienteLocalService.bucarClientePorId(idCliente);
	}
	
	public List<Cliente> buscarclientes() {
		return super.clienteLocalService.buscarclientes();
	}
	
}