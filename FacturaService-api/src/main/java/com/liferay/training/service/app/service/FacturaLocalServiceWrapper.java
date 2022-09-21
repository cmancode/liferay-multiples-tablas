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

package com.liferay.training.service.app.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FacturaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FacturaLocalService
 * @generated
 */
public class FacturaLocalServiceWrapper
	implements FacturaLocalService, ServiceWrapper<FacturaLocalService> {

	public FacturaLocalServiceWrapper() {
		this(null);
	}

	public FacturaLocalServiceWrapper(FacturaLocalService facturaLocalService) {
		_facturaLocalService = facturaLocalService;
	}

	/**
	 * Adds the factura to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FacturaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factura the factura
	 * @return the factura that was added
	 */
	@Override
	public com.liferay.training.service.app.model.Factura addFactura(
		com.liferay.training.service.app.model.Factura factura) {

		return _facturaLocalService.addFactura(factura);
	}

	@Override
	public java.util.Map<String, Object> buscarFacturaPorId(long idFactura) {
		return _facturaLocalService.buscarFacturaPorId(idFactura);
	}

	@Override
	public java.util.Map<String, Object> crearFactura(
		long clienteId, String total, String items) {

		return _facturaLocalService.crearFactura(clienteId, total, items);
	}

	/**
	 * Creates a new factura with the primary key. Does not add the factura to the database.
	 *
	 * @param facturaId the primary key for the new factura
	 * @return the new factura
	 */
	@Override
	public com.liferay.training.service.app.model.Factura createFactura(
		long facturaId) {

		return _facturaLocalService.createFactura(facturaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _facturaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the factura from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FacturaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factura the factura
	 * @return the factura that was removed
	 */
	@Override
	public com.liferay.training.service.app.model.Factura deleteFactura(
		com.liferay.training.service.app.model.Factura factura) {

		return _facturaLocalService.deleteFactura(factura);
	}

	/**
	 * Deletes the factura with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FacturaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param facturaId the primary key of the factura
	 * @return the factura that was removed
	 * @throws PortalException if a factura with the primary key could not be found
	 */
	@Override
	public com.liferay.training.service.app.model.Factura deleteFactura(
			long facturaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _facturaLocalService.deleteFactura(facturaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _facturaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _facturaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _facturaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _facturaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _facturaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.service.app.model.impl.FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _facturaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.service.app.model.impl.FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _facturaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _facturaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _facturaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.service.app.model.Factura fetchFactura(
		long facturaId) {

		return _facturaLocalService.fetchFactura(facturaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _facturaLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the factura with the primary key.
	 *
	 * @param facturaId the primary key of the factura
	 * @return the factura
	 * @throws PortalException if a factura with the primary key could not be found
	 */
	@Override
	public com.liferay.training.service.app.model.Factura getFactura(
			long facturaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _facturaLocalService.getFactura(facturaId);
	}

	/**
	 * Returns a range of all the facturas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.service.app.model.impl.FacturaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of facturas
	 * @param end the upper bound of the range of facturas (not inclusive)
	 * @return the range of facturas
	 */
	@Override
	public java.util.List<com.liferay.training.service.app.model.Factura>
		getFacturas(int start, int end) {

		return _facturaLocalService.getFacturas(start, end);
	}

	/**
	 * Returns the number of facturas.
	 *
	 * @return the number of facturas
	 */
	@Override
	public int getFacturasCount() {
		return _facturaLocalService.getFacturasCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _facturaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _facturaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _facturaLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.Map<String, Object> probandoObjetoDTO(
		String prueba, java.io.File[] archivosAdjuntos, String idInfoArchivos) {

		return _facturaLocalService.probandoObjetoDTO(
			prueba, archivosAdjuntos, idInfoArchivos);
	}

	/**
	 * Updates the factura in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FacturaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factura the factura
	 * @return the factura that was updated
	 */
	@Override
	public com.liferay.training.service.app.model.Factura updateFactura(
		com.liferay.training.service.app.model.Factura factura) {

		return _facturaLocalService.updateFactura(factura);
	}

	@Override
	public FacturaLocalService getWrappedService() {
		return _facturaLocalService;
	}

	@Override
	public void setWrappedService(FacturaLocalService facturaLocalService) {
		_facturaLocalService = facturaLocalService;
	}

	private FacturaLocalService _facturaLocalService;

}