package generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import beans.MindMap;

public class MindMapGenerator {
	
	private static final String DEFAULT_TEMPLATE_DIR = "D:\\PRACA IN¯YNIERSKA\\workspace2\\imm_impress_gen\\resources";
	private static final String DEFAULT_TEMPLATE_NAME = "test.ftl";
	
	private Configuration cfg; 
	private Template template;
	private String templateName;
	
	public MindMapGenerator(String templateName, String templateDir) throws IOException {
		this.templateName = templateName != null ? templateName : DEFAULT_TEMPLATE_NAME;
		File dir = templateDir != null ? new File(templateDir) : new File(DEFAULT_TEMPLATE_DIR);
		cfg = new Configuration(Configuration.VERSION_2_3_21);
	    cfg.setDirectoryForTemplateLoading(dir);
	    cfg.setDefaultEncoding("UTF-8");
	    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
	}
	
	public MindMapGenerator() throws IOException {
		this(null, null);
	}
	
	public MindMapGenerator(String templateName) throws IOException {
		this(templateName, null);
	}
		
	public void generateMindMap(MindMap map, Writer out) throws IOException, TemplateException {
		template = cfg.getTemplate(templateName);
		template.process(map, out);
	}
	
	public void generateToStdout(MindMap map) throws IOException, TemplateException {
		 Writer out = new OutputStreamWriter(System.out);
		 generateMindMap(map, out);
	}
	
	public void generateToFile(File resultFile, MindMap map) throws IOException, TemplateException {
		Writer out = new PrintWriter(resultFile);
		generateMindMap(map, out);
	}

}
