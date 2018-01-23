package com.ctrip.framework.apollo.portal.glodon;

public class DomainAuthUser {

	public static boolean domainAuth(String userName, String password) {
		try {
			if (userName == null || userName.length() == 0)
				return false;

			if (password == null || password.length() == 0)
				return false;

			SsoAuthUserProcessDirectBinding11QSServiceStub t2 = new SsoAuthUserProcessDirectBinding11QSServiceStub();
			SsoAuthUserRequestType up = new SsoAuthUserRequestType();
			up.setUserCode(userName);
			up.setPassword(password);
			SsoAuthUserRequest sr = new SsoAuthUserRequest();
			sr.setSsoAuthUserRequest(up);
			SsoAuthUserResponse resp = t2.process(sr);
			return "Y".equals(resp.getResult());
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
