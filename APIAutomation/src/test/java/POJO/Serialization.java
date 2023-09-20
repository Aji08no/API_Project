package POJO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {
	
	@Test
	public void Start() throws StreamWriteException, DatabindException, IOException {
		
		SuperHeroMovies superMovies =new SuperHeroMovies();
		
		superMovies.setCategory("Cricket");
		
		List<String> franchList=new ArrayList<String>();
		franchList.add("Batting Coach");
		franchList.add("Bolwing Coach");
		
		superMovies.setFranchises(franchList);
		
		List<String> genresList=new ArrayList<String>();
		genresList.add("Batting");
		genresList.add("Bolwing");
		genresList.add("WK");
		genresList.add("Captain");
		genresList.add("Vice captain");
		
		superMovies.setGenres(genresList);
		
		List<Movies> AllMovies= new ArrayList<Movies>();
		Movies Haridik=new Movies();
		Haridik.setTitle("T20");
		Haridik.setYears(2023);
		
		List<String> HaridikCast=new ArrayList<String>();
		HaridikCast.add("Batting");
		HaridikCast.add("Bowling");
		HaridikCast.add("Attacker");
		
		Haridik.setCast(HaridikCast);
		
		AllMovies.add(Haridik);
		
		Movies Virat=new Movies();
		Virat.setTitle("Test");
		Virat.setYears(2018);
		
		List<String> ViratCast=new ArrayList<String>();
		ViratCast.add("Batting");
		ViratCast.add("Fielding");
		ViratCast.add("Chasing Master");
		
		Virat.setCast(ViratCast);
		
		AllMovies.add(Virat);
		
		Movies Rohit=new Movies();
		Rohit.setTitle("ODI");
		Rohit.setYears(2020);
		
		List<String> RohitCast=new ArrayList<String>();
		RohitCast.add("Batting");
		RohitCast.add("Bowling");
		RohitCast.add("Record Breaker");
		
		Rohit.setCast(RohitCast);
		
		AllMovies.add(Rohit);
		
		superMovies.setMovies(AllMovies);
		
		List<TvSeries> Allseries=new ArrayList<TvSeries>();
		TvSeries series1=new TvSeries();
		series1.setTitle("TNPL");
		series1.setYear(2016);
		Allseries.add(series1);
		
		TvSeries series2=new TvSeries();
		series2.setTitle("IPL");
		series2.setYear(2000);
		Allseries.add(series2);
		
		TvSeries series3=new TvSeries();
		series3.setTitle("Ranji");
		series3.setYear(2010);
		Allseries.add(series3);
		
		superMovies.setTvseries(Allseries);
		
		
		OtherDetails other=new OtherDetails();
		other.setCountry("India");
		other.setLanguage("English");
		superMovies.setOtherdetails(other);
		
		ObjectMapper mapper=new ObjectMapper();
		
		File json=new File("complex.json");
		mapper.writerWithDefaultPrettyPrinter().writeValue(json, superMovies);
	
	}
	

}
