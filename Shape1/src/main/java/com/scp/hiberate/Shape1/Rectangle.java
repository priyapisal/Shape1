package com.scp.hiberate.Shape1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
 
@Entity
@DiscriminatorValue(value="R")
public class Rectangle extends Shape{
 
 @Column(name="Rectangle_Length")
 int length;
 @Column(name="Rectangle_Breadth")
 int breadth;
 // getters and setters
 
 public Rectangle()
 {
  
 }
 
 public Rectangle(String shapeName,int length,int breadth)
 {
  super(shapeName);
  this.length=length;
  this.breadth=breadth;
 }

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getBreadth() {
	return breadth;
}

public void setBreadth(int breadth) {
	this.breadth = breadth;
}
 
}