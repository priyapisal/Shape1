package com.scp.hiberate.Shape1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

 
public class Main {
 
 public static void main(String[] args) {
  
  Shape shape=new Shape("Sqaure");
  Rectangle rectangle=new Rectangle("Rectangle", 10, 20);  
  Circle circle=new Circle("Circle", 4);
    
 /* Configuration configuration=new Configuration();
  configuration.configure();
  ServiceRegistry sr= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
  SessionFactory sf=configuration.buildSessionFactory(sr);*/
  
  SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
  Session ss=sf.openSession();
  Transaction t=ss.beginTransaction();
   ss.save(shape);
  ss.save(rectangle);
  ss.save(circle);
  t.commit();
  ss.close();
  System.out.println("inserted........");
 }
}
