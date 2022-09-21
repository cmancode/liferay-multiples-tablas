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

package com.liferay.training.service.app.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.service.app.model.Producto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Producto in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProductoCacheModel
	implements CacheModel<Producto>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductoCacheModel)) {
			return false;
		}

		ProductoCacheModel productoCacheModel = (ProductoCacheModel)object;

		if (productoId == productoCacheModel.productoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, productoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{productoId=");
		sb.append(productoId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", precio=");
		sb.append(precio);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Producto toEntityModel() {
		ProductoImpl productoImpl = new ProductoImpl();

		productoImpl.setProductoId(productoId);

		if (name == null) {
			productoImpl.setName("");
		}
		else {
			productoImpl.setName(name);
		}

		productoImpl.setPrecio(precio);

		productoImpl.resetOriginalValues();

		return productoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		productoId = objectInput.readLong();
		name = objectInput.readUTF();

		precio = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(productoId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeDouble(precio);
	}

	public long productoId;
	public String name;
	public double precio;

}