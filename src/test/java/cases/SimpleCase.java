package cases;

import java.util.Arrays;
import java.util.List;

import beans.Coordinates;
import beans.MapNode;
import beans.Rotation;
import beans.Scale;
import beans.SimpleNode;
import beans.TextContent;

public class SimpleCase {
	
	final SimpleNode root;

	final SimpleNode n1;
	final SimpleNode n11;
	final SimpleNode n111;

	final SimpleNode n12;

	final SimpleNode n2;
	final SimpleNode n21;

	final SimpleNode n3;

	public SimpleCase() {

		root = new SimpleNode();
		root.setContent(new TextContent("root"));
		root.setScale(new Scale(4));

		n1 = new SimpleNode();
		n1.setContent(new TextContent("1"));
		n1.setCoordinates(new Coordinates(-800, 300, -50));
		n1.setScale(new Scale(2));
		n1.setRotation(new Rotation(-15, 0, 0));

		root.addChild(n1);

		n2 = new SimpleNode();
		n2.setContent(new TextContent("2"));
		n2.setCoordinates(new Coordinates(0, 300, -50));
		n2.setScale(new Scale(2));
		n2.setRotation(new Rotation(-15, 0, 0));

		root.addChild(n2);

		n3 = new SimpleNode();
		n3.setContent(new TextContent("2"));
		n3.setCoordinates(new Coordinates(800, 300, -50));
		n3.setScale(new Scale(2));
		n3.setRotation(new Rotation(-15, 0, 0));

		root.addChild(n3);

		n11 = new SimpleNode();
		n11.setContent(new TextContent("11"));
		n11.setCoordinates(new Coordinates(-1200, 500, -75));
		n11.setScale(new Scale(1));
		n11.setRotation(new Rotation(-30, 0, 0));

		n1.addChild(n11);

		n12 = new SimpleNode();
		n12.setContent(new TextContent("12"));
		n12.setCoordinates(new Coordinates(-600, 500, -75));
		n12.setScale(new Scale(1));
		n12.setRotation(new Rotation(-30, 0, 0));

		n1.addChild(n12);

		n111 = new SimpleNode();
		n111.setContent(new TextContent("111"));
		n111.setCoordinates(new Coordinates(-1400, 700, -90));
		n111.setScale(new Scale(0.5));
		n111.setRotation(new Rotation(-45, 0, 0));

		n11.addChild(n111);

		n21 = new SimpleNode();
		n21.setContent(new TextContent("21"));
		n21.setCoordinates(new Coordinates(0, 500, -75));
		n21.setScale(new Scale(0.5));
		n21.setRotation(new Rotation(-45, 0, 0));

		n2.addChild(n21);
	}

	public List<MapNode> genDfsStruct() {
		return Arrays.asList((MapNode) root, (MapNode) n1, (MapNode) n11,
				(MapNode) n111, (MapNode) n12, (MapNode) n2, (MapNode) n21,
				(MapNode) n3);
	}
	
	public List<MapNode> genBfsStruct() {
		return Arrays.asList((MapNode) root, (MapNode) n1, (MapNode) n2, (MapNode) n3, (MapNode) n11,
				 (MapNode) n12,(MapNode) n21,(MapNode) n111);
	}
}
