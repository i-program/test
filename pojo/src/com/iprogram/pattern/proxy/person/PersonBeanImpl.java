package com.iprogram.pattern.proxy.person;

public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private int rate;

	public PersonBeanImpl(String name, String gender, int rate) {
		this.name = name;
		this.gender = gender;
		this.rate = rate;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public int personalRate() {
		return rate;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void setRate(int rate) {
		this.rate = rate;
	}
}


