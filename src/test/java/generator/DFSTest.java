package generator;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import utils.DFS;

import beans.MapNode;
import cases.SimpleCase;

import freemarker.template.TemplateException;

public class DFSTest {
	
	@Test
	public void testDFS() throws IOException, TemplateException {
		List<MapNode> list = genStruct();
		DFS dfs = new DFS(list.get(0));
		List<MapNode> nodes = dfs.getNodes();
		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i), nodes.get(i));
		}
	}

	private List<MapNode> genStruct() {
		return new SimpleCase().genStruct();
	}
}
