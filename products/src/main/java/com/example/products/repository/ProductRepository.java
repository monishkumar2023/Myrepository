package com.example.products.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.products.bean.Beanclass;

public interface ProductRepository extends CrudRepository<Beanclass, Integer>
{

}