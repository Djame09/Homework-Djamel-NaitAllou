package homework2.encapsulation;

public class Plane {

	private double speed;
	private String seat;
	

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		if (seat == "FirstClass" || seat == "BusinessClass" || seat == "EconomyClass") {
		this.seat = seat;
		} else {
			this.seat= "NOT AVAILABE";
		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
}
