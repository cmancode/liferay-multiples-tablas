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
import com.liferay.training.service.app.model.ItemFactura;
import com.liferay.training.service.app.service.base.ItemFacturaLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.training.service.app.model.ItemFactura",
	service = AopService.class
)
public class ItemFacturaLocalServiceImpl
	extends ItemFacturaLocalServiceBaseImpl {
	
	
	public ItemFactura crearItemFactura(long facturaId, long productoId, long cantidadProd) {
		
		
		try {
			
			long idItemFactura = super.counterLocalService.increment(ItemFactura.class.getName());
			ItemFactura item = super.itemFacturaLocalService.createItemFactura(idItemFactura);
			item.setFacturaId(facturaId);
			item.setProductoId(productoId);
			item.setCantidadProd(cantidadProd);
			
			return super.itemFacturaLocalService.addItemFactura(item);
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public List<ItemFactura> buscarItems() {
		return super.itemFacturaPersistence.findAll();
	}
	
}