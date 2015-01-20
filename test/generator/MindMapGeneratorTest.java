package generator;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import freemarker.template.TemplateException;

import beans.MindMap;
import beans.Product;

public class MindMapGeneratorTest {
	
	MindMap map;
	MindMapGenerator generator;
	
	@Before
	public void before() throws IOException {
			map = new MindMap() {
			
			@Override
			public String getUser() {
				// TODO Auto-generated method stub
				return "rysiek";
			}
			
			@Override
			public Product getLatestProduct() {
				// TODO Auto-generated method stub
				return new Product() {
					
					@Override
					public String getUrl() {
						// TODO Auto-generated method stub
						return "url";
					}
					
					@Override
					public String getName() {
						// TODO Auto-generated method stub
						return "name";
					}
				};
			}
		};
		
		generator = new MindMapGenerator();
		
	}
	
	@Test
	public void testGeneration() throws IOException, TemplateException {
		generator.generateToStdout(map);
	}
	
	@Test
	public void testGeneration2() throws IOException, TemplateException {
		generator.generateToFile(new File("panda.html"), map);
	}
	
	@Test
	public void testGeneration3() throws IOException, TemplateException {
		generator = new MindMapGenerator("panda_templ.ftl");
		generator.generateToStdout(map);
	}

}
