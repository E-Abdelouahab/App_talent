package Model;

public class Administrator  extends user{
	private int id;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Administrator(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	public Administrator() {
		super();
	}
	

}
