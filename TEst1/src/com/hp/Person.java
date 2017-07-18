package com.hp;

import java.util.Date;
public class Person {
	private String name;
	private Date birthDate;

    /**
     * Creates a Person with the given name and birth​​​​​​​​‌‌‌‌​​‌​‌​​‌‌‌‌​​‌​​​​‌ date.
     */
	public Person(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public Date getBirthDate() {
		return birthDate;
	}
}
