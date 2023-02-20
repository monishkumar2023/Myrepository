package com.example.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.products.bean.Beanclass;
import com.example.products.repository.ProductRepository;

@Service
public class ProductServices 
{
	@Autowired
	ProductRepository productavailable;
	
	public List<Beanclass> getAllproducts()
	{
		List<Beanclass> list=new ArrayList<Beanclass>();
		list=(List<Beanclass>) productavailable.findAll();
		return list;
	}
	public Beanclass oneproduct(int pro_id)
	{
		return productavailable.findById(pro_id).get();
	}
	public Beanclass add(Beanclass product)
	{
		return productavailable.save(product);
	}
	public void delete(int product)
	{
		productavailable.deleteById(product);
	}
	public Beanclass update(Beanclass pro,int pro_id)
	{
		return productavailable.save(pro);
	}
}
