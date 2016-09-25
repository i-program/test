package com.iprogram.pattern.proxy.person;

import java.lang.reflect.Proxy;

public class MatchMakingTest {
	public static void main(String[] args){
		try{
			MatchMakingTest matchMakingTest = new MatchMakingTest();
			matchMakingTest.drive();
		}catch(Exception exception){
			System.out.println("exception : " + exception);
		}
	}

	private void drive() {
		PersonBean joe = new PersonBeanImpl("joe", "male", 1);
		PersonBean soo = new PersonBeanImpl("soo", "female", 10);
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("ownerProxy.name = " + ownerProxy.getName());
		System.out.println("ownerProxy.rate = " + ownerProxy.personalRate());
	}

	private PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
			personBean.getClass().getInterfaces(),
			new OwnerInvocationHanlder(personBean));
	}
}
