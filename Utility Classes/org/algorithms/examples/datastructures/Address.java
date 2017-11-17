package org.algorithms.examples.datastructures;

public class Address {
	private String city;
	private String street;
	private String zip;

	public Address() {

	}

	public Address(String city, String street, String zip) {
		super();
		this.city = city;
		this.street = street;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Address clone() {
		Address a = new Address();
		a.setCity(city);
		a.setStreet(street);
		a.setZip(zip);
		return a;

	}

}
