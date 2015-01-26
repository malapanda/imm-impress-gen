package imm.impress.generator;

import imm.impress.beans.MindMap;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class MindMapGenerator {
	
	private Configuration cfg; 
	private Template template;
	private String templateName;
	
	public MindMapGenerator(String templateName, File templateDir) throws IOException {
		this.templateName = templateName;
		cfg = new Configuration(Configuration.VERSION_2_3_21);
	    cfg.setDirectoryForTemplateLoading(templateDir);
	    cfg.setDefaultEncoding("UTF-8");
	    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
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
