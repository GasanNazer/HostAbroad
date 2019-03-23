package com.business;

public class Traveler extends User{
	private CountriesEnum listOfCountries [];
	private KnowledgesEnum listOfKnowledges [];
	private DurationOfStayEnum durationOfStay;
	
	public Traveler() {};
	
	public Traveler(String nickname, double rating, String description, boolean host, CountriesEnum listOfCountries [], KnowledgesEnum listOfKnowledges []) {
		
		super();
		this.listOfCountries = listOfCountries;
		this.listOfKnowledges = listOfKnowledges;
		
	}
	
	public void setListOfCountries(CountriesEnum listOfCountries []) {
		this.listOfCountries = listOfCountries;
	}
	
	public CountriesEnum[] getListOfCountries() {
		return this.listOfCountries;
	}
	
	public void setListOfKnowledges(KnowledgesEnum listOfKnowledges []) {
		this.listOfKnowledges = listOfKnowledges;
	}
	
	public KnowledgesEnum[] getListOfKnowledges() {
		return this.listOfKnowledges;
	}
	
	public void setDurationOfStay(DurationOfStayEnum durationOfStay) {
		this.durationOfStay = durationOfStay;
	}
	
	public DurationOfStayEnum getDurationOfStay() {
		return this.durationOfStay;
	}
	
}
