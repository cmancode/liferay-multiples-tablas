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
import com.liferay.training.service.app.exception.NoSuchItemFacturaException;
import com.liferay.training.service.app.model.ItemFactura;
import com.liferay.training.service.app.model.ItemFacturaTable;
import com.liferay.training.service.app.model.impl.ItemFacturaImpl;
import com.liferay.training.service.app.model.impl.ItemFacturaModelImpl;
import com.liferay.training.service.app.service.persistence.ItemFacturaPersistence;
import com.liferay.training.service.app.service.persistence.ItemFacturaUtil;
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
 * The persistence implementation for the item factura service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {ItemFacturaPersistence.class, BasePersistence.class})
public class ItemFacturaPersistenceImpl
	extends BasePersistenceImpl<ItemFactura> implements ItemFacturaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ItemFacturaUtil</code> to access the item factura persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ItemFacturaImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByFacturaId;
	private FinderPath _finderPathWithoutPaginationFindByFacturaId;
	private FinderPath _finderPathCountByFacturaId;

	/**
	 * Returns all the item facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the matching item facturas
	 */
	@Override
	public List<ItemFactura> findByFacturaId(long facturaId) {
		return findByFacturaId(
			facturaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end) {

		return findByFacturaId(facturaId, start, end, null);
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
	@Override
	public List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator) {

		return findByFacturaId(facturaId, start, end, orderByComparator, true);
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
	@Override
	public List<ItemFactura> findByFacturaId(
		long facturaId, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByFacturaId;
				finderArgs = new Object[] {facturaId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByFacturaId;
			finderArgs = new Object[] {
				facturaId, start, end, orderByComparator
			};
		}

		List<ItemFactura> list = null;

		if (useFinderCache) {
			list = (List<ItemFactura>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (ItemFactura itemFactura : list) {
					if (facturaId != itemFactura.getFacturaId()) {
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

			sb.append(_SQL_SELECT_ITEMFACTURA_WHERE);

			sb.append(_FINDER_COLUMN_FACTURAID_FACTURAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ItemFacturaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(facturaId);

				list = (List<ItemFactura>)QueryUtil.list(
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
	 * Returns the first item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	@Override
	public ItemFactura findByFacturaId_First(
			long facturaId, OrderByComparator<ItemFactura> orderByComparator)
		throws NoSuchItemFacturaException {

		ItemFactura itemFactura = fetchByFacturaId_First(
			facturaId, orderByComparator);

		if (itemFactura != null) {
			return itemFactura;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("facturaId=");
		sb.append(facturaId);

		sb.append("}");

		throw new NoSuchItemFacturaException(sb.toString());
	}

	/**
	 * Returns the first item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	@Override
	public ItemFactura fetchByFacturaId_First(
		long facturaId, OrderByComparator<ItemFactura> orderByComparator) {

		List<ItemFactura> list = findByFacturaId(
			facturaId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	@Override
	public ItemFactura findByFacturaId_Last(
			long facturaId, OrderByComparator<ItemFactura> orderByComparator)
		throws NoSuchItemFacturaException {

		ItemFactura itemFactura = fetchByFacturaId_Last(
			facturaId, orderByComparator);

		if (itemFactura != null) {
			return itemFactura;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("facturaId=");
		sb.append(facturaId);

		sb.append("}");

		throw new NoSuchItemFacturaException(sb.toString());
	}

	/**
	 * Returns the last item factura in the ordered set where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	@Override
	public ItemFactura fetchByFacturaId_Last(
		long facturaId, OrderByComparator<ItemFactura> orderByComparator) {

		int count = countByFacturaId(facturaId);

		if (count == 0) {
			return null;
		}

		List<ItemFactura> list = findByFacturaId(
			facturaId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemFactura[] findByFacturaId_PrevAndNext(
			long itemFacturaId, long facturaId,
			OrderByComparator<ItemFactura> orderByComparator)
		throws NoSuchItemFacturaException {

		ItemFactura itemFactura = findByPrimaryKey(itemFacturaId);

		Session session = null;

		try {
			session = openSession();

			ItemFactura[] array = new ItemFacturaImpl[3];

			array[0] = getByFacturaId_PrevAndNext(
				session, itemFactura, facturaId, orderByComparator, true);

			array[1] = itemFactura;

			array[2] = getByFacturaId_PrevAndNext(
				session, itemFactura, facturaId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ItemFactura getByFacturaId_PrevAndNext(
		Session session, ItemFactura itemFactura, long facturaId,
		OrderByComparator<ItemFactura> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ITEMFACTURA_WHERE);

		sb.append(_FINDER_COLUMN_FACTURAID_FACTURAID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ItemFacturaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(facturaId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(itemFactura)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ItemFactura> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the item facturas where facturaId = &#63; from the database.
	 *
	 * @param facturaId the factura ID
	 */
	@Override
	public void removeByFacturaId(long facturaId) {
		for (ItemFactura itemFactura :
				findByFacturaId(
					facturaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(itemFactura);
		}
	}

	/**
	 * Returns the number of item facturas where facturaId = &#63;.
	 *
	 * @param facturaId the factura ID
	 * @return the number of matching item facturas
	 */
	@Override
	public int countByFacturaId(long facturaId) {
		FinderPath finderPath = _finderPathCountByFacturaId;

		Object[] finderArgs = new Object[] {facturaId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ITEMFACTURA_WHERE);

			sb.append(_FINDER_COLUMN_FACTURAID_FACTURAID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(facturaId);

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

	private static final String _FINDER_COLUMN_FACTURAID_FACTURAID_2 =
		"itemFactura.facturaId = ?";

	private FinderPath _finderPathWithPaginationFindByProductoId;
	private FinderPath _finderPathWithoutPaginationFindByProductoId;
	private FinderPath _finderPathCountByProductoId;

	/**
	 * Returns all the item facturas where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the matching item facturas
	 */
	@Override
	public List<ItemFactura> findByProductoId(long productoId) {
		return findByProductoId(
			productoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemFactura> findByProductoId(
		long productoId, int start, int end) {

		return findByProductoId(productoId, start, end, null);
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
	@Override
	public List<ItemFactura> findByProductoId(
		long productoId, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator) {

		return findByProductoId(
			productoId, start, end, orderByComparator, true);
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
	@Override
	public List<ItemFactura> findByProductoId(
		long productoId, int start, int end,
		OrderByComparator<ItemFactura> orderByComparator,
		boolean useFinderCache) {

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

		List<ItemFactura> list = null;

		if (useFinderCache) {
			list = (List<ItemFactura>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (ItemFactura itemFactura : list) {
					if (productoId != itemFactura.getProductoId()) {
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

			sb.append(_SQL_SELECT_ITEMFACTURA_WHERE);

			sb.append(_FINDER_COLUMN_PRODUCTOID_PRODUCTOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ItemFacturaModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(productoId);

				list = (List<ItemFactura>)QueryUtil.list(
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
	 * Returns the first item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	@Override
	public ItemFactura findByProductoId_First(
			long productoId, OrderByComparator<ItemFactura> orderByComparator)
		throws NoSuchItemFacturaException {

		ItemFactura itemFactura = fetchByProductoId_First(
			productoId, orderByComparator);

		if (itemFactura != null) {
			return itemFactura;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("productoId=");
		sb.append(productoId);

		sb.append("}");

		throw new NoSuchItemFacturaException(sb.toString());
	}

	/**
	 * Returns the first item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	@Override
	public ItemFactura fetchByProductoId_First(
		long productoId, OrderByComparator<ItemFactura> orderByComparator) {

		List<ItemFactura> list = findByProductoId(
			productoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura
	 * @throws NoSuchItemFacturaException if a matching item factura could not be found
	 */
	@Override
	public ItemFactura findByProductoId_Last(
			long productoId, OrderByComparator<ItemFactura> orderByComparator)
		throws NoSuchItemFacturaException {

		ItemFactura itemFactura = fetchByProductoId_Last(
			productoId, orderByComparator);

		if (itemFactura != null) {
			return itemFactura;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("productoId=");
		sb.append(productoId);

		sb.append("}");

		throw new NoSuchItemFacturaException(sb.toString());
	}

	/**
	 * Returns the last item factura in the ordered set where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item factura, or <code>null</code> if a matching item factura could not be found
	 */
	@Override
	public ItemFactura fetchByProductoId_Last(
		long productoId, OrderByComparator<ItemFactura> orderByComparator) {

		int count = countByProductoId(productoId);

		if (count == 0) {
			return null;
		}

		List<ItemFactura> list = findByProductoId(
			productoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemFactura[] findByProductoId_PrevAndNext(
			long itemFacturaId, long productoId,
			OrderByComparator<ItemFactura> orderByComparator)
		throws NoSuchItemFacturaException {

		ItemFactura itemFactura = findByPrimaryKey(itemFacturaId);

		Session session = null;

		try {
			session = openSession();

			ItemFactura[] array = new ItemFacturaImpl[3];

			array[0] = getByProductoId_PrevAndNext(
				session, itemFactura, productoId, orderByComparator, true);

			array[1] = itemFactura;

			array[2] = getByProductoId_PrevAndNext(
				session, itemFactura, productoId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ItemFactura getByProductoId_PrevAndNext(
		Session session, ItemFactura itemFactura, long productoId,
		OrderByComparator<ItemFactura> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ITEMFACTURA_WHERE);

		sb.append(_FINDER_COLUMN_PRODUCTOID_PRODUCTOID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ItemFacturaModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(productoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(itemFactura)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ItemFactura> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the item facturas where productoId = &#63; from the database.
	 *
	 * @param productoId the producto ID
	 */
	@Override
	public void removeByProductoId(long productoId) {
		for (ItemFactura itemFactura :
				findByProductoId(
					productoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(itemFactura);
		}
	}

	/**
	 * Returns the number of item facturas where productoId = &#63;.
	 *
	 * @param productoId the producto ID
	 * @return the number of matching item facturas
	 */
	@Override
	public int countByProductoId(long productoId) {
		FinderPath finderPath = _finderPathCountByProductoId;

		Object[] finderArgs = new Object[] {productoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ITEMFACTURA_WHERE);

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
		"itemFactura.productoId = ?";

	public ItemFacturaPersistenceImpl() {
		setModelClass(ItemFactura.class);

		setModelImplClass(ItemFacturaImpl.class);
		setModelPKClass(long.class);

		setTable(ItemFacturaTable.INSTANCE);
	}

	/**
	 * Caches the item factura in the entity cache if it is enabled.
	 *
	 * @param itemFactura the item factura
	 */
	@Override
	public void cacheResult(ItemFactura itemFactura) {
		entityCache.putResult(
			ItemFacturaImpl.class, itemFactura.getPrimaryKey(), itemFactura);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the item facturas in the entity cache if it is enabled.
	 *
	 * @param itemFacturas the item facturas
	 */
	@Override
	public void cacheResult(List<ItemFactura> itemFacturas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (itemFacturas.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ItemFactura itemFactura : itemFacturas) {
			if (entityCache.getResult(
					ItemFacturaImpl.class, itemFactura.getPrimaryKey()) ==
						null) {

				cacheResult(itemFactura);
			}
		}
	}

	/**
	 * Clears the cache for all item facturas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ItemFacturaImpl.class);

		finderCache.clearCache(ItemFacturaImpl.class);
	}

	/**
	 * Clears the cache for the item factura.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ItemFactura itemFactura) {
		entityCache.removeResult(ItemFacturaImpl.class, itemFactura);
	}

	@Override
	public void clearCache(List<ItemFactura> itemFacturas) {
		for (ItemFactura itemFactura : itemFacturas) {
			entityCache.removeResult(ItemFacturaImpl.class, itemFactura);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ItemFacturaImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ItemFacturaImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new item factura with the primary key. Does not add the item factura to the database.
	 *
	 * @param itemFacturaId the primary key for the new item factura
	 * @return the new item factura
	 */
	@Override
	public ItemFactura create(long itemFacturaId) {
		ItemFactura itemFactura = new ItemFacturaImpl();

		itemFactura.setNew(true);
		itemFactura.setPrimaryKey(itemFacturaId);

		return itemFactura;
	}

	/**
	 * Removes the item factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura that was removed
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	@Override
	public ItemFactura remove(long itemFacturaId)
		throws NoSuchItemFacturaException {

		return remove((Serializable)itemFacturaId);
	}

	/**
	 * Removes the item factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the item factura
	 * @return the item factura that was removed
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	@Override
	public ItemFactura remove(Serializable primaryKey)
		throws NoSuchItemFacturaException {

		Session session = null;

		try {
			session = openSession();

			ItemFactura itemFactura = (ItemFactura)session.get(
				ItemFacturaImpl.class, primaryKey);

			if (itemFactura == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchItemFacturaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(itemFactura);
		}
		catch (NoSuchItemFacturaException noSuchEntityException) {
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
	protected ItemFactura removeImpl(ItemFactura itemFactura) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(itemFactura)) {
				itemFactura = (ItemFactura)session.get(
					ItemFacturaImpl.class, itemFactura.getPrimaryKeyObj());
			}

			if (itemFactura != null) {
				session.delete(itemFactura);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (itemFactura != null) {
			clearCache(itemFactura);
		}

		return itemFactura;
	}

	@Override
	public ItemFactura updateImpl(ItemFactura itemFactura) {
		boolean isNew = itemFactura.isNew();

		if (!(itemFactura instanceof ItemFacturaModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(itemFactura.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(itemFactura);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in itemFactura proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ItemFactura implementation " +
					itemFactura.getClass());
		}

		ItemFacturaModelImpl itemFacturaModelImpl =
			(ItemFacturaModelImpl)itemFactura;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(itemFactura);
			}
			else {
				itemFactura = (ItemFactura)session.merge(itemFactura);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ItemFacturaImpl.class, itemFacturaModelImpl, false, true);

		if (isNew) {
			itemFactura.setNew(false);
		}

		itemFactura.resetOriginalValues();

		return itemFactura;
	}

	/**
	 * Returns the item factura with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the item factura
	 * @return the item factura
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	@Override
	public ItemFactura findByPrimaryKey(Serializable primaryKey)
		throws NoSuchItemFacturaException {

		ItemFactura itemFactura = fetchByPrimaryKey(primaryKey);

		if (itemFactura == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchItemFacturaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return itemFactura;
	}

	/**
	 * Returns the item factura with the primary key or throws a <code>NoSuchItemFacturaException</code> if it could not be found.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura
	 * @throws NoSuchItemFacturaException if a item factura with the primary key could not be found
	 */
	@Override
	public ItemFactura findByPrimaryKey(long itemFacturaId)
		throws NoSuchItemFacturaException {

		return findByPrimaryKey((Serializable)itemFacturaId);
	}

	/**
	 * Returns the item factura with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemFacturaId the primary key of the item factura
	 * @return the item factura, or <code>null</code> if a item factura with the primary key could not be found
	 */
	@Override
	public ItemFactura fetchByPrimaryKey(long itemFacturaId) {
		return fetchByPrimaryKey((Serializable)itemFacturaId);
	}

	/**
	 * Returns all the item facturas.
	 *
	 * @return the item facturas
	 */
	@Override
	public List<ItemFactura> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemFactura> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ItemFactura> findAll(
		int start, int end, OrderByComparator<ItemFactura> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ItemFactura> findAll(
		int start, int end, OrderByComparator<ItemFactura> orderByComparator,
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

		List<ItemFactura> list = null;

		if (useFinderCache) {
			list = (List<ItemFactura>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ITEMFACTURA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ITEMFACTURA;

				sql = sql.concat(ItemFacturaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ItemFactura>)QueryUtil.list(
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
	 * Removes all the item facturas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ItemFactura itemFactura : findAll()) {
			remove(itemFactura);
		}
	}

	/**
	 * Returns the number of item facturas.
	 *
	 * @return the number of item facturas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ITEMFACTURA);

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
		return "itemFacturaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ITEMFACTURA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ItemFacturaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the item factura persistence.
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

		_finderPathWithPaginationFindByFacturaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFacturaId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"facturaId"}, true);

		_finderPathWithoutPaginationFindByFacturaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFacturaId",
			new String[] {Long.class.getName()}, new String[] {"facturaId"},
			true);

		_finderPathCountByFacturaId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFacturaId",
			new String[] {Long.class.getName()}, new String[] {"facturaId"},
			false);

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

		_setItemFacturaUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setItemFacturaUtilPersistence(null);

		entityCache.removeCache(ItemFacturaImpl.class.getName());
	}

	private void _setItemFacturaUtilPersistence(
		ItemFacturaPersistence itemFacturaPersistence) {

		try {
			Field field = ItemFacturaUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, itemFacturaPersistence);
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

	private static final String _SQL_SELECT_ITEMFACTURA =
		"SELECT itemFactura FROM ItemFactura itemFactura";

	private static final String _SQL_SELECT_ITEMFACTURA_WHERE =
		"SELECT itemFactura FROM ItemFactura itemFactura WHERE ";

	private static final String _SQL_COUNT_ITEMFACTURA =
		"SELECT COUNT(itemFactura) FROM ItemFactura itemFactura";

	private static final String _SQL_COUNT_ITEMFACTURA_WHERE =
		"SELECT COUNT(itemFactura) FROM ItemFactura itemFactura WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "itemFactura.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ItemFactura exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ItemFactura exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ItemFacturaPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private ItemFacturaModelArgumentsResolver
		_itemFacturaModelArgumentsResolver;

}