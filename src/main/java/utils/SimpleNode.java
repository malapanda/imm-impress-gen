package utils;

import java.util.LinkedList;
import java.util.List;

import beans.Content;
import beans.Coordinates;
import beans.MapNode;
import beans.Rotation;

public class SimpleNode implements MapNode {

	private static final IdGenerator idGen = new IdGenerator(); 
	
	private final String id;
	
	private MapNode parent;
	private Coordinates coordinates;
	private Rotation rotation;
	private Content content;
	private Integer scale;
	
	private List<MapNode> children = new LinkedList<>();
	
	public SimpleNode() {
		this(idGen.nextId());  
	}
	
	public SimpleNode(String id) {
		this.id = id;  
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public MapNode getParent() {
		return parent;
	}

	@Override
	public Coordinates getCoordinates() {
		return coordinates == null ? new EmptyCoordinates() : coordinates;
	}

	@Override
	public Rotation getRotation() {
		return rotation == null ? new EmptyRotation() : rotation;
	}

	@Override
	public Content getContent() {
		return content == null ? new TextContent("") : content;
	}

	@Override
	public Integer getScale() {
		return scale == null ? 1 : scale;
	}

	public void addChild(SimpleNode child) {
		children.add(child);		
		child.parent = child;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public void setRotation(Rotation rotation) {
		this.rotation = rotation;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	@Override
	public List<MapNode> getChildren() {
		return children;
	}

}
