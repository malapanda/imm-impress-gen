package impress.generator;

import impress.beans.MapNode;
import impress.cases.SimpleCase;
import impress.utils.BFS;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import freemarker.template.TemplateException;

public class BFSTest {
	
	@Test
	public void testBFS() throws IOException, TemplateException {
		List<MapNode> list = genStruct();
		BFS dfs = new BFS(list.get(0));
		List<MapNode> nodes = dfs.getNodes();
		for (int i = 0; i < list.size(); i++) {
			Assert.assertEquals(list.get(i), nodes.get(i));
		}
	}

	private List<MapNode> genStruct() {
		return new SimpleCase().genBfsStruct();
	}
}
