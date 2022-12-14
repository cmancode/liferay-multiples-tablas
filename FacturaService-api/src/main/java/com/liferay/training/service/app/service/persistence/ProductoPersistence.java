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
import com.liferay.training.service.app.exception.NoSuchProductoException;
import com.liferay.training.service.app.model.Producto;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the producto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductoUtil
 * @generated
 */
@ProviderType
public interface ProductoPersistence extends BasePersistence<Producto> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductoUtil} to access the producto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the productos where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the matching productos
	 */
	public java.util.List<Producto> findByProductoId(long productoId);

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
	public java.util.List<Producto> findByProductoId(
		long productoId, int start, int end);

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
	public java.util.List<Producto> findByProductoId(
		long productoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Producto>
			orderByComparator);

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
	public java.util.List<Producto> findByProductoId(
		long productoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Producto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching producto
	 * @throws NoSuchProductoException if a matching producto could not be found
	 */
	public Producto findByProductoId_First(
			long productoId,
			com.liferay.portal.kernel.util.OrderByComparator<Producto>
				orderByComparator)
		throws NoSuchProductoException;

	/**
	 * Returns the first producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching producto, or <code>null</code> if a matching producto could not be found
	 */
	public Producto fetchByProductoId_First(
		long productoId,
		com.liferay.portal.kernel.util.OrderByComparator<Producto>
			orderByComparator);

	/**
	 * Returns the last producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching producto
	 * @throws NoSuchProductoException if a matching producto could not be found
	 */
	public Producto findByProductoId_Last(
			long productoId,
			com.liferay.portal.kernel.util.OrderByComparator<Producto>
				orderByComparator)
		throws NoSuchProductoException;

	/**
	 * Returns the last producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching producto, or <code>null</code> if a matching producto could not be found
	 */
	public Producto fetchByProductoId_Last(
		long productoId,
		com.liferay.portal.kernel.util.OrderByComparator<Producto>
			orderByComparator);

	/**
	 * Removes all the productos where productoId = &#63; from the database.
	 *
	 * @param productoId the producto ID
	 */
	public void removeByProductoId(long productoId);

	/**
	 * Returns the number of productos where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the number of matching productos
	 */
	public int countByProductoId(long productoId);

	/**
	 * Caches the producto in the entity cache if it is enabled.
	 *
	 * @param producto the producto
	 */
	public void cacheResult(Producto producto);

	/**
	 * Caches the productos in the entity cache if it is enabled.
	 *
	 * @param productos the productos
	 */
	public void cacheResult(java.util.List<Producto> productos);

	/**
	 * Creates a new producto with the primary key. Does not add the producto to the database.
	 *
	 * @param productoId the primary key for the new producto
	 * @return the new producto
	 */
	public Producto create(long productoId);

	/**
	 * Removes the producto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto that was removed
	 * @throws NoSuchProductoException if a producto with the primary key could not be found
	 */
	public Producto remove(long productoId) throws NoSuchProductoException;

	public Producto updateImpl(Producto producto);

	/**
	 * Returns the producto with the primary key or throws a <code>NoSuchProductoException</code> if it could not be found.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto
	 * @throws NoSuchProductoException if a producto with the primary key could not be found
	 */
	public Producto findByPrimaryKey(long productoId)
		throws NoSuchProductoException;

	/**
	 * Returns the producto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto, or <code>null</code> if a producto with the primary key could not be found
	 */
	public Producto fetchByPrimaryKey(long productoId);

	/**
	 * Returns all the productos.
	 *
	 * @return the productos
	 */
	public java.util.List<Producto> findAll();

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
	public java.util.List<Producto> findAll(int start, int end);

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
	public java.util.List<Producto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Producto>
			orderByComparator);

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
	public java.util.List<Producto> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Producto>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the productos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of productos.
	 *
	 * @return the number of productos
	 */
	public int countAll();

}