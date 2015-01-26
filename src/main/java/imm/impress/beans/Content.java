package imm.impress.beans;

import imm.impress.beans.Image;

public class Content {

	private String text;
	private Image image;

	public Content(String text) {
		this(text, null);
	}
	
	public Content(String text, Image image) {
		this.text = text;
		this.image = image;
	}
	
	public String getText() {
		return text;
	}

	public Image getImage() {
		return image;
	}
	
	@Override
	public String toString() {
		return getText();
	}

}
