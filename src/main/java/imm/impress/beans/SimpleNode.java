package imm.impress.beans;

import imm.impress.utils.IdGenerator;

import java.util.ArrayList;
import java.util.List;


public class SimpleNode implements MapNode {

	private static final IdGenerator idGen = new IdGenerator(); 
	
	private final String id;
	
	private MapNode parent;
	private Coordinates coordinates;
	private Rotation rotation;
	private Content content;
	private Scale scale;
	private NodeColor color;
	
	private List<MapNode> children = new ArrayList<MapNode>();
	
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
		return content == null ? new Content("") : content;
	}

	@Override
	public Scale getScale() {
		return scale == null ? new Scale(1) : scale;
	}
	
	@Override
	public NodeColor getColor() {
		return color;
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
	
	public void setColor(NodeColor color) {
		this.color = color;
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
