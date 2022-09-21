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

package com.liferay.training.service.app.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.service.app.model.ItemFactura;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the item factura service. This utility wraps <code>com.liferay.training.service.app.service.persistence.impl.ItemFacturaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemFacturaPersistence
 * @generated
 */
public class ItemFacturaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ItemFactura itemFactura) {
		getPersistence().clearCache(itemFactura);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ItemFactura> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ItemFactura> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ItemFactura> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ItemFactura> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ItemFactura update(ItemFactura itemFactura) {
		return getPersistence().update(itemFactura);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ItemFactura update(
		ItemFactura itemFactura, ServiceContext serviceContext) {

		return getPersistence().update(itemFactura, serviceContext);
	}

	/**
	 * Returns all the item facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the matching item facturas
	 */
	public static List<ItemFactura> findByFacturaId(long facturaId) {
		return getPersistence().findByFacturaId(facturaId);
	}

	/**
	 * Returns a range of all the item facturas where facturaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param facturaId the factura ID
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @return the range of matching item facturas
	 */
	public static List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end) {

		return getPersistence().findByFacturaId(facturaId, start, end);
	}

	/**
	 * Returns an ordered range of all the item facturas where facturaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param facturaId the factura ID
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching item facturas
	 */
	public static List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator) {

		return getPersistence().findByFacturaId(
			facturaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item facturas where facturaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param facturaId the factura ID
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching item facturas
	 */
	public static List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByFacturaId(
			facturaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	public static ItemFactura findByFacturaId_First(
			long facturaId, OrderByComparator<ItemFactura> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchItemFacturaException {

		return getPersistence().findByFacturaId_First(
			facturaId, orderByComparator);
	}

	/**
	 * Returns the first item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	public static ItemFactura fetchByFacturaId_First(
		long facturaId, OrderByComparator<ItemFactura> orderByComparator) {

		return getPersistence().fetchByFacturaId_First(
			facturaId, orderByComparator);
	}

	/**
	 * Returns the last item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	public static ItemFactura findByFacturaId_Last(
			long facturaId, OrderByComparator<ItemFactura> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchItemFacturaException {

		return getPersistence().findByFacturaId_Last(
			facturaId, orderByComparator);
	}

	/**
	 * Returns the last item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	public static ItemFactura fetchByFacturaId_Last(
		long facturaId, OrderByComparator<ItemFactura> orderByComparator) {

		return getPersistence().fetchByFacturaId_Last(
			facturaId, orderByComparator);
	}

	/**
	 * Returns the item facturas before and after the current item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param itemFacturaId the primary key of the current item factura
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item factura
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	public static ItemFactura[] findByFacturaId_PrevAndNext(
			long itemFacturaId, long facturaId,
			OrderByComparator<ItemFactura> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchItemFacturaException {

		return getPersistence().findByFacturaId_PrevAndNext(
			itemFacturaId, facturaId, orderByComparator);
	}

	/**
	 * Removes all the item facturas where facturaId = &#63; from the database.
	 *
	 * @param facturaId the factura ID
	 */
	public static void removeByFacturaId(long facturaId) {
		getPersistence().removeByFacturaId(facturaId);
	}

	/**
	 * Returns the number of item facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the number of matching item facturas
	 */
	public static int countByFacturaId(long facturaId) {
		return getPersistence().countByFacturaId(facturaId);
	}

	/**
	 * Returns all the item facturas where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the matching item facturas
	 */
	public static List<ItemFactura> findByProductoId(long productoId) {
		return getPersistence().findByProductoId(productoId);
	}

	/**
	 * Returns a range of all the item facturas where productoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param productoId the producto ID
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @return the range of matching item facturas
	 */
	public static List<ItemFactura> findByProductoId(
		long productoId, int start, int end) {

		return getPersistence().findByProductoId(productoId, start, end);
	}

	/**
	 * Returns an ordered range of all the item facturas where productoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param productoId the producto ID
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching item facturas
	 */
	public static List<ItemFactura> findByProductoId(
		long productoId, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator) {

		return getPersistence().findByProductoId(
			productoId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item facturas where productoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param productoId the producto ID
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching item facturas
	 */
	public static List<ItemFactura> findByProductoId(
		long productoId, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByProductoId(
			productoId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	public static ItemFactura findByProductoId_First(
			long productoId, OrderByComparator<ItemFactura> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchItemFacturaException {

		return getPersistence().findByProductoId_First(
			productoId, orderByComparator);
	}

	/**
	 * Returns the first item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	public static ItemFactura fetchByProductoId_First(
		long productoId, OrderByComparator<ItemFactura> orderByComparator) {

		return getPersistence().fetchByProductoId_First(
			productoId, orderByComparator);
	}

	/**
	 * Returns the last item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	public static ItemFactura findByProductoId_Last(
			long productoId, OrderByComparator<ItemFactura> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchItemFacturaException {

		return getPersistence().findByProductoId_Last(
			productoId, orderByComparator);
	}

	/**
	 * Returns the last item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	public static ItemFactura fetchByProductoId_Last(
		long productoId, OrderByComparator<ItemFactura> orderByComparator) {

		return getPersistence().fetchByProductoId_Last(
			productoId, orderByComparator);
	}

	/**
	 * Returns the item facturas before and after the current item factura in the ordered set where productoId = &#63;.
	 *
	 * @param itemFacturaId the primary key of the current item factura
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item factura
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	public static ItemFactura[] findByProductoId_PrevAndNext(
			long itemFacturaId, long productoId,
			OrderByComparator<ItemFactura> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchItemFacturaException {

		return getPersistence().findByProductoId_PrevAndNext(
			itemFacturaId, productoId, orderByComparator);
	}

	/**
	 * Removes all the item facturas where productoId = &#63; from the database.
	 *
	 * @param productoId the producto ID
	 */
	public static void removeByProductoId(long productoId) {
		getPersistence().removeByProductoId(productoId);
	}

	/**
	 * Returns the number of item facturas where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the number of matching item facturas
	 */
	public static int countByProductoId(long productoId) {
		return getPersistence().countByProductoId(productoId);
	}

	/**
	 * Caches the item factura in the entity cache if it is enabled.
	 *
	 * @param itemFactura the item factura
	 */
	public static void cacheResult(ItemFactura itemFactura) {
		getPersistence().cacheResult(itemFactura);
	}

	/**
	 * Caches the item facturas in the entity cache if it is enabled.
	 *
	 * @param itemFacturas the item facturas
	 */
	public static void cacheResult(List<ItemFactura> itemFacturas) {
		getPersistence().cacheResult(itemFacturas);
	}

	/**
	 * Creates a new item factura with the primary key. Does not add the item factura to the database.
	 *
	 * @param itemFacturaId the primary key for the new item factura
	 * @return the new item factura
	 */
	public static ItemFactura create(long itemFacturaId) {
		return getPersistence().create(itemFacturaId);
	}

	/**
	 * Removes the item factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura that was removed
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	public static ItemFactura remove(long itemFacturaId)
		throws com.liferay.training.service.app.exception.
			NoSuchItemFacturaException {

		return getPersistence().remove(itemFacturaId);
	}

	public static ItemFactura updateImpl(ItemFactura itemFactura) {
		return getPersistence().updateImpl(itemFactura);
	}

	/**
	 * Returns the item factura with the primary key or throws a <code>NoSuchItemFacturaException</code> if it could not be found.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	public static ItemFactura findByPrimaryKey(long itemFacturaId)
		throws com.liferay.training.service.app.exception.
			NoSuchItemFacturaException {

		return getPersistence().findByPrimaryKey(itemFacturaId);
	}

	/**
	 * Returns the item factura with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura, or <code>null</code> if a item factura with the primary key could not be found
	 */
	public static ItemFactura fetchByPrimaryKey(long itemFacturaId) {
		return getPersistence().fetchByPrimaryKey(itemFacturaId);
	}

	/**
	 * Returns all the item facturas.
	 *
	 * @return the item facturas
	 */
	public static List<ItemFactura> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the item facturas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @return the range of item facturas
	 */
	public static List<ItemFactura> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the item facturas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of item facturas
	 */
	public static List<ItemFactura> findAll(
		int start, int end, OrderByComparator<ItemFactura> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item facturas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemFacturaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item facturas
	 * @param end the upper bound of the range of item facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of item facturas
	 */
	public static List<ItemFactura> findAll(
		int start, int end, OrderByComparator<ItemFactura> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the item facturas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of item facturas.
	 *
	 * @return the number of item facturas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ItemFacturaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ItemFacturaPersistence _persistence;

}