package com.cg.bean;
import javax.persistence.*;
@Entity
public class Address
{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ADDRESS_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int addressId;
	@Column(name="ADDRESS_STREET", length=10)
	
	private String street;
	@Column(name="ADDRESS_CITY", length=10)
	
	private String city;
	@Column(name="ADDRESS_STATE", length=10)
	
	private String state;
	@Column(name="ADDRESS_ZIPCODE" ,length=10)
	
	private String zipCode;
	
	public int getAddressId(){
		return addressId;
	}
	public void setAddressId(int addressId){
		this.addressId = addressId;
	}
	public String getStreet(){
		return street;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Address(int addressId, String street, String city, String state,
			String zipCode) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
		
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}
	
	
}
