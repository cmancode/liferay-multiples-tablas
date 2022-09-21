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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;FacturaService_ItemFactura&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ItemFactura
 * @generated
 */
public class ItemFacturaTable extends BaseTable<ItemFacturaTable> {

	public static final ItemFacturaTable INSTANCE = new ItemFacturaTable();

	public final Column<ItemFacturaTable, Long> itemFacturaId = createColumn(
		"itemFacturaId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ItemFacturaTable, Long> cantidadProd = createColumn(
		"cantidadProd", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ItemFacturaTable, Long> facturaId = createColumn(
		"facturaId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ItemFacturaTable, Long> productoId = createColumn(
		"productoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ItemFacturaTable() {
		super("FacturaService_ItemFactura", ItemFacturaTable::new);
	}

}