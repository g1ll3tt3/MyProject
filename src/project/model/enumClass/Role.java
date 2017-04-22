package project.model.enumClass;

public enum Role {
	ADMIN("admin"),
	NORMAL("normal"),
	MODIFIER("modifier"),
	GUEST("guest"),
	UNKNOWN("unknown");
	
	private String value;
	
	Role (String value) {
		this.value = value;
	}
	
	public String value() {
		return value;
	}
}
