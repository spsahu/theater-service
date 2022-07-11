package com.theaterService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="tbl_theater",schema = "theater_details" )
public class TheaterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer theaterId;
	
	@Column
	private String theaterName;
	
	public Integer getTheaterId() {
		return theaterId;
	}


	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}



	public String getTheaterName() {
		return theaterName;
	}



	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}



	@Override
	public String toString() {
		return "TheaterEntity [theaterId=" + theaterId + ", theaterName=" + theaterName + "]";
	}
	
	
}
