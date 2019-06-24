package neueduexam.DTFcontroller;

public class timetestEntity {
	private int hour;
	private int minutes;
	private int seconds;
	private int mycount;
	private int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getMycount() {
		return mycount;
	}
	public void setMycount(int mycount) {
		this.mycount = mycount;
	}
}
