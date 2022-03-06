package com.lordofrings.sdk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lordofrings.sdk.exception.MovieNotFoundException;
import com.lordofrings.sdk.model.Movie;
import com.lordofrings.sdk.model.MovieDTO;
import com.lordofrings.sdk.model.SearchMovieDTO;
import com.lordofrings.sdk.service.MovieService;

@RestController
public class SDKController {

	private static final Logger LOG = LoggerFactory.getLogger(SDKController.class);

	@Autowired
	MovieService movieService;

	@GetMapping("/movie")
	public ResponseEntity<MovieDTO> getAll() {
		MovieDTO response = null;
		try {
			response = movieService.getAll();
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			LOG.error("Exception occured: " + e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/movie/{id}")
	public ResponseEntity<MovieDTO> getAll(@PathVariable String id) {
		MovieDTO response = null;
		try {
			response = movieService.getById(id);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (MovieNotFoundException e) {
			LOG.error("Exception occured: " + e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			LOG.error("Exception occured: " + e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@GetMapping("/movie/longest")
	public ResponseEntity<Movie> getLonestRuntimeMovie() {
		Movie movie = null;
		try {
			movie = movieService.getLongestRuntime();
			return new ResponseEntity<>(movie, HttpStatus.OK);
		} catch (Exception e) {
			LOG.error("Exception occured: " + e.getMessage());
			return new ResponseEntity<>(movie, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/movie/search")
	public ResponseEntity<Movie> search(@RequestBody SearchMovieDTO searchMovieDTO) {
		Movie movie = null;
		try {
			movie = movieService.searchMovie(searchMovieDTO);
			return new ResponseEntity<>(movie, HttpStatus.OK);
		} catch (MovieNotFoundException e) {
			LOG.error("Exception occured: " + e.getMessage());
			return new ResponseEntity<>(movie, HttpStatus.NOT_FOUND);
		}
	}
	
	
}
