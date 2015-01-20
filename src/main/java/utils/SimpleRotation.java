package utils;

import beans.Rotation;

public class SimpleRotation implements Rotation {

	private Integer x;
	private Integer y;
	private Integer z;

	public SimpleRotation(Integer x, Integer y, Integer z) {
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
