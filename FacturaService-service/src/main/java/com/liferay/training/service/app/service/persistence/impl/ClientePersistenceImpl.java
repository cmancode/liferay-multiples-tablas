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
import com.liferay.training.service.app.exception.NoSuchClienteException;
import com.liferay.training.service.app.model.Cliente;
import com.liferay.training.service.app.model.ClienteTable;
import com.liferay.training.service.app.model.impl.ClienteImpl;
import com.liferay.training.service.app.model.impl.ClienteModelImpl;
import com.liferay.training.service.app.service.persistence.ClientePersistence;
import com.liferay.training.service.app.service.persistence.ClienteUtil;
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
 * The persistence implementation for the cliente service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {ClientePersistence.class, BasePersistence.class})
public class ClientePersistenceImpl
	extends BasePersistenceImpl<Cliente> implements ClientePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ClienteUtil</code> to access the cliente persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ClienteImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByClienteId;
	private FinderPath _finderPathWithoutPaginationFindByClienteId;
	private FinderPath _finderPathCountByClienteId;

	/**
	 * Returns all the clientes where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @return the matching clientes
	 */
	@Override
	public List<Cliente> findByClienteId(long clienteId) {
		return findByClienteId(
			clienteId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Cliente> findByClienteId(long clienteId, int start, int end) {
		return findByClienteId(clienteId, start, end, null);
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
	@Override
	public List<Cliente> findByClienteId(
		long clienteId, int start, int end,
		OrderByComparator<Cliente> orderByComparator) {

		return findByClienteId(clienteId, start, end, orderByComparator, true);
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
	@Override
	public List<Cliente> findByClienteId(
		long clienteId, int start, int end,
		OrderByComparator<Cliente> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByClienteId;
				finderArgs = new Object[] {clienteId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByClienteId;
			finderArgs = new Object[] {
				clienteId, start, end, orderByComparator
			};
		}

		List<Cliente> list = null;

		if (useFinderCache) {
			list = (List<Cliente>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Cliente cliente : list) {
					if (clienteId != cliente.getClienteId()) {
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

			sb.append(_SQL_SELECT_CLIENTE_WHERE);

			sb.append(_FINDER_COLUMN_CLIENTEID_CLIENTEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ClienteModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(clienteId);

				list = (List<Cliente>)QueryUtil.list(
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
	 * Returns the first cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cliente
	 * @throws NoSuchClienteException if a matching cliente could not be found
	 */
	@Override
	public Cliente findByClienteId_First(
			long clienteId, OrderByComparator<Cliente> orderByComparator)
		throws NoSuchClienteException {

		Cliente cliente = fetchByClienteId_First(clienteId, orderByComparator);

		if (cliente != null) {
			return cliente;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("clienteId=");
		sb.append(clienteId);

		sb.append("}");

		throw new NoSuchClienteException(sb.toString());
	}

	/**
	 * Returns the first cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cliente, or <code>null</code> if a matching cliente could not be found
	 */
	@Override
	public Cliente fetchByClienteId_First(
		long clienteId, OrderByComparator<Cliente> orderByComparator) {

		List<Cliente> list = findByClienteId(
			clienteId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cliente
	 * @throws NoSuchClienteException if a matching cliente could not be found
	 */
	@Override
	public Cliente findByClienteId_Last(
			long clienteId, OrderByComparator<Cliente> orderByComparator)
		throws NoSuchClienteException {

		Cliente cliente = fetchByClienteId_Last(clienteId, orderByComparator);

		if (cliente != null) {
			return cliente;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("clienteId=");
		sb.append(clienteId);

		sb.append("}");

		throw new NoSuchClienteException(sb.toString());
	}

	/**
	 * Returns the last cliente in the ordered set where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cliente, or <code>null</code> if a matching cliente could not be found
	 */
	@Override
	public Cliente fetchByClienteId_Last(
		long clienteId, OrderByComparator<Cliente> orderByComparator) {

		int count = countByClienteId(clienteId);

		if (count == 0) {
			return null;
		}

		List<Cliente> list = findByClienteId(
			clienteId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the clientes where clienteId = &#63; from the database.
	 *
	 * @param clienteId the cliente ID
	 */
	@Override
	public void removeByClienteId(long clienteId) {
		for (Cliente cliente :
				findByClienteId(
					clienteId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cliente);
		}
	}

	/**
	 * Returns the number of clientes where clienteId = &#63;.
	 *
	 * @param clienteId the cliente ID
	 * @return the number of matching clientes
	 */
	@Override
	public int countByClienteId(long clienteId) {
		FinderPath finderPath = _finderPathCountByClienteId;

		Object[] finderArgs = new Object[] {clienteId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CLIENTE_WHERE);

			sb.append(_FINDER_COLUMN_CLIENTEID_CLIENTEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(clienteId);

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

	private static final String _FINDER_COLUMN_CLIENTEID_CLIENTEID_2 =
		"cliente.clienteId = ?";

	public ClientePersistenceImpl() {
		setModelClass(Cliente.class);

		setModelImplClass(ClienteImpl.class);
		setModelPKClass(long.class);

		setTable(ClienteTable.INSTANCE);
	}

	/**
	 * Caches the cliente in the entity cache if it is enabled.
	 *
	 * @param cliente the cliente
	 */
	@Override
	public void cacheResult(Cliente cliente) {
		entityCache.putResult(
			ClienteImpl.class, cliente.getPrimaryKey(), cliente);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the clientes in the entity cache if it is enabled.
	 *
	 * @param clientes the clientes
	 */
	@Override
	public void cacheResult(List<Cliente> clientes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (clientes.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Cliente cliente : clientes) {
			if (entityCache.getResult(
					ClienteImpl.class, cliente.getPrimaryKey()) == null) {

				cacheResult(cliente);
			}
		}
	}

	/**
	 * Clears the cache for all clientes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ClienteImpl.class);

		finderCache.clearCache(ClienteImpl.class);
	}

	/**
	 * Clears the cache for the cliente.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Cliente cliente) {
		entityCache.removeResult(ClienteImpl.class, cliente);
	}

	@Override
	public void clearCache(List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			entityCache.removeResult(ClienteImpl.class, cliente);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ClienteImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ClienteImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cliente with the primary key. Does not add the cliente to the database.
	 *
	 * @param clienteId the primary key for the new cliente
	 * @return the new cliente
	 */
	@Override
	public Cliente create(long clienteId) {
		Cliente cliente = new ClienteImpl();

		cliente.setNew(true);
		cliente.setPrimaryKey(clienteId);

		return cliente;
	}

	/**
	 * Removes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente that was removed
	 * @throws NoSuchClienteException if a cliente with the primary key could not be found
	 */
	@Override
	public Cliente remove(long clienteId) throws NoSuchClienteException {
		return remove((Serializable)clienteId);
	}

	/**
	 * Removes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cliente
	 * @return the cliente that was removed
	 * @throws NoSuchClienteException if a cliente with the primary key could not be found
	 */
	@Override
	public Cliente remove(Serializable primaryKey)
		throws NoSuchClienteException {

		Session session = null;

		try {
			session = openSession();

			Cliente cliente = (Cliente)session.get(
				ClienteImpl.class, primaryKey);

			if (cliente == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchClienteException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cliente);
		}
		catch (NoSuchClienteException noSuchEntityException) {
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
	protected Cliente removeImpl(Cliente cliente) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cliente)) {
				cliente = (Cliente)session.get(
					ClienteImpl.class, cliente.getPrimaryKeyObj());
			}

			if (cliente != null) {
				session.delete(cliente);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cliente != null) {
			clearCache(cliente);
		}

		return cliente;
	}

	@Override
	public Cliente updateImpl(Cliente cliente) {
		boolean isNew = cliente.isNew();

		if (!(cliente instanceof ClienteModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cliente.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(cliente);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cliente proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Cliente implementation " +
					cliente.getClass());
		}

		ClienteModelImpl clienteModelImpl = (ClienteModelImpl)cliente;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cliente);
			}
			else {
				cliente = (Cliente)session.merge(cliente);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(ClienteImpl.class, clienteModelImpl, false, true);

		if (isNew) {
			cliente.setNew(false);
		}

		cliente.resetOriginalValues();

		return cliente;
	}

	/**
	 * Returns the cliente with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cliente
	 * @return the cliente
	 * @throws NoSuchClienteException if a cliente with the primary key could not be found
	 */
	@Override
	public Cliente findByPrimaryKey(Serializable primaryKey)
		throws NoSuchClienteException {

		Cliente cliente = fetchByPrimaryKey(primaryKey);

		if (cliente == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchClienteException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cliente;
	}

	/**
	 * Returns the cliente with the primary key or throws a <code>NoSuchClienteException</code> if it could not be found.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente
	 * @throws NoSuchClienteException if a cliente with the primary key could not be found
	 */
	@Override
	public Cliente findByPrimaryKey(long clienteId)
		throws NoSuchClienteException {

		return findByPrimaryKey((Serializable)clienteId);
	}

	/**
	 * Returns the cliente with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente, or <code>null</code> if a cliente with the primary key could not be found
	 */
	@Override
	public Cliente fetchByPrimaryKey(long clienteId) {
		return fetchByPrimaryKey((Serializable)clienteId);
	}

	/**
	 * Returns all the clientes.
	 *
	 * @return the clientes
	 */
	@Override
	public List<Cliente> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Cliente> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Cliente> findAll(
		int start, int end, OrderByComparator<Cliente> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Cliente> findAll(
		int start, int end, OrderByComparator<Cliente> orderByComparator,
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

		List<Cliente> list = null;

		if (useFinderCache) {
			list = (List<Cliente>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CLIENTE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CLIENTE;

				sql = sql.concat(ClienteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Cliente>)QueryUtil.list(
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
	 * Removes all the clientes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Cliente cliente : findAll()) {
			remove(cliente);
		}
	}

	/**
	 * Returns the number of clientes.
	 *
	 * @return the number of clientes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CLIENTE);

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
		return "clienteId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CLIENTE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ClienteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cliente persistence.
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

		_finderPathWithPaginationFindByClienteId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByClienteId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"clienteId"}, true);

		_finderPathWithoutPaginationFindByClienteId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByClienteId",
			new String[] {Long.class.getName()}, new String[] {"clienteId"},
			true);

		_finderPathCountByClienteId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByClienteId",
			new String[] {Long.class.getName()}, new String[] {"clienteId"},
			false);

		_setClienteUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setClienteUtilPersistence(null);

		entityCache.removeCache(ClienteImpl.class.getName());
	}

	private void _setClienteUtilPersistence(
		ClientePersistence clientePersistence) {

		try {
			Field field = ClienteUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, clientePersistence);
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

	private static final String _SQL_SELECT_CLIENTE =
		"SELECT cliente FROM Cliente cliente";

	private static final String _SQL_SELECT_CLIENTE_WHERE =
		"SELECT cliente FROM Cliente cliente WHERE ";

	private static final String _SQL_COUNT_CLIENTE =
		"SELECT COUNT(cliente) FROM Cliente cliente";

	private static final String _SQL_COUNT_CLIENTE_WHERE =
		"SELECT COUNT(cliente) FROM Cliente cliente WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "cliente.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Cliente exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Cliente exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ClientePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private ClienteModelArgumentsResolver _clienteModelArgumentsResolver;

}