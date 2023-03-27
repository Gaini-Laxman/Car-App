package com.klinnovations;

public class App {
	public static void main(String[] args) {
		Car c = new Car(new ElecricEngine()); // after creating IEngine we can use (new DieselEngine) for required engine
		c.drive();
	}

}

/*What is dependency  injection ? 
 *The process of injecting dependent object into target object using target class
 *variable / setter method / constructor is called as dependency injection  
 *
 *Dependency Injection Types 
 * 1) Field injection (if you inject dependent obj into target)
 * 2) Setter Injection
 * 3) constructor Injection
 * 
 */