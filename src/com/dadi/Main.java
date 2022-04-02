package com.dadi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Product p = new Product(1, "ABC", 23445.34, true);
		Product p1 = new Product(2, "ABC1", 56445.34, false);
		Product p2 = new Product(3, "ABC2", 67445.34, true);
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(p);
		productList.add(p1);
		productList.add(p2);
		
		Map<Integer,Product> productMap = new HashMap<>();
		//System.out.println(productList);
		for (Product product : productList) {
			System.out.println("productid :" + product.getId());
			System.out.println("productname :" + product.getName());
			System.out.println("productprice :" + product.getPrice());
			if(product.isAvail()) {
				System.out.println("productavail :"+"Yes");
			} else {
				System.out.println("productavail :"+"No");
			}
			System.out.println("====================================================");
			productMap.put(product.getId(), product);
		}
		
		System.out.println("*********Product Map**************");
		System.out.println(productMap);
		Set<Entry<Integer, Product>> entrySet = productMap.entrySet();
		for (Entry<Integer, Product> entry : entrySet) {
			System.out.println("Key-" + entry.getKey()+"value-"+entry.getValue());
			
		}
		
		

		/*
		 * System.out.println(p.getId() + ":" + p.getName() + ":" + p.getPrice() + ":" +
		 * p.isAvail());
		 * 
		 * System.out.println(p.toString()); // toSting() used to display the object
		 * states System.out.println(p1.toString()); // getClass is used to get the
		 * class object System.out.println(p2.toString()); // finalaize() is used remove
		 * extrnal or native objects
		 */	}

}
