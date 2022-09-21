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

package com.liferay.training.service.app.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ItemFacturaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ItemFacturaLocalService
 * @generated
 */
public class ItemFacturaLocalServiceWrapper
	implements ItemFacturaLocalService,
			   ServiceWrapper<ItemFacturaLocalService> {

	public ItemFacturaLocalServiceWrapper() {
		this(null);
	}

	public ItemFacturaLocalServiceWrapper(
		ItemFacturaLocalService itemFacturaLocalService) {

		_itemFacturaLocalService = itemFacturaLocalService;
	}

	/**
	 * Adds the item factura to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemFacturaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemFactura the item factura
	 * @return the item factura that was added
	 */
	@Override
	public com.liferay.training.service.app.model.ItemFactura addItemFactura(
		com.liferay.training.service.app.model.ItemFactura itemFactura) {

		return _itemFacturaLocalService.addItemFactura(itemFactura);
	}

	@Override
	public java.util.List<com.liferay.training.service.app.model.ItemFactura>
		buscarItems() {

		return _itemFacturaLocalService.buscarItems();
	}

	@Override
	public com.liferay.training.service.app.model.ItemFactura crearItemFactura(
		long facturaId, long productoId, long cantidadProd) {

		return _itemFacturaLocalService.crearItemFactura(
			facturaId, productoId, cantidadProd);
	}

	/**
	 * Creates a new item factura with the primary key. Does not add the item factura to the database.
	 *
	 * @param itemFacturaId the primary key for the new item factura
	 * @return the new item factura
	 */
	@Override
	public com.liferay.training.service.app.model.ItemFactura createItemFactura(
		long itemFacturaId) {

		return _itemFacturaLocalService.createItemFactura(itemFacturaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemFacturaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the item factura from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemFacturaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemFactura the item factura
	 * @return the item factura that was removed
	 */
	@Override
	public com.liferay.training.service.app.model.ItemFactura deleteItemFactura(
		com.liferay.training.service.app.model.ItemFactura itemFactura) {

		return _itemFacturaLocalService.deleteItemFactura(itemFactura);
	}

	/**
	 * Deletes the item factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemFacturaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura that was removed
	 * @throws PortalException if a item factura with the primary key could not be found
	 */
	@Override
	public com.liferay.training.service.app.model.ItemFactura deleteItemFactura(
			long itemFacturaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemFacturaLocalService.deleteItemFactura(itemFacturaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemFacturaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _itemFacturaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _itemFacturaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _itemFacturaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _itemFacturaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.service.app.model.impl.ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _itemFacturaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.service.app.model.impl.ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _itemFacturaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _itemFacturaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _itemFacturaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.service.app.model.ItemFactura fetchItemFactura(
		long itemFacturaId) {

		return _itemFacturaLocalService.fetchItemFactura(itemFacturaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _itemFacturaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _itemFacturaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the item factura with the primary key.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura
	 * @throws PortalException if a item factura with the primary key could not be found
	 */
	@Override
	public com.liferay.training.service.app.model.ItemFactura getItemFactura(
			long itemFacturaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemFacturaLocalService.getItemFactura(itemFacturaId);
	}

	/**
	 * Returns a range of all the item facturas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.service.app.model.impl.ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @return the range of item facturas
	 */
	@Override
	public java.util.List<com.liferay.training.service.app.model.ItemFactura>
		getItemFacturas(int start, int end) {

		return _itemFacturaLocalService.getItemFacturas(start, end);
	}

	/**
	 * Returns the number of item facturas.
	 *
	 * @return the number of item facturas
	 */
	@Override
	public int getItemFacturasCount() {
		return _itemFacturaLocalService.getItemFacturasCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _itemFacturaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemFacturaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the item factura in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ItemFacturaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param itemFactura the item factura
	 * @return the item factura that was updated
	 */
	@Override
	public com.liferay.training.service.app.model.ItemFactura updateItemFactura(
		com.liferay.training.service.app.model.ItemFactura itemFactura) {

		return _itemFacturaLocalService.updateItemFactura(itemFactura);
	}

	@Override
	public ItemFacturaLocalService getWrappedService() {
		return _itemFacturaLocalService;
	}

	@Override
	public void setWrappedService(
		ItemFacturaLocalService itemFacturaLocalService) {

		_itemFacturaLocalService = itemFacturaLocalService;
	}

	private ItemFacturaLocalService _itemFacturaLocalService;

}