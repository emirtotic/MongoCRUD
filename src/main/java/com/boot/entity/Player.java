package com.boot.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
public class Player {

	private int id;
	private String name;
	private String surname;
	private String team;

	public Player(int id, String name, String surname, String team) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player " + name + " " + surname + ". Team: " + team;
	}

}
