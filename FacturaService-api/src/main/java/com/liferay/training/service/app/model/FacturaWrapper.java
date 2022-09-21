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
 * This class is a wrapper for {@link Factura}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Factura
 * @generated
 */
public class FacturaWrapper
	extends BaseModelWrapper<Factura>
	implements Factura, ModelWrapper<Factura> {

	public FacturaWrapper(Factura factura) {
		super(factura);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("facturaId", getFacturaId());
		attributes.put("total", getTotal());
		attributes.put("clienteId", getClienteId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long facturaId = (Long)attributes.get("facturaId");

		if (facturaId != null) {
			setFacturaId(facturaId);
		}

		String total = (String)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		Long clienteId = (Long)attributes.get("clienteId");

		if (clienteId != null) {
			setClienteId(clienteId);
		}
	}

	@Override
	public Factura cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cliente ID of this factura.
	 *
	 * @return the cliente ID of this factura
	 */
	@Override
	public long getClienteId() {
		return model.getClienteId();
	}

	/**
	 * Returns the factura ID of this factura.
	 *
	 * @return the factura ID of this factura
	 */
	@Override
	public long getFacturaId() {
		return model.getFacturaId();
	}

	/**
	 * Returns the primary key of this factura.
	 *
	 * @return the primary key of this factura
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the total of this factura.
	 *
	 * @return the total of this factura
	 */
	@Override
	public String getTotal() {
		return model.getTotal();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cliente ID of this factura.
	 *
	 * @param clienteId the cliente ID of this factura
	 */
	@Override
	public void setClienteId(long clienteId) {
		model.setClienteId(clienteId);
	}

	/**
	 * Sets the factura ID of this factura.
	 *
	 * @param facturaId the factura ID of this factura
	 */
	@Override
	public void setFacturaId(long facturaId) {
		model.setFacturaId(facturaId);
	}

	/**
	 * Sets the primary key of this factura.
	 *
	 * @param primaryKey the primary key of this factura
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the total of this factura.
	 *
	 * @param total the total of this factura
	 */
	@Override
	public void setTotal(String total) {
		model.setTotal(total);
	}

	@Override
	protected FacturaWrapper wrap(Factura factura) {
		return new FacturaWrapper(factura);
	}

}