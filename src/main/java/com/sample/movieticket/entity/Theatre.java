package com.sample.movieticket.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Theatre {

	
	
	//mappedBy = "employee", fetch = FetchType.LAZY)
	@Id
	//@OneToMany (cascade = CascadeType.PERSIST)
	int theatreId;
	String theatreName;
	String theatreCity;
//	@OneToMany(cascade = CascadeType.ALL)
//	@OneToMany(targetEntity=Movie.class, mappedBy="movieId",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
  @OneToMany(mappedBy = "movieId", cascade = CascadeType.ALL)
	List<Movie> listofMovies;
	@OneToMany(cascade = CascadeType.ALL)
    List<Screen> listOfScreens;
	String managerName;
	String managerContact;
	public Theatre() {
		
	}
	public Theatre(int theatreId, String theatreName, String theatreCity, List<Movie> listofMovies,
			List<Screen> listOfScreens, String managerName, String managerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.listofMovies = listofMovies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public List<Movie> getListofMovies() {
		return listofMovies;
	}
	public void setListofMovies(List<Movie> listofMovies) {
		this.listofMovies = listofMovies;
	}
	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", listofMovies=" + listofMovies + ", listOfScreens=" + listOfScreens + ", managerName=" + managerName
				+ ", managerContact=" + managerContact + "]";
	}
	
	 
	
}
