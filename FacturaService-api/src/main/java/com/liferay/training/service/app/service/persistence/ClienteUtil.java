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
import com.liferay.training.service.app.model.Cliente;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cliente service. This utility wraps <code>com.liferay.training.service.app.service.persistence.impl.ClientePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClientePersistence
 * @generated
 */
public class ClienteUtil {

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
	public static void clearCache(Cliente cliente) {
		getPersistence().clearCache(cliente);
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
	public static Map<Serializable, Cliente> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Cliente> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Cliente> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Cliente> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Cliente> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Cliente update(Cliente cliente) {
		return getPersistence().update(cliente);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Cliente update(
		Cliente cliente, ServiceContext serviceContext) {

		return getPersistence().update(cliente, serviceContext);
	}

	/**
	 * Returns all the clientes where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @return the matching clientes
	 */
	public static List<Cliente> findByClienteId(long clienteId) {
		return getPersistence().findByClienteId(clienteId);
	}

	/**
	 * Returns a range of all the clientes where clienteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClienteModelImpl</code>.
	 * </p>
	 *
	 * @param clienteId the cliente ID
	 * @param start the lower bound of the range of clientes
	 * @param end the upper bound of the range of clientes (not inclusive)
	 * @return the range of matching clientes
	 */
	public static List<Cliente> findByClienteId(
		long clienteId, int start, int end) {

		return getPersistence().findByClienteId(clienteId, start, end);
	}

	/**
	 * Returns an ordered range of all the clientes where clienteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClienteModelImpl</code>.
	 * </p>
	 *
	 * @param clienteId the cliente ID
	 * @param start the lower bound of the range of clientes
	 * @param end the upper bound of the range of clientes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching clientes
	 */
	public static List<Cliente> findByClienteId(
		long clienteId, int start, int end,
		OrderByComparator<Cliente> orderByComparator) {

		return getPersistence().findByClienteId(
			clienteId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the clientes where clienteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClienteModelImpl</code>.
	 * </p>
	 *
	 * @param clienteId the cliente ID
	 * @param start the lower bound of the range of clientes
	 * @param end the upper bound of the range of clientes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching clientes
	 */
	public static List<Cliente> findByClienteId(
		long clienteId, int start, int end,
		OrderByComparator<Cliente> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByClienteId(
			clienteId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cliente
	 * @throws NoSuchClienteException if a matching cliente could not be found
	 */
	public static Cliente findByClienteId_First(
			long clienteId, OrderByComparator<Cliente> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchClienteException {

		return getPersistence().findByClienteId_First(
			clienteId, orderByComparator);
	}

	/**
	 * Returns the first cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
	 */
	public static Cliente fetchByClienteId_First(
		long clienteId, OrderByComparator<Cliente> orderByComparator) {

		return getPersistence().fetchByClienteId_First(
			clienteId, orderByComparator);
	}

	/**
	 * Returns the last cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cliente
	 * @throws NoSuchClienteException if a matching cliente could not be found
	 */
	public static Cliente findByClienteId_Last(
			long clienteId, OrderByComparator<Cliente> orderByComparator)
		throws com.liferay.training.service.app.exception.
			NoSuchClienteException {

		return getPersistence().findByClienteId_Last(
			clienteId, orderByComparator);
	}

	/**
	 * Returns the last cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
	 */
	public static Cliente fetchByClienteId_Last(
		long clienteId, OrderByComparator<Cliente> orderByComparator) {

		return getPersistence().fetchByClienteId_Last(
			clienteId, orderByComparator);
	}

	/**
	 * Removes all the clientes where clienteId = &#63; from the database.
	 *
	 * @param clienteId the cliente ID
	 */
	public static void removeByClienteId(long clienteId) {
		getPersistence().removeByClienteId(clienteId);
	}

	/**
	 * Returns the number of clientes where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @return the number of matching clientes
	 */
	public static int countByClienteId(long clienteId) {
		return getPersistence().countByClienteId(clienteId);
	}

	/**
	 * Caches the cliente in the entity cache if it is enabled.
	 *
	 * @param cliente the cliente
	 */
	public static void cacheResult(Cliente cliente) {
		getPersistence().cacheResult(cliente);
	}

	/**
	 * Caches the clientes in the entity cache if it is enabled.
	 *
	 * @param clientes the clientes
	 */
	public static void cacheResult(List<Cliente> clientes) {
		getPersistence().cacheResult(clientes);
	}

	/**
	 * Creates a new cliente with the primary key. Does not add the cliente to the database.
	 *
	 * @param clienteId the primary key for the new cliente
	 * @return the new cliente
	 */
	public static Cliente create(long clienteId) {
		return getPersistence().create(clienteId);
	}

	/**
	 * Removes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente that was removed
	 * @throws NoSuchClienteException if a cliente with the primary key could not be found
	 */
	public static Cliente remove(long clienteId)
		throws com.liferay.training.service.app.exception.
			NoSuchClienteException {

		return getPersistence().remove(clienteId);
	}

	public static Cliente updateImpl(Cliente cliente) {
		return getPersistence().updateImpl(cliente);
	}

	/**
	 * Returns the cliente with the primary key or throws a <code>NoSuchClienteException</code> if it could not be found.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente
	 * @throws NoSuchClienteException if a cliente with the primary key could not be found
	 */
	public static Cliente findByPrimaryKey(long clienteId)
		throws com.liferay.training.service.app.exception.
			NoSuchClienteException {

		return getPersistence().findByPrimaryKey(clienteId);
	}

	/**
	 * Returns the cliente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente, or <code>null</code> if a cliente with the primary key could not be found
	 */
	public static Cliente fetchByPrimaryKey(long clienteId) {
		return getPersistence().fetchByPrimaryKey(clienteId);
	}

	/**
	 * Returns all the clientes.
	 *
	 * @return the clientes
	 */
	public static List<Cliente> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the clientes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClienteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of clientes
	 * @param end the upper bound of the range of clientes (not inclusive)
	 * @return the range of clientes
	 */
	public static List<Cliente> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the clientes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClienteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of clientes
	 * @param end the upper bound of the range of clientes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of clientes
	 */
	public static List<Cliente> findAll(
		int start, int end, OrderByComparator<Cliente> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the clientes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ClienteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of clientes
	 * @param end the upper bound of the range of clientes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of clientes
	 */
	public static List<Cliente> findAll(
		int start, int end, OrderByComparator<Cliente> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the clientes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of clientes.
	 *
	 * @return the number of clientes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ClientePersistence getPersistence() {
		return _persistence;
	}

	private static volatile ClientePersistence _persistence;

}