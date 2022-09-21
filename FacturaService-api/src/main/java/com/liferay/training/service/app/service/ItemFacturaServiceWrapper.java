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
 * Provides a wrapper for {@link ItemFacturaService}.
 *
 * @author Brian Wing Shun Chan
 * @see ItemFacturaService
 * @generated
 */
public class ItemFacturaServiceWrapper
	implements ItemFacturaService, ServiceWrapper<ItemFacturaService> {

	public ItemFacturaServiceWrapper() {
		this(null);
	}

	public ItemFacturaServiceWrapper(ItemFacturaService itemFacturaService) {
		_itemFacturaService = itemFacturaService;
	}

	@Override
	public java.util.List<com.liferay.training.service.app.model.ItemFactura>
		buscarItems() {

		return _itemFacturaService.buscarItems();
	}

	@Override
	public com.liferay.training.service.app.model.ItemFactura crearItemFactura(
		long facturaId, long productoId, long cantidadProd) {

		return _itemFacturaService.crearItemFactura(
			facturaId, productoId, cantidadProd);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _itemFacturaService.getOSGiServiceIdentifier();
	}

	@Override
	public ItemFacturaService getWrappedService() {
		return _itemFacturaService;
	}

	@Override
	public void setWrappedService(ItemFacturaService itemFacturaService) {
		_itemFacturaService = itemFacturaService;
	}

	private ItemFacturaService _itemFacturaService;

}