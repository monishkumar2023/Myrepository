package com.example.products.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.bean.Beanclass;
import com.example.products.service.ProductServices;

@RestController
public class ProductsController
{
	@Autowired
	ProductServices productsprovide;
	
	@GetMapping("/allproducts")
	public List<Beanclass> allproducts()
	{
		return productsprovide.getAllproducts();
	}
	@GetMapping("/allproducts/{pro_id}")
	public Beanclass oneproduct(@PathVariable("pro_id") int pro_id)
	{
		return productsprovide.oneproduct(pro_id);
	}
	@PostMapping("/add")
	public List<Beanclass> addpro(@RequestBody Beanclass products)
	{
		productsprovide.add(products);
		return productsprovide.getAllproducts();
	}
	@DeleteMapping("/delete/{pro_id}")
	public List<Beanclass> delete(@PathVariable("pro_id") int pro_id)
	{
		productsprovide.delete(pro_id);
		return productsprovide.getAllproducts();
	}
	@PutMapping("/update")
	public void saveOrUpdate(Beanclass products) 
	{
		productsprovide.add(products);
	}
}