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
import com.liferay.training.service.app.model.Factura;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Factura in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FacturaCacheModel implements CacheModel<Factura>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FacturaCacheModel)) {
			return false;
		}

		FacturaCacheModel facturaCacheModel = (FacturaCacheModel)object;

		if (facturaId == facturaCacheModel.facturaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, facturaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{facturaId=");
		sb.append(facturaId);
		sb.append(", total=");
		sb.append(total);
		sb.append(", clienteId=");
		sb.append(clienteId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Factura toEntityModel() {
		FacturaImpl facturaImpl = new FacturaImpl();

		facturaImpl.setFacturaId(facturaId);

		if (total == null) {
			facturaImpl.setTotal("");
		}
		else {
			facturaImpl.setTotal(total);
		}

		facturaImpl.setClienteId(clienteId);

		facturaImpl.resetOriginalValues();

		return facturaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		facturaId = objectInput.readLong();
		total = objectInput.readUTF();

		clienteId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(facturaId);

		if (total == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(total);
		}

		objectOutput.writeLong(clienteId);
	}

	public long facturaId;
	public String total;
	public long clienteId;

}