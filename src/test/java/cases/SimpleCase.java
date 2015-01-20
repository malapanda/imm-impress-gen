package cases;

import java.util.Arrays;
import java.util.List;

import utils.SimpleCoordinates;
import utils.SimpleNode;
import utils.SimpleRotation;
import utils.TextContent;
import beans.MapNode;

public class SimpleCase {
	public List<MapNode> genStruct() {

		final SimpleNode root = new SimpleNode();
		root.setContent(new TextContent("root"));
		root.setScale(4);

		final SimpleNode n1 = new SimpleNode();
		n1.setContent(new TextContent("1"));
		n1.setCoordinates(new SimpleCoordinates(-800, 300, -50));
		n1.setScale(2);
		n1.setRotation(new SimpleRotation(-15, 0, 0));

		root.addChild(n1);

		final SimpleNode n2 = new SimpleNode();
		n2.setContent(new TextContent("2"));
		n2.setCoordinates(new SimpleCoordinates(0, 300, -50));
		n2.setScale(2);
		n2.setRotation(new SimpleRotation(-15, 0, 0));

		root.addChild(n2);

		final SimpleNode n3 = new SimpleNode();
		n3.setContent(new TextContent("2"));
		n3.setCoordinates(new SimpleCoordinates(800, 300, -50));
		n3.setScale(2);
		n3.setRotation(new SimpleRotation(-15, 0, 0));

		root.addChild(n3);

		return Arrays.asList((MapNode) root, (MapNode) n1, (MapNode) n2,
				(MapNode) n3);
	}
}
