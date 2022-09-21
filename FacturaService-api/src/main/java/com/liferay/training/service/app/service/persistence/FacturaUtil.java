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
import com.liferay.training.service.app.model.Factura;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factura service. This utility wraps <code>com.liferay.training.service.app.service.persistence.impl.FacturaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FacturaPersistence
 * @generated
 */
public class FacturaUtil {

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
	public static void clearCache(Factura factura) {
		getPersistence().clearCache(factura);
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
	public static Map<Serializable, Factura> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Factura> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Factura> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Factura> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Factura> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Factura update(Factura factura) {
		return getPersistence().update(factura);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Factura update(
		Factura factura, ServiceContext serviceContext) {

		return getPersistence().update(factura, serviceContext);
	}

	/**
	 * Returns all the facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the matching facturas
	 */
	public static List<Factura> findByFacturaId(long facturaId) {
		return getPersistence().findByFacturaId(facturaId);
	}

	/**
	 * Returns a range of all the facturas where facturaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param facturaId the factura ID
	 * @param start the lower bound of the range of facturas
	 * @param end the upper bound of the range of facturas (not inclusive)
	 * @return the range of matching facturas
	 */
	public static List<Factura> findByFacturaId(
		long facturaId, int start, int end) {

		return getPersistence().findByFacturaId(facturaId, start, end);
	}

	/**
	 * Returns an ordered range of all the facturas where facturaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param facturaId the factura ID
	 * @param start the lower bound of the range of facturas
	 * @param end the upper bound of the range of facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching facturas
	 */
	public static List<Factura> findByFacturaId(
		long facturaId, int start, int end,
		OrderByComparator<Factura> orderByComparator) {

		return getPersistence().findByFacturaId(
			facturaId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the facturas where facturaId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param facturaId the factura ID
	 * @param start the lower bound of the range of facturas
	 * @param end the upper bound of the range of facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching facturas
	 */
	public static List<Factura> findByFacturaId(
		long facturaId, int start, int end,
		OrderByComparator<Factura> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByFacturaId(
			facturaId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factura
	 * @throws NoSuchFacturaException if a matching factura could not be found
	 */
	public static Factura findByFacturaId_First(
			long facturaId, OrderByComparator<Factura> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchFacturaException {

		return getPersistence().findByFacturaId_First(
			facturaId, orderByComparator);
	}

	/**
	 * Returns the first factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factura, or <code>null</code> if a matching factura could not be found
	 */
	public static Factura fetchByFacturaId_First(
		long facturaId, OrderByComparator<Factura> orderByComparator) {

		return getPersistence().fetchByFacturaId_First(
			facturaId, orderByComparator);
	}

	/**
	 * Returns the last factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factura
	 * @throws NoSuchFacturaException if a matching factura could not be found
	 */
	public static Factura findByFacturaId_Last(
			long facturaId, OrderByComparator<Factura> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchFacturaException {

		return getPersistence().findByFacturaId_Last(
			facturaId, orderByComparator);
	}

	/**
	 * Returns the last factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factura, or <code>null</code> if a matching factura could not be found
	 */
	public static Factura fetchByFacturaId_Last(
		long facturaId, OrderByComparator<Factura> orderByComparator) {

		return getPersistence().fetchByFacturaId_Last(
			facturaId, orderByComparator);
	}

	/**
	 * Removes all the facturas where facturaId = &#63; from the database.
	 *
	 * @param facturaId the factura ID
	 */
	public static void removeByFacturaId(long facturaId) {
		getPersistence().removeByFacturaId(facturaId);
	}

	/**
	 * Returns the number of facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the number of matching facturas
	 */
	public static int countByFacturaId(long facturaId) {
		return getPersistence().countByFacturaId(facturaId);
	}

	/**
	 * Caches the factura in the entity cache if it is enabled.
	 *
	 * @param factura the factura
	 */
	public static void cacheResult(Factura factura) {
		getPersistence().cacheResult(factura);
	}

	/**
	 * Caches the facturas in the entity cache if it is enabled.
	 *
	 * @param facturas the facturas
	 */
	public static void cacheResult(List<Factura> facturas) {
		getPersistence().cacheResult(facturas);
	}

	/**
	 * Creates a new factura with the primary key. Does not add the factura to the database.
	 *
	 * @param facturaId the primary key for the new factura
	 * @return the new factura
	 */
	public static Factura create(long facturaId) {
		return getPersistence().create(facturaId);
	}

	/**
	 * Removes the factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param facturaId the primary key of the factura
	 * @return the factura that was removed
	 * @throws NoSuchFacturaException if a factura with the primary key could not be found
	 */
	public static Factura remove(long facturaId)
		throws com.liferay.training.service.app.exception.
			NoSuchFacturaException {

		return getPersistence().remove(facturaId);
	}

	public static Factura updateImpl(Factura factura) {
		return getPersistence().updateImpl(factura);
	}

	/**
	 * Returns the factura with the primary key or throws a <code>NoSuchFacturaException</code> if it could not be found.
	 *
	 * @param facturaId the primary key of the factura
	 * @return the factura
	 * @throws NoSuchFacturaException if a factura with the primary key could not be found
	 */
	public static Factura findByPrimaryKey(long facturaId)
		throws com.liferay.training.service.app.exception.
			NoSuchFacturaException {

		return getPersistence().findByPrimaryKey(facturaId);
	}

	/**
	 * Returns the factura with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param facturaId the primary key of the factura
	 * @return the factura, or <code>null</code> if a factura with the primary key could not be found
	 */
	public static Factura fetchByPrimaryKey(long facturaId) {
		return getPersistence().fetchByPrimaryKey(facturaId);
	}

	/**
	 * Returns all the facturas.
	 *
	 * @return the facturas
	 */
	public static List<Factura> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the facturas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of facturas
	 * @param end the upper bound of the range of facturas (not inclusive)
	 * @return the range of facturas
	 */
	public static List<Factura> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the facturas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of facturas
	 * @param end the upper bound of the range of facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facturas
	 */
	public static List<Factura> findAll(
		int start, int end, OrderByComparator<Factura> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the facturas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of facturas
	 * @param end the upper bound of the range of facturas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of facturas
	 */
	public static List<Factura> findAll(
		int start, int end, OrderByComparator<Factura> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the facturas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of facturas.
	 *
	 * @return the number of facturas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FacturaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FacturaPersistence _persistence;

}