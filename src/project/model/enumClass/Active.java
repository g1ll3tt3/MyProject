package project.model.enumClass;

public enum Active {
	ACTIVE(1),
	NOT_ACTIVE(0);
	
	private int value;
	
	private Active(int value) {
		this.value = value;
	}
	
	public int value() {
		return value;
	}
}
