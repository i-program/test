package com.iprogram.pattern.proxy.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHanlder implements InvocationHandler {
	private PersonBean personBean;

	public OwnerInvocationHanlder(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				System.out.println("proxy.정보를 조회한다.");
				return method.invoke(personBean, args);
			} else if (method.getName().startsWith("set")) {
				System.out.println("proxy.정보를 설정한다.");
				return method.invoke(personBean, args);
			} else{
				throw new UnsupportedOperationException("보안상 지원하지 않는 기능입니다.");
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return null;
	}
}
