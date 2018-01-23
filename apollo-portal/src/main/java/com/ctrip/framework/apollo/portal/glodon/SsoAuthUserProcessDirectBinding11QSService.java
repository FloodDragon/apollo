
/**
 * SsoAuthUserProcessDirectBinding11QSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.1  Built on : Feb 20, 2016 (10:01:29 GMT)
 */

package com.ctrip.framework.apollo.portal.glodon;

/*
 *  SsoAuthUserProcessDirectBinding11QSService java interface
 */

public interface SsoAuthUserProcessDirectBinding11QSService {

	/**
	 * Auto generated method signature
	 * 
	 * @param ssoAuthUserRequest0
	 * 
	 */

	public SsoAuthUserResponse process(

            SsoAuthUserRequest ssoAuthUserRequest0) throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param ssoAuthUserRequest0
	 *
	 */
	public void startprocess(

            SsoAuthUserRequest ssoAuthUserRequest0,

            final SsoAuthUserProcessDirectBinding11QSServiceCallbackHandler callback)

			throws java.rmi.RemoteException;

	//
}
