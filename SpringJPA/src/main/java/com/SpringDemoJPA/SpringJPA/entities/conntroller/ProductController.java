package com.SpringDemoJPA.SpringJPA.entities.conntroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringDemoJPA.SpringJPA.entities.Product;
import com.SpringDemoJPA.SpringJPA.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository repository;

	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public List<Product> getProduct() {
		List<Product> list = new ArrayList<Product>();
		Product p1 = new Product("name", "good Quality", 388);
		list.add(p1);
		list.add(p1);
		System.out.println(list.toString());
		// return repository.findAll();
		return list;

	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {

		return repository.findById(id).get();
	} 
	
	@RequestMapping(value="/products/",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		
	  return repository.save(product);
		
	}
	
	@RequestMapping(value="/products/",method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		
		return repository.save(product);
	}
	
	@RequestMapping(value="/products/",method=RequestMethod.DELETE)
	public void deleteProduct(int id) {
		repository.deleteById(id);
	}

}
