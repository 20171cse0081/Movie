package com.sample.movieticket.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Screen {
	@Id
	int screenId;
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	int theatreId;
	String screenName;
	//@OneToOne
	//List<Show> showList;
	int rows;
	int columns;
	
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
//	public List<Show> getShowList() {
//		return showList;
//	}
//	public void setShowList(List<Show> showList) {
//		this.showList = showList;
//	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	public Screen() {
		
	}
	
	public Screen(int screenId, int theatreId, String screenName, List<Show> showList, int rows, int columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		//this.showList = showList;
		this.rows = rows;
		this.columns = columns;
	}
	
	
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", theatreId=" + theatreId + ", screenName=" + screenName
				+ ", rows=" + rows + ", columns=" + columns + "]";
	}

}
