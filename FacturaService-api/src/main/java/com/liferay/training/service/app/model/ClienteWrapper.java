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
 * This class is a wrapper for {@link Cliente}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Cliente
 * @generated
 */
public class ClienteWrapper
	extends BaseModelWrapper<Cliente>
	implements Cliente, ModelWrapper<Cliente> {

	public ClienteWrapper(Cliente cliente) {
		super(cliente);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("clienteId", getClienteId());
		attributes.put("name", getName());
		attributes.put("cell", getCell());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long clienteId = (Long)attributes.get("clienteId");

		if (clienteId != null) {
			setClienteId(clienteId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String cell = (String)attributes.get("cell");

		if (cell != null) {
			setCell(cell);
		}
	}

	@Override
	public Cliente cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cell of this cliente.
	 *
	 * @return the cell of this cliente
	 */
	@Override
	public String getCell() {
		return model.getCell();
	}

	/**
	 * Returns the cliente ID of this cliente.
	 *
	 * @return the cliente ID of this cliente
	 */
	@Override
	public long getClienteId() {
		return model.getClienteId();
	}

	/**
	 * Returns the name of this cliente.
	 *
	 * @return the name of this cliente
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this cliente.
	 *
	 * @return the primary key of this cliente
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cell of this cliente.
	 *
	 * @param cell the cell of this cliente
	 */
	@Override
	public void setCell(String cell) {
		model.setCell(cell);
	}

	/**
	 * Sets the cliente ID of this cliente.
	 *
	 * @param clienteId the cliente ID of this cliente
	 */
	@Override
	public void setClienteId(long clienteId) {
		model.setClienteId(clienteId);
	}

	/**
	 * Sets the name of this cliente.
	 *
	 * @param name the name of this cliente
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this cliente.
	 *
	 * @param primaryKey the primary key of this cliente
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected ClienteWrapper wrap(Cliente cliente) {
		return new ClienteWrapper(cliente);
	}

}