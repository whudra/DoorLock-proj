package DTO;

public class UserDTO {
	private String serialNumber;
	private String ip;
	private String port;
	private String a_pw;
	private String d_pw;
	private String admin;
	private String name;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getA_pw() {
		return a_pw;
	}
	public void setA_pw(String a_pw) {
		this.a_pw = a_pw;
	}
	public String getD_pw() {
		return d_pw;
	}
	public void setD_pw(String d_pw) {
		this.d_pw = d_pw;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void set_All(String serialNumber, String ip, String port, String a_pw, String d_pw, String name) {
		this.serialNumber = serialNumber;
		this.ip = ip;
		this.port = port;
		this.a_pw = a_pw;
		this.d_pw = d_pw;
		this.name = name;
	}
}
