package POJO;

import java.util.List;

public class SuperHeroMovies {
	
	private String Category;
	private List<String> Franchises;
	private List<String> Genres;
	private List<Movies> movies;
	private  List<TvSeries> tvseries;
	private OtherDetails otherdetails;
	
	public OtherDetails getOtherdetails() {
		return otherdetails;
	}
	public void setOtherdetails(OtherDetails other) {
		this.otherdetails = other;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	public List<TvSeries> getTvseries() {
		return tvseries;
	}
	public void setTvseries(List<TvSeries> tvseries) {
		this.tvseries = tvseries;
	}

	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public List<String> getFranchises() {
		return Franchises;
	}
	public void setFranchises(List<String> franchises) {
		Franchises = franchises;
	}
	public List<String> getGenres() {
		return Genres;
	}
	public void setGenres(List<String> genres) {
		Genres = genres;
	}

}
