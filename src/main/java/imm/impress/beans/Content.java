package imm.impress.beans;

import imm.impress.beans.Image;

public class Content {

	private String text;
	private String notes;

	private Image image;

	public Content(String text) {
		this(text, null, null);
	}
	
	public Content(String text, String notes, Image image) {
		this.text = text;
		this.image = image;
		this.notes = notes;
	}
	
	public String getText() {
		return text;
	}

	public Image getImage() {
		return image;
	}

	public String getNotes() {
		return notes;
	}
	
	@Override
	public String toString() {
		return getText();
	}

}
