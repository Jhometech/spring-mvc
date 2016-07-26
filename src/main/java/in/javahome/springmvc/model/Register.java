package in.javahome.springmvc.model;

public class Register {
	private String name;
	private String mail;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", mail=" + mail + ", password=" + password + "]";
	}
}
