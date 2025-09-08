package aop.service;

import org.springframework.stereotype.Service;

import aop.domain.Product;

@Service
public class ProductService {

	public Product find(String name) {
		if(name == null) {
			throw new RuntimeException("empty nane");
		}
		System.out.println("finding...");
		return new Product(name);
	}

}
