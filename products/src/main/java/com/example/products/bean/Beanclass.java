package com.example.products.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Allproducts")
public class Beanclass 
{
	@Id
	@Column
	private int customerId;
	@Column
	private String customerName;
	@Column
	private String customerPrice;
    public Beanclass()
    {
	}
	public Beanclass(int customerId, String customerName, String customerPrice) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPrice = customerPrice;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPrice() {
		return customerPrice;
	}
	public void setCustomerPrice(String customerPrice) {
		this.customerPrice = customerPrice;
	}
	public String toString() 
	{
		return "Beanclass [customerId=" + customerId + ", customerName=" + customerName + ", CustomerPrice="+ customerPrice + "]";
	}
}
