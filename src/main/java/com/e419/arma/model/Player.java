package com.e419.arma.model;

public class Player {
	private String steamID;
	private String name;
	private String lastJoined;
	private String model;
	private String loadout;
	private String overallDamage;
	private int[] selectionsDamages = new int[17];
	private float[] lastPosition = new float[3];
	private String direction;
	private String stance;
	private String isIncapacitated;
	private String money;
	
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
	public String getLastJoined() {
		return lastJoined;
	}
	public void setLastJoined(String lastJoined) {
		this.lastJoined = lastJoined;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLoadout() {
		return loadout;
	}
	public void setLoadout(String loadout) {
		this.loadout = loadout;
	}
	public String getoverallDamage() {
		return overallDamage;
	}
	public void setoverallDamage(String overallDamage) {
		this.overallDamage = overallDamage;
	}
	public int[] getSelectionsDamages() {
		return selectionsDamages;
	}
	public void setSelectionsDamages(int[] selectionsDamages) {
		this.selectionsDamages = selectionsDamages;
	}
	public float[] getLastPosition() {
		return lastPosition;
	}
	public void setLastPosition(float[] lastPosition) {
		this.lastPosition = lastPosition;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getStance() {
		return stance;
	}
	public void setStance(String stance) {
		this.stance = stance;
	}
	public String getIsIncapacitated() {
		return isIncapacitated;
	}
	public void setIsIncapacitated(String isIncapacitated) {
		this.isIncapacitated = isIncapacitated;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
}
