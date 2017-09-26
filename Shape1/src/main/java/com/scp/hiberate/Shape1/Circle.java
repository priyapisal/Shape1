package com.scp.hiberate.Shape1;
	import javax.persistence.Column;
	import javax.persistence.DiscriminatorValue;
	import javax.persistence.Entity;
	 
	@Entity
	@DiscriminatorValue(value="C")
	public class Circle extends Shape{
	 
	 @Column(name="Circle_Radius")
	 int radius;
	 
	 public Circle()
	 {
	  
	 }
	 public Circle(String shapeName,int radius)
	 {
	  super(shapeName);
	  this.radius=radius;
	  
	 }
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	}


