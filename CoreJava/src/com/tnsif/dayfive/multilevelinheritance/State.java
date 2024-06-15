//Program to demonstrate Multilevel Inheritance - State Class
package com.tnsif.dayfive.multilevelinheritance;

public class State extends Country {
	private String stateName;
	private String language;
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName +  ", Language="+language+", CountryName=" + getCountryName()
				+ ", Capital()=" + getCapital() +"]";
	}
	
	
}
