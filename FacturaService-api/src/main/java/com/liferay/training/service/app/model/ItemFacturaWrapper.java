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

package com.liferay.training.service.app.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ItemFactura}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemFactura
 * @generated
 */
public class ItemFacturaWrapper
	extends BaseModelWrapper<ItemFactura>
	implements ItemFactura, ModelWrapper<ItemFactura> {

	public ItemFacturaWrapper(ItemFactura itemFactura) {
		super(itemFactura);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemFacturaId", getItemFacturaId());
		attributes.put("cantidadProd", getCantidadProd());
		attributes.put("facturaId", getFacturaId());
		attributes.put("productoId", getProductoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemFacturaId = (Long)attributes.get("itemFacturaId");

		if (itemFacturaId != null) {
			setItemFacturaId(itemFacturaId);
		}

		Long cantidadProd = (Long)attributes.get("cantidadProd");

		if (cantidadProd != null) {
			setCantidadProd(cantidadProd);
		}

		Long facturaId = (Long)attributes.get("facturaId");

		if (facturaId != null) {
			setFacturaId(facturaId);
		}

		Long productoId = (Long)attributes.get("productoId");

		if (productoId != null) {
			setProductoId(productoId);
		}
	}

	@Override
	public ItemFactura cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cantidad prod of this item factura.
	 *
	 * @return the cantidad prod of this item factura
	 */
	@Override
	public long getCantidadProd() {
		return model.getCantidadProd();
	}

	/**
	 * Returns the factura ID of this item factura.
	 *
	 * @return the factura ID of this item factura
	 */
	@Override
	public long getFacturaId() {
		return model.getFacturaId();
	}

	/**
	 * Returns the item factura ID of this item factura.
	 *
	 * @return the item factura ID of this item factura
	 */
	@Override
	public long getItemFacturaId() {
		return model.getItemFacturaId();
	}

	/**
	 * Returns the primary key of this item factura.
	 *
	 * @return the primary key of this item factura
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the producto ID of this item factura.
	 *
	 * @return the producto ID of this item factura
	 */
	@Override
	public long getProductoId() {
		return model.getProductoId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cantidad prod of this item factura.
	 *
	 * @param cantidadProd the cantidad prod of this item factura
	 */
	@Override
	public void setCantidadProd(long cantidadProd) {
		model.setCantidadProd(cantidadProd);
	}

	/**
	 * Sets the factura ID of this item factura.
	 *
	 * @param facturaId the factura ID of this item factura
	 */
	@Override
	public void setFacturaId(long facturaId) {
		model.setFacturaId(facturaId);
	}

	/**
	 * Sets the item factura ID of this item factura.
	 *
	 * @param itemFacturaId the item factura ID of this item factura
	 */
	@Override
	public void setItemFacturaId(long itemFacturaId) {
		model.setItemFacturaId(itemFacturaId);
	}

	/**
	 * Sets the primary key of this item factura.
	 *
	 * @param primaryKey the primary key of this item factura
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the producto ID of this item factura.
	 *
	 * @param productoId the producto ID of this item factura
	 */
	@Override
	public void setProductoId(long productoId) {
		model.setProductoId(productoId);
	}

	@Override
	protected ItemFacturaWrapper wrap(ItemFactura itemFactura) {
		return new ItemFacturaWrapper(itemFactura);
	}

}