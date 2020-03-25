package com.e419.arma.model;

public class User {
	private String steamID;
	private String name;
	private String password;
	
	public String getSteamID() {
		return steamID;
	}
	public void setSteamID(String steamID) {
		this.steamID = steamID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
