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

package com.liferay.training.service.app.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.training.service.app.service.FacturaServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>FacturaServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FacturaServiceHttp {

	public static java.util.Map<String, Object> crearFactura(
		HttpPrincipal httpPrincipal, long clienteId, String total,
		String items) {

		try {
			MethodKey methodKey = new MethodKey(
				FacturaServiceUtil.class, "crearFactura",
				_crearFacturaParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, clienteId, total, items);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.Map<String, Object>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.Map<String, Object> buscarFacturaPorId(
		HttpPrincipal httpPrincipal, long facturaId) {

		try {
			MethodKey methodKey = new MethodKey(
				FacturaServiceUtil.class, "buscarFacturaPorId",
				_buscarFacturaPorIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, facturaId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.Map<String, Object>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.Map<String, Object> probandoObjetoDTO(
		HttpPrincipal httpPrincipal, String prueba,
		java.io.File[] archivosAdjuntos, String idInfoArchivos) {

		try {
			MethodKey methodKey = new MethodKey(
				FacturaServiceUtil.class, "probandoObjetoDTO",
				_probandoObjetoDTOParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, prueba, archivosAdjuntos, idInfoArchivos);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.Map<String, Object>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FacturaServiceHttp.class);

	private static final Class<?>[] _crearFacturaParameterTypes0 = new Class[] {
		long.class, String.class, String.class
	};
	private static final Class<?>[] _buscarFacturaPorIdParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _probandoObjetoDTOParameterTypes2 =
		new Class[] {String.class, java.io.File[].class, String.class};

}