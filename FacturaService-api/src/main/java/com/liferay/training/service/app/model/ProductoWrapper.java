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
 * This class is a wrapper for {@link Producto}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Producto
 * @generated
 */
public class ProductoWrapper
	extends BaseModelWrapper<Producto>
	implements ModelWrapper<Producto>, Producto {

	public ProductoWrapper(Producto producto) {
		super(producto);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("productoId", getProductoId());
		attributes.put("name", getName());
		attributes.put("precio", getPrecio());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long productoId = (Long)attributes.get("productoId");

		if (productoId != null) {
			setProductoId(productoId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Double precio = (Double)attributes.get("precio");

		if (precio != null) {
			setPrecio(precio);
		}
	}

	@Override
	public Producto cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the name of this producto.
	 *
	 * @return the name of this producto
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the precio of this producto.
	 *
	 * @return the precio of this producto
	 */
	@Override
	public Double getPrecio() {
		return model.getPrecio();
	}

	/**
	 * Returns the primary key of this producto.
	 *
	 * @return the primary key of this producto
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the producto ID of this producto.
	 *
	 * @return the producto ID of this producto
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
	 * Sets the name of this producto.
	 *
	 * @param name the name of this producto
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the precio of this producto.
	 *
	 * @param precio the precio of this producto
	 */
	@Override
	public void setPrecio(Double precio) {
		model.setPrecio(precio);
	}

	/**
	 * Sets the primary key of this producto.
	 *
	 * @param primaryKey the primary key of this producto
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the producto ID of this producto.
	 *
	 * @param productoId the producto ID of this producto
	 */
	@Override
	public void setProductoId(long productoId) {
		model.setProductoId(productoId);
	}

	@Override
	protected ProductoWrapper wrap(Producto producto) {
		return new ProductoWrapper(producto);
	}

}