package imm.impress.generator;

import imm.impress.generator.MindMapGenerator;

import java.io.File;
import java.io.IOException;

public class GeneratorTest {
	
	protected File templateFolder  = new File(new File("src", "test"), "resources");
	
	protected MindMapGenerator forTestTemplate(String name) throws IOException {
		return new MindMapGenerator(name, templateFolder);
	}
	
}
