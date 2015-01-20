package utils;

import java.util.LinkedList;
import java.util.List;

import beans.MapNode;

public class BFS {

	private List<MapNode> nodes = new LinkedList<>();
	
	public BFS(MapNode root) {
		visit(root);
	}
	
	public List<MapNode> getNodes() {
		return nodes;
	}
	
	private void visit(MapNode node) {
		// TODO
	}
	
}
