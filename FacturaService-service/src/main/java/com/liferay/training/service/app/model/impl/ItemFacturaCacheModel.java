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
import com.liferay.training.service.app.model.ItemFactura;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ItemFactura in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ItemFacturaCacheModel
	implements CacheModel<ItemFactura>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ItemFacturaCacheModel)) {
			return false;
		}

		ItemFacturaCacheModel itemFacturaCacheModel =
			(ItemFacturaCacheModel)object;

		if (itemFacturaId == itemFacturaCacheModel.itemFacturaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, itemFacturaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{itemFacturaId=");
		sb.append(itemFacturaId);
		sb.append(", cantidadProd=");
		sb.append(cantidadProd);
		sb.append(", facturaId=");
		sb.append(facturaId);
		sb.append(", productoId=");
		sb.append(productoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ItemFactura toEntityModel() {
		ItemFacturaImpl itemFacturaImpl = new ItemFacturaImpl();

		itemFacturaImpl.setItemFacturaId(itemFacturaId);
		itemFacturaImpl.setCantidadProd(cantidadProd);
		itemFacturaImpl.setFacturaId(facturaId);
		itemFacturaImpl.setProductoId(productoId);

		itemFacturaImpl.resetOriginalValues();

		return itemFacturaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemFacturaId = objectInput.readLong();

		cantidadProd = objectInput.readLong();

		facturaId = objectInput.readLong();

		productoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(itemFacturaId);

		objectOutput.writeLong(cantidadProd);

		objectOutput.writeLong(facturaId);

		objectOutput.writeLong(productoId);
	}

	public long itemFacturaId;
	public long cantidadProd;
	public long facturaId;
	public long productoId;

}