package generator;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import beans.MapNode;
import beans.MindMap;
import cases.SimpleCase;
import freemarker.template.TemplateException;

public class MindMapGeneratorTest extends GeneratorTest {
	

	@Test
	public void testSth() throws IOException, TemplateException {
		MindMapGenerator generator = forTestTemplate("test_impress.ftl");		
		MindMap map = new MindMap() {
			@Override
			public List<MapNode> getNodesInOrder() {
				return genStruct();
			}
		};
		generator.generateToStdout(map);
	}
	

	private List<MapNode> genStruct() {
		return new SimpleCase().genDfsStruct();
	}
	
}
