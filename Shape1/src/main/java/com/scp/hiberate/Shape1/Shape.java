package com.scp.hiberate.Shape1;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.DiscriminatorType;
 
@Entity
@Table(name="Shape")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
(
 name="Discriminator",
 discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="S")
public class Shape {
 
 @Id
 @GeneratedValue
 @Column(name="Shape_Id")
 int shapeId;
 @Column(name="Shape_Name")
 String shapeName;
 
        public Shape()
 {
  
 } 
 public Shape(String shapeName)
 {
  this.shapeName=shapeName;
 }
public int getShapeId() {
	return shapeId;
}
public void setShapeId(int shapeId) {
	this.shapeId = shapeId;
}
public String getShapeName() {
	return shapeName;
}
public void setShapeName(String shapeName) {
	this.shapeName = shapeName;
}

 
}
