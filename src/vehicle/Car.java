package vehicle;

public class Car extends Vehicle{
	public Car(double x, double y, double angle, double velocity, double maxVelocity, double turnSpeed, double acceleration, double deceleration) {
		super(x, y, angle, velocity, maxVelocity, turnSpeed, acceleration, deceleration);
	}

	@Override
	public void move() {
		super.ahead(200D);
		super.turnRight(180D);
		super.ahead(200D);
	}
}
