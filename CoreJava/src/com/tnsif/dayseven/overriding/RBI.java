//Program to demonstrate method overriding - Runtime Polymorphism
package com.tnsif.dayseven.overriding;

public class RBI {
	public float getRateOfInterest() {
		return 6.7f;
	}

}

class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}
}

class HDFC extends RBI {
	@Override
	public float getRateOfInterest() {
		return 6.8f;
	}

}

class ICICI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 6.9f;
	}

}
