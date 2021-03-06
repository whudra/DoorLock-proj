package DTO;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class LogDTO {
	private String serial_number;
	private String date;
	private String state;
	private String imagelog;
	private int id;
	
	public LogDTO() {
		Timestamp time = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat date_format = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		this.date = date_format.format(time);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getImagelog() {
		return imagelog;
	}

	public void setImagelog(String imagelog) {
		this.imagelog = imagelog;
	}

	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
