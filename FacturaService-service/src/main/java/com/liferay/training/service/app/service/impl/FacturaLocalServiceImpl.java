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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liferay.portal.aop.AopService;
import com.liferay.training.service.app.exception.NoSuchClienteException;
import com.liferay.training.service.app.exception.NoSuchFacturaException;
import com.liferay.training.service.app.model.Cliente;
import com.liferay.training.service.app.model.Factura;
import com.liferay.training.service.app.service.ItemFacturaLocalServiceUtil;
import com.liferay.training.service.app.service.base.FacturaLocalServiceBaseImpl;
import com.liferay.training.service.app.service.dto.ItemFacturaDTO;
import com.liferay.training.service.app.service.dto.PruebaObjetoDTO;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.training.service.app.model.Factura",
	service = AopService.class
)
public class FacturaLocalServiceImpl extends FacturaLocalServiceBaseImpl {
	
//	@Reference
//	private ItemFacturaLocalServiceImpl itemFacturaLocalServiceImpl;
	
	public Map<String, Object> crearFactura(long clienteId, String total, String items) {
		
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> respuesta = new HashMap<String, Object>();
		Cliente cliente = null;
		List<ItemFacturaDTO> lineas = new ArrayList<ItemFacturaDTO>();
		
		try {
			
			lineas = mapper.readValue(items,
					mapper.getTypeFactory().constructCollectionType(List.class, ItemFacturaDTO.class));

			
			System.out.println("id: "+lineas.get(0).getIdProducto());
			
			cliente = super.clientePersistence.findByPrimaryKey(clienteId);
			
			if(!(cliente == null)) {
				
				long idFactura = super.counterLocalService.increment(Factura.class.getName());
				Factura factura = super.createFactura(idFactura);
				factura.setClienteId(cliente.getClienteId());
				factura.setTotal(total);
				super.addFactura(factura);
				
				lineas.forEach(linea -> {
					if(linea != null) {
						ItemFacturaLocalServiceUtil.crearItemFactura(factura.getFacturaId(), 
								linea.getIdProducto(), linea.getCantidad());
					}
				});
				System.out.println("Prueba...");
				System.out.println("Probando....");
				System.out.println("Datos guardados con éxito...");
				respuesta.put("success", "La factura se ha generado de manera exitosa.");
				respuesta.put("status", 200);
			}
			
		} catch (NoSuchClienteException e) {
			respuesta.put("error", "La factura no pudo ser generada de manera exitosa.");
			respuesta.put("status", 500);
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return respuesta;
	}
	

	public Map<String, Object> buscarFacturaPorId(long idFactura) {
		
		Map<String, Object> respuesta = new HashMap<String, Object>();
		Factura factura = null;
		
		try {
			factura = super.facturaPersistence.findByPrimaryKey(idFactura);
			if(!(factura == null)) {
				respuesta.put("success", factura);
				respuesta.put("status", 200);
			} else {
				respuesta.put("notfound", "No se encontraron registros para los criterios de busqueda.");
				respuesta.put("status", 201);
			}
		} catch (NoSuchFacturaException e) {
			respuesta.put("error", "Error al momento de intentar realizar la consulta.");
			e.printStackTrace();
		}
		return respuesta;		
	}
	
	public Map<String, Object> probandoObjetoDTO(String prueba, File[] archivosAdjuntos, String idInfoArchivos) {
		Map<String, Object> respuesta = new HashMap<String, Object>();
		
		respuesta.put("data", prueba);
		
		return respuesta;
	}
	
}