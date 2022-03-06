package com.lordofrings.sdk.repository;

import com.lordofrings.sdk.exception.MovieNotFoundException;
import com.lordofrings.sdk.model.Movie;
import com.lordofrings.sdk.model.MovieDTO;
import com.lordofrings.sdk.model.SearchMovieDTO;

public interface APIrepository {

	public MovieDTO getAll();

	public MovieDTO getById(String id) throws MovieNotFoundException;

	public Movie getLongestRuntime();

	public Movie searchMovie(SearchMovieDTO searchMovieDTO);

}
