package POJO;

import java.util.List;

public class Movies {
	
	private String Title;
	private int Years;
	private List<String> Cast;
	
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getYears() {
		return Years;
	}
	public void setYears(int years) {
		Years = years;
	}
	public List<String> getCast() {
		return Cast;
	}
	public void setCast(List<String> cast) {
		Cast = cast;
	}

}
