package org.algorithms.examples.datastructures;

public class Person {
	private String name;
	private Address address;

	public Person() {
		super();

	}

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person clone() {
		Person p = new Person();
		p.setName(name);
		p.setAddress(address.clone());
		return p;

	}

}
