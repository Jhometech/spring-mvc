package in.javahome.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="STUDENT_REGISTRATION")
@Entity
public class Register implements Serializable{
	@Id@GeneratedValue
	@Column(name="STD_ID")
	private Integer stdId;
	@Column(name="NAME")
	private String name;
	@Column(name="MAIL")
	private String mail;
	@Column(name="PASSWORD")
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
