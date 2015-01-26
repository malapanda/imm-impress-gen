package imm.impress.utils;

public class IdGenerator {
	
	private int num = 1;
	
	public String nextId() {
		return "imm" + num++;
	}

}
