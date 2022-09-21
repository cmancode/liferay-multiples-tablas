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
import com.liferay.training.service.app.exception.NoSuchFacturaException;
import com.liferay.training.service.app.model.Factura;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factura service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FacturaUtil
 * @generated
 */
@ProviderType
public interface FacturaPersistence extends BasePersistence<Factura> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacturaUtil} to access the factura persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the matching facturas
	 */
	public java.util.List<Factura> findByFacturaId(long facturaId);

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
	public java.util.List<Factura> findByFacturaId(
		long facturaId, int start, int end);

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
	public java.util.List<Factura> findByFacturaId(
		long facturaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Factura>
			orderByComparator);

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
	public java.util.List<Factura> findByFacturaId(
		long facturaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Factura>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factura
	 * @throws NoSuchFacturaException if a matching factura could not be found
	 */
	public Factura findByFacturaId_First(
			long facturaId,
			com.liferay.portal.kernel.util.OrderByComparator<Factura>
				orderByComparator)
		throws NoSuchFacturaException;

	/**
	 * Returns the first factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factura, or <code>null</code> if a matching factura could not be found
	 */
	public Factura fetchByFacturaId_First(
		long facturaId,
		com.liferay.portal.kernel.util.OrderByComparator<Factura>
			orderByComparator);

	/**
	 * Returns the last factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factura
	 * @throws NoSuchFacturaException if a matching factura could not be found
	 */
	public Factura findByFacturaId_Last(
			long facturaId,
			com.liferay.portal.kernel.util.OrderByComparator<Factura>
				orderByComparator)
		throws NoSuchFacturaException;

	/**
	 * Returns the last factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factura, or <code>null</code> if a matching factura could not be found
	 */
	public Factura fetchByFacturaId_Last(
		long facturaId,
		com.liferay.portal.kernel.util.OrderByComparator<Factura>
			orderByComparator);

	/**
	 * Removes all the facturas where facturaId = &#63; from the database.
	 *
	 * @param facturaId the factura ID
	 */
	public void removeByFacturaId(long facturaId);

	/**
	 * Returns the number of facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the number of matching facturas
	 */
	public int countByFacturaId(long facturaId);

	/**
	 * Caches the factura in the entity cache if it is enabled.
	 *
	 * @param factura the factura
	 */
	public void cacheResult(Factura factura);

	/**
	 * Caches the facturas in the entity cache if it is enabled.
	 *
	 * @param facturas the facturas
	 */
	public void cacheResult(java.util.List<Factura> facturas);

	/**
	 * Creates a new factura with the primary key. Does not add the factura to the database.
	 *
	 * @param facturaId the primary key for the new factura
	 * @return the new factura
	 */
	public Factura create(long facturaId);

	/**
	 * Removes the factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param facturaId the primary key of the factura
	 * @return the factura that was removed
	 * @throws NoSuchFacturaException if a factura with the primary key could not be found
	 */
	public Factura remove(long facturaId) throws NoSuchFacturaException;

	public Factura updateImpl(Factura factura);

	/**
	 * Returns the factura with the primary key or throws a <code>NoSuchFacturaException</code> if it could not be found.
	 *
	 * @param facturaId the primary key of the factura
	 * @return the factura
	 * @throws NoSuchFacturaException if a factura with the primary key could not be found
	 */
	public Factura findByPrimaryKey(long facturaId)
		throws NoSuchFacturaException;

	/**
	 * Returns the factura with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param facturaId the primary key of the factura
	 * @return the factura, or <code>null</code> if a factura with the primary key could not be found
	 */
	public Factura fetchByPrimaryKey(long facturaId);

	/**
	 * Returns all the facturas.
	 *
	 * @return the facturas
	 */
	public java.util.List<Factura> findAll();

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
	public java.util.List<Factura> findAll(int start, int end);

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
	public java.util.List<Factura> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Factura>
			orderByComparator);

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
	public java.util.List<Factura> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Factura>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the facturas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of facturas.
	 *
	 * @return the number of facturas
	 */
	public int countAll();

}