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
import com.liferay.training.service.app.exception.NoSuchItemFacturaException;
import com.liferay.training.service.app.model.ItemFactura;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the item factura service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemFacturaUtil
 * @generated
 */
@ProviderType
public interface ItemFacturaPersistence extends BasePersistence<ItemFactura> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ItemFacturaUtil} to access the item factura persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the item facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the matching item facturas
	 */
	public java.util.List<ItemFactura> findByFacturaId(long facturaId);

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
	public java.util.List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end);

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
	public java.util.List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator);

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
	public java.util.List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	public ItemFactura findByFacturaId_First(
			long facturaId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
				orderByComparator)
		throws NoSuchItemFacturaException;

	/**
	 * Returns the first item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	public ItemFactura fetchByFacturaId_First(
		long facturaId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator);

	/**
	 * Returns the last item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	public ItemFactura findByFacturaId_Last(
			long facturaId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
				orderByComparator)
		throws NoSuchItemFacturaException;

	/**
	 * Returns the last item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	public ItemFactura fetchByFacturaId_Last(
		long facturaId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator);

	/**
	 * Returns the item facturas before and after the current item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param itemFacturaId the primary key of the current item factura
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item factura
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	public ItemFactura[] findByFacturaId_PrevAndNext(
			long itemFacturaId, long facturaId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
				orderByComparator)
		throws NoSuchItemFacturaException;

	/**
	 * Removes all the item facturas where facturaId = &#63; from the database.
	 *
	 * @param facturaId the factura ID
	 */
	public void removeByFacturaId(long facturaId);

	/**
	 * Returns the number of item facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the number of matching item facturas
	 */
	public int countByFacturaId(long facturaId);

	/**
	 * Returns all the item facturas where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the matching item facturas
	 */
	public java.util.List<ItemFactura> findByProductoId(long productoId);

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
	public java.util.List<ItemFactura> findByProductoId(
		long productoId, int start, int end);

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
	public java.util.List<ItemFactura> findByProductoId(
		long productoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator);

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
	public java.util.List<ItemFactura> findByProductoId(
		long productoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	public ItemFactura findByProductoId_First(
			long productoId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
				orderByComparator)
		throws NoSuchItemFacturaException;

	/**
	 * Returns the first item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	public ItemFactura fetchByProductoId_First(
		long productoId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator);

	/**
	 * Returns the last item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	public ItemFactura findByProductoId_Last(
			long productoId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
				orderByComparator)
		throws NoSuchItemFacturaException;

	/**
	 * Returns the last item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	public ItemFactura fetchByProductoId_Last(
		long productoId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator);

	/**
	 * Returns the item facturas before and after the current item factura in the ordered set where productoId = &#63;.
	 *
	 * @param itemFacturaId the primary key of the current item factura
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item factura
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	public ItemFactura[] findByProductoId_PrevAndNext(
			long itemFacturaId, long productoId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
				orderByComparator)
		throws NoSuchItemFacturaException;

	/**
	 * Removes all the item facturas where productoId = &#63; from the database.
	 *
	 * @param productoId the producto ID
	 */
	public void removeByProductoId(long productoId);

	/**
	 * Returns the number of item facturas where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the number of matching item facturas
	 */
	public int countByProductoId(long productoId);

	/**
	 * Caches the item factura in the entity cache if it is enabled.
	 *
	 * @param itemFactura the item factura
	 */
	public void cacheResult(ItemFactura itemFactura);

	/**
	 * Caches the item facturas in the entity cache if it is enabled.
	 *
	 * @param itemFacturas the item facturas
	 */
	public void cacheResult(java.util.List<ItemFactura> itemFacturas);

	/**
	 * Creates a new item factura with the primary key. Does not add the item factura to the database.
	 *
	 * @param itemFacturaId the primary key for the new item factura
	 * @return the new item factura
	 */
	public ItemFactura create(long itemFacturaId);

	/**
	 * Removes the item factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura that was removed
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	public ItemFactura remove(long itemFacturaId)
		throws NoSuchItemFacturaException;

	public ItemFactura updateImpl(ItemFactura itemFactura);

	/**
	 * Returns the item factura with the primary key or throws a <code>NoSuchItemFacturaException</code> if it could not be found.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	public ItemFactura findByPrimaryKey(long itemFacturaId)
		throws NoSuchItemFacturaException;

	/**
	 * Returns the item factura with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura, or <code>null</code> if a item factura with the primary key could not be found
	 */
	public ItemFactura fetchByPrimaryKey(long itemFacturaId);

	/**
	 * Returns all the item facturas.
	 *
	 * @return the item facturas
	 */
	public java.util.List<ItemFactura> findAll();

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
	public java.util.List<ItemFactura> findAll(int start, int end);

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
	public java.util.List<ItemFactura> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator);

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
	public java.util.List<ItemFactura> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFactura>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the item facturas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of item facturas.
	 *
	 * @return the number of item facturas
	 */
	public int countAll();

}