package com.dadi;

public class Product {
  private Integer id;
  private String name;
  private Double price;
  private boolean avail;
  
/* @Override
 public String toString() {
	 String str="";
	 str= str+"(" ;
	 str=str+"id="+this.id+",";
	 str=str+"name="+this.name+",";
	 str=str+"price="+this.price+",";
	 str=str+"avail="+this.avail+",";
	 str=str+")";
			 
	 return str;
	 
 } */
  
  
  
public Product(Integer id, String name, Double price, boolean avail) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.avail = avail;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", avail=" + avail + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public boolean isAvail() {
	return avail;
}
public void setAvail(boolean avail) {
	this.avail = avail;
}
  
  
}
