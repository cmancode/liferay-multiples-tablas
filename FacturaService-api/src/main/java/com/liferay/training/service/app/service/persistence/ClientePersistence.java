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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.service.app.exception.NoSuchClienteException;
import com.liferay.training.service.app.model.Cliente;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cliente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClienteUtil
 * @generated
 */
@ProviderType
public interface ClientePersistence extends BasePersistence<Cliente> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClienteUtil} to access the cliente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the clientes where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @return the matching clientes
	 */
	public java.util.List<Cliente> findByClienteId(long clienteId);

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
	public java.util.List<Cliente> findByClienteId(
		long clienteId, int start, int end);

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
	public java.util.List<Cliente> findByClienteId(
		long clienteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cliente>
			orderByComparator);

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
	public java.util.List<Cliente> findByClienteId(
		long clienteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cliente>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cliente
	 * @throws NoSuchClienteException if a matching cliente could not be found
	 */
	public Cliente findByClienteId_First(
			long clienteId,
			com.liferay.portal.kernel.util.OrderByComparator<Cliente>
				orderByComparator)
		throws NoSuchClienteException;

	/**
	 * Returns the first cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
	 */
	public Cliente fetchByClienteId_First(
		long clienteId,
		com.liferay.portal.kernel.util.OrderByComparator<Cliente>
			orderByComparator);

	/**
	 * Returns the last cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cliente
	 * @throws NoSuchClienteException if a matching cliente could not be found
	 */
	public Cliente findByClienteId_Last(
			long clienteId,
			com.liferay.portal.kernel.util.OrderByComparator<Cliente>
				orderByComparator)
		throws NoSuchClienteException;

	/**
	 * Returns the last cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
	 */
	public Cliente fetchByClienteId_Last(
		long clienteId,
		com.liferay.portal.kernel.util.OrderByComparator<Cliente>
			orderByComparator);

	/**
	 * Removes all the clientes where clienteId = &#63; from the database.
	 *
	 * @param clienteId the cliente ID
	 */
	public void removeByClienteId(long clienteId);

	/**
	 * Returns the number of clientes where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @return the number of matching clientes
	 */
	public int countByClienteId(long clienteId);

	/**
	 * Caches the cliente in the entity cache if it is enabled.
	 *
	 * @param cliente the cliente
	 */
	public void cacheResult(Cliente cliente);

	/**
	 * Caches the clientes in the entity cache if it is enabled.
	 *
	 * @param clientes the clientes
	 */
	public void cacheResult(java.util.List<Cliente> clientes);

	/**
	 * Creates a new cliente with the primary key. Does not add the cliente to the database.
	 *
	 * @param clienteId the primary key for the new cliente
	 * @return the new cliente
	 */
	public Cliente create(long clienteId);

	/**
	 * Removes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente that was removed
	 * @throws NoSuchClienteException if a cliente with the primary key could not be found
	 */
	public Cliente remove(long clienteId) throws NoSuchClienteException;

	public Cliente updateImpl(Cliente cliente);

	/**
	 * Returns the cliente with the primary key or throws a <code>NoSuchClienteException</code> if it could not be found.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente
	 * @throws NoSuchClienteException if a cliente with the primary key could not be found
	 */
	public Cliente findByPrimaryKey(long clienteId)
		throws NoSuchClienteException;

	/**
	 * Returns the cliente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente, or <code>null</code> if a cliente with the primary key could not be found
	 */
	public Cliente fetchByPrimaryKey(long clienteId);

	/**
	 * Returns all the clientes.
	 *
	 * @return the clientes
	 */
	public java.util.List<Cliente> findAll();

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
	public java.util.List<Cliente> findAll(int start, int end);

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
	public java.util.List<Cliente> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cliente>
			orderByComparator);

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
	public java.util.List<Cliente> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cliente>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the clientes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of clientes.
	 *
	 * @return the number of clientes
	 */
	public int countAll();

}