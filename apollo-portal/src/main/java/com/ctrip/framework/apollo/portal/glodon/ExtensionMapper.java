
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.1  Built on : Feb 20, 2016 (10:02:19 GMT)
 */

package com.ctrip.framework.apollo.portal.glodon;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class ExtensionMapper {

	public static Object getTypeObject(String namespaceURI, String typeName,
			javax.xml.stream.XMLStreamReader reader) throws Exception {

		if ("http://www.glodon.com/xsd/SsoAuthUser".equals(namespaceURI) && "SsoAuthUserRequestType".equals(typeName)) {

			return SsoAuthUserRequestType.Factory.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
	}

}
