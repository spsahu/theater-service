package com.theaterService.model;

public class TheaterModel {

	private String theaterName;
	private Integer id;
	//private List<ScreenModel> audiList;
	private AddressModel addressModel;

	
	public String getTheaterName() {
		return theaterName;
	}


	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "TheaterModel [theaterName=" + theaterName + ", id=" + id + "]";
	}
	
	
	
}
