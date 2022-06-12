package vehicle;

public class Bike extends Vehicle{
	public Bike(double x, double y, double angle, double velocity, double maxVelocity, double turnSpeed, double acceleration, double deceleration) {
		super(x, y, angle, velocity, maxVelocity, turnSpeed, acceleration, deceleration);
	}

	@Override
	public void move() {
		super.ahead(50D);
		super.turnLeft(90D);
		super.ahead(100D);
	}
}
