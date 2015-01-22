package impress.beans;

import impress.utils.IdGenerator;

import java.util.ArrayList;
import java.util.List;


public class SimpleNode implements MapNode {

	protected static final IdGenerator idGen = new IdGenerator(); 
	
	protected final String id;
	
	protected MapNode parent;
	protected Coordinates coordinates;
	protected Rotation rotation;
	protected Content content;
	protected Scale scale;
	
	protected List<MapNode> children = new ArrayList<>();
	
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
		return coordinates == null ? new Coordinates(0,0,0) : coordinates;
	}

	@Override
	public Rotation getRotation() {
		return rotation == null ? new Rotation(0,0,0) : rotation;
	}

	@Override
	public Content getContent() {
		return content == null ? new TextContent("") : content;
	}

	@Override
	public Scale getScale() {
		return scale == null ? new Scale(1) : scale;
	}

	public void addChild(SimpleNode child) {
		children.add(child);		
		child.parent = this;
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

	public void setScale(Scale scale) {
		this.scale = scale;
	}
	
	@Override
	public List<MapNode> getChildren() {
		return children;
	}
	
	@Override
	public String toString() {
		return getContent().getText().toString();
	}

}
