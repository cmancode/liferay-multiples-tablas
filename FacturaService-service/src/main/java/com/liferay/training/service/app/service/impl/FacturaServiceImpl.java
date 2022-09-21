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
import com.liferay.training.service.app.service.base.FacturaServiceBaseImpl;
import com.liferay.training.service.app.service.dto.PruebaObjetoDTO;

import java.io.File;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=facturaservice",
		"json.web.service.context.path=Factura"
	},
	service = AopService.class
)
public class FacturaServiceImpl extends FacturaServiceBaseImpl {
	
	public Map<String, Object> crearFactura(long clienteId, String total, String items) {
		return super.facturaLocalService.crearFactura(clienteId, total, items);
	}
	
	public Map<String, Object> buscarFacturaPorId(long facturaId) {
		return super.facturaLocalService.buscarFacturaPorId(facturaId);
	} 
	
	public Map<String, Object> probandoObjetoDTO(String prueba, File[] archivosAdjuntos, String idInfoArchivos) {
		return super.facturaLocalService.probandoObjetoDTO(prueba, archivosAdjuntos, idInfoArchivos);
	}
	
}