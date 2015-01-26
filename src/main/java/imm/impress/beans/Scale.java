package imm.impress.beans;

public class Scale {
	
	private double scale;

	public Scale(double scale) {
		this.scale = scale;
	}
	
	@Override
	public String toString() {
	    if(scale == (long) scale)
	        return String.format("%d",(long)scale);
	    else
	        return String.format("%s",scale);
	}

}
