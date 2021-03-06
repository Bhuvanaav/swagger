package com.spring.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	
	private static List<Movie> movies = new ArrayList<Movie>();
	
	@GetMapping("/getall")
	public List<Movie> getMovies() {
		return movies;
	}
	
	@PostMapping("/save")
	public Movie addMovies(@RequestBody Movie movie) {
		movies.add(movie);
		return movie;
		
	}
	
	
	
	

}
