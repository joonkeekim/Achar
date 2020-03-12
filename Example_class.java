package com.example;

public class Example_class {

	public static void main(String[] args) {
			boolean k=Service.class.isAnnotationPresent(annota.class);
			System.out.println(k);
			
			//Class<Service> clazz=Service.class;
			//Annotation AA=clazz.getAnnotation(Service.class);
			
			//System.out.println(Service.class.getDeclaredAnnotations().value());
	}

}
