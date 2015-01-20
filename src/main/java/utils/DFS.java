package utils;

import java.util.LinkedList;
import java.util.List;

import beans.MapNode;

public class DFS {

	private List<MapNode> nodes = new LinkedList<>();
	
	public DFS(MapNode root) {
		visit(root);
	}
	
	public List<MapNode> getNodes() {
		return nodes;
	}
	
	private void visit(MapNode node) {
		nodes.add(node);
		for (MapNode child : node.getChildren()) {
			visit(child);
		}
	}
	
}
