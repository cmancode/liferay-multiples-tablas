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
 * The table class for the &quot;FacturaService_Producto&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Producto
 * @generated
 */
public class ProductoTable extends BaseTable<ProductoTable> {

	public static final ProductoTable INSTANCE = new ProductoTable();

	public final Column<ProductoTable, Long> productoId = createColumn(
		"productoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ProductoTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductoTable, Double> precio = createColumn(
		"precio", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private ProductoTable() {
		super("FacturaService_Producto", ProductoTable::new);
	}

}