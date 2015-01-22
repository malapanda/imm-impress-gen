package impress.beans;

import impress.beans.Content;
import impress.beans.Image;

public class TextContent implements Content {

	private String text;

	public TextContent(String text) {
		this.text = text;
	}
	
	@Override
	public String getText() {
		return text;
	}

	@Override
	public Image getImage() {
		return null;
	}
	
	@Override
	public String toString() {
		return getText();
	}

}
