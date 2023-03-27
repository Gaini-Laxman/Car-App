package com.klinnovations;

public class Car { // is-a(inheritance) relation extends Engine //this will cause nullpointer
					// exception
	private IEngine eng; // after creating car interface //ref variable //eng is instance variable .when
							// the memory allocated for instance variable when object created

	public Car(IEngine eng) { // constructor is expecting //current class in intialed

		this.eng = eng;
	}

	public void drive() {

		// Engine eng = new Engine(); //ha-a(compo sition) relation

		int status = eng.start(); // super.start is-a relation
		if (status >= 1) {
			System.out.println("Jurney Started.....");
		} else {
			System.out.println("Engine Trouble");
		}

	}

}
