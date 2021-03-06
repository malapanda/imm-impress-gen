package imm.impress.utils;

import imm.impress.beans.MapNode;

import java.util.LinkedList;
import java.util.List;


public class BFS {

	private List<MapNode> nodes = new LinkedList<MapNode>();
	
	private List<List<MapNode>> levelList = new LinkedList<List<MapNode>>();
	
	public BFS(MapNode root) {
		visit(0, root);
		flatenNodes();
	}

	public List<MapNode> getNodes() {
		return nodes;
	}
	
	private void visit(Integer level, MapNode node) {
		levelPut(level, node);
		for (MapNode child: node.getChildren()) {
			visit(level + 1, child);
		}
	}
	
	private void levelPut(Integer key, MapNode value) {
		if (levelList.size()<=key) {
			levelList.add(key, new LinkedList<MapNode>());
		}
		List<MapNode> list = levelList.get(key);
		list.add(value);
	}
	
	private void flatenNodes() {
		for (List<MapNode> list: levelList) {
			for (MapNode node: list) {
				nodes.add(node);
			}
		}
	}
	
}
