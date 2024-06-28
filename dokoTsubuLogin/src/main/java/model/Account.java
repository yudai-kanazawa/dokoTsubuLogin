package model;

public class Account extends User{
	private String name;
	private String mailAddress;
	private int age;
	
	public Account() {};
	public Account(String userId, String password, String name, String mailAddress, int age) {
		super(userId, password);
		setName(name);
		setMailAddress(mailAddress);
		setAge(age);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
