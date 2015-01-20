package utils;

import beans.Coordinates;

public class SimpleCoordinates implements Coordinates {

	private Integer x;
	private Integer y;
	private Integer z;

	public SimpleCoordinates(Integer x, Integer y, Integer z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public Integer getX() {
		return x;
	}

	@Override
	public Integer getY() {
		return y;
	}

	@Override
	public Integer getZ() {
		return z;
	}

}
