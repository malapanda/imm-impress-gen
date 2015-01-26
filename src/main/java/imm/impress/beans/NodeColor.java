package imm.impress.beans;

public class NodeColor {
	
	private java.awt.Color color;

	public NodeColor(java.awt.Color color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		String hex = "#"+Integer.toHexString(color.getRGB()).substring(2);
		return hex;
	}

}
