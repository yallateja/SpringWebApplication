package com.app.tcs.controller;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String,String> countryList;
	
	private String favLang;
	
	
	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	public Student(){
		countryList=new LinkedHashMap<String,String>();
		//key will be value in JSP 
		//dropdown IND,AUS will be populated
		countryList.put("India", "IND");
		countryList.put("Australia", "AUS");
		countryList.put("United states", "USA");
		
	}
	
	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}
	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
