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
import com.liferay.training.service.app.model.Cliente;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Cliente in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ClienteCacheModel implements CacheModel<Cliente>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ClienteCacheModel)) {
			return false;
		}

		ClienteCacheModel clienteCacheModel = (ClienteCacheModel)object;

		if (clienteId == clienteCacheModel.clienteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, clienteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{clienteId=");
		sb.append(clienteId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", cell=");
		sb.append(cell);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Cliente toEntityModel() {
		ClienteImpl clienteImpl = new ClienteImpl();

		clienteImpl.setClienteId(clienteId);

		if (name == null) {
			clienteImpl.setName("");
		}
		else {
			clienteImpl.setName(name);
		}

		if (cell == null) {
			clienteImpl.setCell("");
		}
		else {
			clienteImpl.setCell(cell);
		}

		clienteImpl.resetOriginalValues();

		return clienteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		clienteId = objectInput.readLong();
		name = objectInput.readUTF();
		cell = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(clienteId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (cell == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cell);
		}
	}

	public long clienteId;
	public String name;
	public String cell;

}