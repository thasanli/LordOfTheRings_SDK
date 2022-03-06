package com.lordofrings.sdk.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "_id" })
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("_id")
	private String id;
	private String name;
	private int runtimeInMinutes;
	private int budgetInMillions;
	private int boxOfficeRevenueInMillions;
	private int academyAwardWins;
	private int rottenTomatoesScore;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuntimeInMinutes() {
		return runtimeInMinutes;
	}

	public void setRuntimeInMinutes(int runtimeInMinutes) {
		this.runtimeInMinutes = runtimeInMinutes;
	}

	public int getBudgetInMillions() {
		return budgetInMillions;
	}

	public void setBudgetInMillions(int budgetInMillions) {
		this.budgetInMillions = budgetInMillions;
	}

	public int getBoxOfficeRevenueInMillions() {
		return boxOfficeRevenueInMillions;
	}

	public void setBoxOfficeRevenueInMillions(int boxOfficeRevenueInMillions) {
		this.boxOfficeRevenueInMillions = boxOfficeRevenueInMillions;
	}

	public int getAcademyAwardWins() {
		return academyAwardWins;
	}

	public void setAcademyAwardWins(int academyAwardWins) {
		this.academyAwardWins = academyAwardWins;
	}

	public int getRottenTomatoesScore() {
		return rottenTomatoesScore;
	}

	public void setRottenTomatoesScore(int rottenTomatoesScore) {
		this.rottenTomatoesScore = rottenTomatoesScore;
	}

}
