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
import com.liferay.training.service.app.model.Producto;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the producto service. This utility wraps <code>com.liferay.training.service.app.service.persistence.impl.ProductoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductoPersistence
 * @generated
 */
public class ProductoUtil {

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
	public static void clearCache(Producto producto) {
		getPersistence().clearCache(producto);
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
	public static Map<Serializable, Producto> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Producto> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Producto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Producto> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Producto> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Producto update(Producto producto) {
		return getPersistence().update(producto);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Producto update(
		Producto producto, ServiceContext serviceContext) {

		return getPersistence().update(producto, serviceContext);
	}

	/**
	 * Returns all the productos where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the matching productos
	 */
	public static List<Producto> findByProductoId(long productoId) {
		return getPersistence().findByProductoId(productoId);
	}

	/**
	 * Returns a range of all the productos where productoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductoModelImpl</code>.
	 * </p>
	 *
	 * @param productoId the producto ID
	 * @param start the lower bound of the range of productos
	 * @param end the upper bound of the range of productos (not inclusive)
	 * @return the range of matching productos
	 */
	public static List<Producto> findByProductoId(
		long productoId, int start, int end) {

		return getPersistence().findByProductoId(productoId, start, end);
	}

	/**
	 * Returns an ordered range of all the productos where productoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductoModelImpl</code>.
	 * </p>
	 *
	 * @param productoId the producto ID
	 * @param start the lower bound of the range of productos
	 * @param end the upper bound of the range of productos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productos
	 */
	public static List<Producto> findByProductoId(
		long productoId, int start, int end,
		OrderByComparator<Producto> orderByComparator) {

		return getPersistence().findByProductoId(
			productoId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productos where productoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductoModelImpl</code>.
	 * </p>
	 *
	 * @param productoId the producto ID
	 * @param start the lower bound of the range of productos
	 * @param end the upper bound of the range of productos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productos
	 */
	public static List<Producto> findByProductoId(
		long productoId, int start, int end,
		OrderByComparator<Producto> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByProductoId(
			productoId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching producto
	 * @throws NoSuchProductoException if a matching producto could not be found
	 */
	public static Producto findByProductoId_First(
			long productoId, OrderByComparator<Producto> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchProductoException {

		return getPersistence().findByProductoId_First(
			productoId, orderByComparator);
	}

	/**
	 * Returns the first producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching producto, or <code>null</code> if a matching producto could not be found
	 */
	public static Producto fetchByProductoId_First(
		long productoId, OrderByComparator<Producto> orderByComparator) {

		return getPersistence().fetchByProductoId_First(
			productoId, orderByComparator);
	}

	/**
	 * Returns the last producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching producto
	 * @throws NoSuchProductoException if a matching producto could not be found
	 */
	public static Producto findByProductoId_Last(
			long productoId, OrderByComparator<Producto> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchProductoException {

		return getPersistence().findByProductoId_Last(
			productoId, orderByComparator);
	}

	/**
	 * Returns the last producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching producto, or <code>null</code> if a matching producto could not be found
	 */
	public static Producto fetchByProductoId_Last(
		long productoId, OrderByComparator<Producto> orderByComparator) {

		return getPersistence().fetchByProductoId_Last(
			productoId, orderByComparator);
	}

	/**
	 * Removes all the productos where productoId = &#63; from the database.
	 *
	 * @param productoId the producto ID
	 */
	public static void removeByProductoId(long productoId) {
		getPersistence().removeByProductoId(productoId);
	}

	/**
	 * Returns the number of productos where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the number of matching productos
	 */
	public static int countByProductoId(long productoId) {
		return getPersistence().countByProductoId(productoId);
	}

	/**
	 * Caches the producto in the entity cache if it is enabled.
	 *
	 * @param producto the producto
	 */
	public static void cacheResult(Producto producto) {
		getPersistence().cacheResult(producto);
	}

	/**
	 * Caches the productos in the entity cache if it is enabled.
	 *
	 * @param productos the productos
	 */
	public static void cacheResult(List<Producto> productos) {
		getPersistence().cacheResult(productos);
	}

	/**
	 * Creates a new producto with the primary key. Does not add the producto to the database.
	 *
	 * @param productoId the primary key for the new producto
	 * @return the new producto
	 */
	public static Producto create(long productoId) {
		return getPersistence().create(productoId);
	}

	/**
	 * Removes the producto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto that was removed
	 * @throws NoSuchProductoException if a producto with the primary key could not be found
	 */
	public static Producto remove(long productoId)
		throws com.liferay.training.service.app.exception.
			NoSuchProductoException {

		return getPersistence().remove(productoId);
	}

	public static Producto updateImpl(Producto producto) {
		return getPersistence().updateImpl(producto);
	}

	/**
	 * Returns the producto with the primary key or throws a <code>NoSuchProductoException</code> if it could not be found.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto
	 * @throws NoSuchProductoException if a producto with the primary key could not be found
	 */
	public static Producto findByPrimaryKey(long productoId)
		throws com.liferay.training.service.app.exception.
			NoSuchProductoException {

		return getPersistence().findByPrimaryKey(productoId);
	}

	/**
	 * Returns the producto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto, or <code>null</code> if a producto with the primary key could not be found
	 */
	public static Producto fetchByPrimaryKey(long productoId) {
		return getPersistence().fetchByPrimaryKey(productoId);
	}

	/**
	 * Returns all the productos.
	 *
	 * @return the productos
	 */
	public static List<Producto> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the productos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productos
	 * @param end the upper bound of the range of productos (not inclusive)
	 * @return the range of productos
	 */
	public static List<Producto> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the productos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productos
	 * @param end the upper bound of the range of productos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of productos
	 */
	public static List<Producto> findAll(
		int start, int end, OrderByComparator<Producto> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productos
	 * @param end the upper bound of the range of productos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of productos
	 */
	public static List<Producto> findAll(
		int start, int end, OrderByComparator<Producto> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the productos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of productos.
	 *
	 * @return the number of productos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProductoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ProductoPersistence _persistence;

}