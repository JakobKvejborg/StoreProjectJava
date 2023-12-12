package model;

public class Aisle {

	private String placement;
	private Location location;
	
	public Aisle(String placement, Location location) {
		this.placement = placement;
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}

}
