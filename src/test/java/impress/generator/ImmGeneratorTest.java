package impress.generator;

import impress.beans.MapNode;
import impress.beans.MindMap;
import impress.cases.SimpleCase;
import impress.generator.MindMapGenerator;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import freemarker.template.TemplateException;

public class ImmGeneratorTest extends GeneratorTest {
	
	@Test
	public void testSth() throws IOException, TemplateException {
		MindMapGenerator generator = forTestTemplate("impress.ftl");		
		MindMap map = new MindMap() {
			@Override
			public List<MapNode> getNodesInOrder() {
				return new SimpleCase().genBfsStruct();
			}
		};
		generator.generateToFile(new File("test.html"),map);
	}
	
}
