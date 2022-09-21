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

package com.liferay.training.service.app.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.training.service.app.exception.NoSuchProductoException;
import com.liferay.training.service.app.model.Producto;
import com.liferay.training.service.app.model.ProductoTable;
import com.liferay.training.service.app.model.impl.ProductoImpl;
import com.liferay.training.service.app.model.impl.ProductoModelImpl;
import com.liferay.training.service.app.service.persistence.ProductoPersistence;
import com.liferay.training.service.app.service.persistence.ProductoUtil;
import com.liferay.training.service.app.service.persistence.impl.constants.FacturaServicePersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the producto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {ProductoPersistence.class, BasePersistence.class})
public class ProductoPersistenceImpl
	extends BasePersistenceImpl<Producto> implements ProductoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProductoUtil</code> to access the producto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProductoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByProductoId;
	private FinderPath _finderPathWithoutPaginationFindByProductoId;
	private FinderPath _finderPathCountByProductoId;

	/**
	 * Returns all the productos where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the matching productos
	 */
	@Override
	public List<Producto> findByProductoId(long productoId) {
		return findByProductoId(
			productoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Producto> findByProductoId(
		long productoId, int start, int end) {

		return findByProductoId(productoId, start, end, null);
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
	@Override
	public List<Producto> findByProductoId(
		long productoId, int start, int end,
		OrderByComparator<Producto> orderByComparator) {

		return findByProductoId(
			productoId, start, end, orderByComparator, true);
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
	@Override
	public List<Producto> findByProductoId(
		long productoId, int start, int end,
		OrderByComparator<Producto> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByProductoId;
				finderArgs = new Object[] {productoId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByProductoId;
			finderArgs = new Object[] {
				productoId, start, end, orderByComparator
			};
		}

		List<Producto> list = null;

		if (useFinderCache) {
			list = (List<Producto>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Producto producto : list) {
					if (productoId != producto.getProductoId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PRODUCTO_WHERE);

			sb.append(_FINDER_COLUMN_PRODUCTOID_PRODUCTOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ProductoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(productoId);

				list = (List<Producto>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching producto
	 * @throws NoSuchProductoException if a matching producto could not be found
	 */
	@Override
	public Producto findByProductoId_First(
			long productoId, OrderByComparator<Producto> orderByComparator)
		throws NoSuchProductoException {

		Producto producto = fetchByProductoId_First(
			productoId, orderByComparator);

		if (producto != null) {
			return producto;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("productoId=");
		sb.append(productoId);

		sb.append("}");

		throw new NoSuchProductoException(sb.toString());
	}

	/**
	 * Returns the first producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching producto, or <code>null</code> if a matching producto could not be found
	 */
	@Override
	public Producto fetchByProductoId_First(
		long productoId, OrderByComparator<Producto> orderByComparator) {

		List<Producto> list = findByProductoId(
			productoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching producto
	 * @throws NoSuchProductoException if a matching producto could not be found
	 */
	@Override
	public Producto findByProductoId_Last(
			long productoId, OrderByComparator<Producto> orderByComparator)
		throws NoSuchProductoException {

		Producto producto = fetchByProductoId_Last(
			productoId, orderByComparator);

		if (producto != null) {
			return producto;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("productoId=");
		sb.append(productoId);

		sb.append("}");

		throw new NoSuchProductoException(sb.toString());
	}

	/**
	 * Returns the last producto in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching producto, or <code>null</code> if a matching producto could not be found
	 */
	@Override
	public Producto fetchByProductoId_Last(
		long productoId, OrderByComparator<Producto> orderByComparator) {

		int count = countByProductoId(productoId);

		if (count == 0) {
			return null;
		}

		List<Producto> list = findByProductoId(
			productoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the productos where productoId = &#63; from the database.
	 *
	 * @param productoId the producto ID
	 */
	@Override
	public void removeByProductoId(long productoId) {
		for (Producto producto :
				findByProductoId(
					productoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(producto);
		}
	}

	/**
	 * Returns the number of productos where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the number of matching productos
	 */
	@Override
	public int countByProductoId(long productoId) {
		FinderPath finderPath = _finderPathCountByProductoId;

		Object[] finderArgs = new Object[] {productoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRODUCTO_WHERE);

			sb.append(_FINDER_COLUMN_PRODUCTOID_PRODUCTOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(productoId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PRODUCTOID_PRODUCTOID_2 =
		"producto.productoId = ?";

	public ProductoPersistenceImpl() {
		setModelClass(Producto.class);

		setModelImplClass(ProductoImpl.class);
		setModelPKClass(long.class);

		setTable(ProductoTable.INSTANCE);
	}

	/**
	 * Caches the producto in the entity cache if it is enabled.
	 *
	 * @param producto the producto
	 */
	@Override
	public void cacheResult(Producto producto) {
		entityCache.putResult(
			ProductoImpl.class, producto.getPrimaryKey(), producto);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the productos in the entity cache if it is enabled.
	 *
	 * @param productos the productos
	 */
	@Override
	public void cacheResult(List<Producto> productos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (productos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Producto producto : productos) {
			if (entityCache.getResult(
					ProductoImpl.class, producto.getPrimaryKey()) == null) {

				cacheResult(producto);
			}
		}
	}

	/**
	 * Clears the cache for all productos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProductoImpl.class);

		finderCache.clearCache(ProductoImpl.class);
	}

	/**
	 * Clears the cache for the producto.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Producto producto) {
		entityCache.removeResult(ProductoImpl.class, producto);
	}

	@Override
	public void clearCache(List<Producto> productos) {
		for (Producto producto : productos) {
			entityCache.removeResult(ProductoImpl.class, producto);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ProductoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ProductoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new producto with the primary key. Does not add the producto to the database.
	 *
	 * @param productoId the primary key for the new producto
	 * @return the new producto
	 */
	@Override
	public Producto create(long productoId) {
		Producto producto = new ProductoImpl();

		producto.setNew(true);
		producto.setPrimaryKey(productoId);

		return producto;
	}

	/**
	 * Removes the producto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto that was removed
	 * @throws NoSuchProductoException if a producto with the primary key could not be found
	 */
	@Override
	public Producto remove(long productoId) throws NoSuchProductoException {
		return remove((Serializable)productoId);
	}

	/**
	 * Removes the producto with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the producto
	 * @return the producto that was removed
	 * @throws NoSuchProductoException if a producto with the primary key could not be found
	 */
	@Override
	public Producto remove(Serializable primaryKey)
		throws NoSuchProductoException {

		Session session = null;

		try {
			session = openSession();

			Producto producto = (Producto)session.get(
				ProductoImpl.class, primaryKey);

			if (producto == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProductoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(producto);
		}
		catch (NoSuchProductoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Producto removeImpl(Producto producto) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(producto)) {
				producto = (Producto)session.get(
					ProductoImpl.class, producto.getPrimaryKeyObj());
			}

			if (producto != null) {
				session.delete(producto);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (producto != null) {
			clearCache(producto);
		}

		return producto;
	}

	@Override
	public Producto updateImpl(Producto producto) {
		boolean isNew = producto.isNew();

		if (!(producto instanceof ProductoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(producto.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(producto);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in producto proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Producto implementation " +
					producto.getClass());
		}

		ProductoModelImpl productoModelImpl = (ProductoModelImpl)producto;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(producto);
			}
			else {
				producto = (Producto)session.merge(producto);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProductoImpl.class, productoModelImpl, false, true);

		if (isNew) {
			producto.setNew(false);
		}

		producto.resetOriginalValues();

		return producto;
	}

	/**
	 * Returns the producto with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the producto
	 * @return the producto
	 * @throws NoSuchProductoException if a producto with the primary key could not be found
	 */
	@Override
	public Producto findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProductoException {

		Producto producto = fetchByPrimaryKey(primaryKey);

		if (producto == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProductoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return producto;
	}

	/**
	 * Returns the producto with the primary key or throws a <code>NoSuchProductoException</code> if it could not be found.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto
	 * @throws NoSuchProductoException if a producto with the primary key could not be found
	 */
	@Override
	public Producto findByPrimaryKey(long productoId)
		throws NoSuchProductoException {

		return findByPrimaryKey((Serializable)productoId);
	}

	/**
	 * Returns the producto with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productoId the primary key of the producto
	 * @return the producto, or <code>null</code> if a producto with the primary key could not be found
	 */
	@Override
	public Producto fetchByPrimaryKey(long productoId) {
		return fetchByPrimaryKey((Serializable)productoId);
	}

	/**
	 * Returns all the productos.
	 *
	 * @return the productos
	 */
	@Override
	public List<Producto> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Producto> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Producto> findAll(
		int start, int end, OrderByComparator<Producto> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Producto> findAll(
		int start, int end, OrderByComparator<Producto> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Producto> list = null;

		if (useFinderCache) {
			list = (List<Producto>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PRODUCTO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUCTO;

				sql = sql.concat(ProductoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Producto>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the productos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Producto producto : findAll()) {
			remove(producto);
		}
	}

	/**
	 * Returns the number of productos.
	 *
	 * @return the number of productos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PRODUCTO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "productoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PRODUCTO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProductoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the producto persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByProductoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProductoId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"productoId"}, true);

		_finderPathWithoutPaginationFindByProductoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProductoId",
			new String[] {Long.class.getName()}, new String[] {"productoId"},
			true);

		_finderPathCountByProductoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductoId",
			new String[] {Long.class.getName()}, new String[] {"productoId"},
			false);

		_setProductoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setProductoUtilPersistence(null);

		entityCache.removeCache(ProductoImpl.class.getName());
	}

	private void _setProductoUtilPersistence(
		ProductoPersistence productoPersistence) {

		try {
			Field field = ProductoUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, productoPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FacturaServicePersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FacturaServicePersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FacturaServicePersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PRODUCTO =
		"SELECT producto FROM Producto producto";

	private static final String _SQL_SELECT_PRODUCTO_WHERE =
		"SELECT producto FROM Producto producto WHERE ";

	private static final String _SQL_COUNT_PRODUCTO =
		"SELECT COUNT(producto) FROM Producto producto";

	private static final String _SQL_COUNT_PRODUCTO_WHERE =
		"SELECT COUNT(producto) FROM Producto producto WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "producto.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Producto exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Producto exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProductoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private ProductoModelArgumentsResolver _productoModelArgumentsResolver;

}