package imm.impress.beans;

import java.util.List;

public interface MapNode {

	public String getId();
	
	public MapNode getParent();
	
	public List<MapNode> getChildren();
	
	public Coordinates getCoordinates();
	
	public Rotation getRotation();
	
	public Content getContent();
	
	public Scale getScale();
	
	public NodeColor getColor();
	
}
