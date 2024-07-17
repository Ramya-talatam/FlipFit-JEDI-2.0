package com.flipkart.bean;

public class Gym {
	private static int idCounter = 1;
	private int gymID;
	private String gymName;
	private String location;
	private int noOfSeats;
	private String gymOwnerID;

	public Gym() {
		this.gymID = idCounter++;
	}

	public int getGymID() {
		return gymID;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getGymOwnerID() {
		return gymOwnerID;
	}

	public void setGymOwnerID(String gymOwnerID) {
		this.gymOwnerID = gymOwnerID;
	}
}
