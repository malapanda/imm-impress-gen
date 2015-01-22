package impress.generator;

import impress.beans.MapNode;
import impress.beans.MindMap;
import impress.cases.SimpleCase;
import impress.generator.MindMapGenerator;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

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
