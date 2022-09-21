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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.training.service.app.exception.NoSuchClienteException;
import com.liferay.training.service.app.model.Cliente;
import com.liferay.training.service.app.service.base.ClienteLocalServiceBaseImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.training.service.app.model.Cliente",
	service = AopService.class
)
public class ClienteLocalServiceImpl extends ClienteLocalServiceBaseImpl {

	private static final Log log = LogFactoryUtil.getLog(ClienteLocalServiceImpl.class);
	
	public Map<String, Object> crearCliente(String name, String cell) {
		
		Map<String, Object> respuesta = new HashMap<String, Object>();
		Cliente cliente = null;
		
		try {
			
			long idCliente = super.counterLocalService.increment(Cliente.class.getName());
			cliente = super.createCliente(idCliente);
			cliente.setName(name);
			cliente.setCell(cell);
			super.addCliente(cliente);
			log.info("Cliente pasó por ahí...");
			log.info("Pruebas Git...");
			respuesta.put("success", "Se ha registrado el cliente de manera exitosa.");
			respuesta.put("status", 200);
			
		} catch (Exception e) {
			respuesta.put("error", "Se ha puducido un error en el servidor");
			respuesta.put("status", 500);
		}	
		
		return respuesta;
	}
	
	
	public Cliente bucarClientePorId(long idCliente) {
		
		Cliente cliente = null;
		try {
			cliente = super.clientePersistence.findByPrimaryKey(idCliente);
		} catch (NoSuchClienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cliente;
		
	}
	
	public List<Cliente> buscarclientes() {
		
		List<Cliente> clientes = null;
		clientes = super.clientePersistence.findAll();
		return clientes;

	}
	
}