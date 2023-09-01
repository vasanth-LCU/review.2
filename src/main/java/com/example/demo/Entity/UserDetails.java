 package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Registrations")
public class UserDetails {
	private String name;
	@Id
	private long phoneNumber;
	private String address;
	private String model;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	private  String vehicleNumber;
	public UserDetails(String name, long phoneNumber, String address, String model, String vehicleNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.model = model;
		this.vehicleNumber = vehicleNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() 
{
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) 
{
		this.phoneNumber = phoneNumber;
	}
	public String getAddress()
 {
		return address;
	}	
	public void setAddress(String address) 
{
		this.address = address;
	}
	public String getModel()
 {
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

}					  
