package bankactivites;

public class Account {
	private String accname,email;
	private int bal;
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Account [accname=" + accname + ", email=" + email + ", bal=" + bal + "]";
	}
	
	
}
