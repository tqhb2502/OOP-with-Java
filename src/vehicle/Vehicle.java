package vehicle;

public abstract class Vehicle {
	private double x;	// vị trí xe (Oxy)
	private double y;
	private double angle;	// góc của xe (độ)
	private double velocity;		// vận tốc (m/s)
	private double maxVelocity;	// vận tốc tối đa (m/s)	
	private double turnSpeed;	// tốc độ quay (độ/giây)
	private double acceleration;		// gia tốc tăng (m/s^2)
	private double deceleration;		// gia tốc giảm (m/s^2)
	
	// GETTER AND SETTER
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getAngle() {
		return angle;
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public double getVelocity() {
		return velocity;
	}
	
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
	public double getMaxVelocity() {
		return maxVelocity;
	}
	
	public void setMaxVelocity(double maxVelocity) {
		this.maxVelocity = maxVelocity;
	}
	
	public double getTurnSpeed() {
		return turnSpeed;
	}
	
	public void setTurnSpeed(double turnSpeed) {
		this.turnSpeed = turnSpeed;
	}
	
	public double getAcceleration() {
		return acceleration;
	}
	
	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}
	
	public double getDeceleration() {
		return deceleration;
	}
	
	public void setDeceleration(double deceleration) {
		this.deceleration = deceleration;
	}
	
	// CONSTRUCTOR
	public Vehicle(double x, double y, double angle, double velocity, double maxVelocity, double turnSpeed, double acceleration, double deceleration) {
		this.x = x;
		this.y = y;
		this.angle = angle;
		this.velocity = velocity;
		this.maxVelocity = maxVelocity;
		this.turnSpeed = turnSpeed;
		this.acceleration = acceleration;
		this.deceleration = deceleration;
	}
	
	public void ahead() {		// tiến lên phía trước với vận tốc velocity trong 1 giây
		double s = velocity;		// quãng đường
		
		double angleInRadians = Math.toRadians(angle);	// đổi góc từ độ sang radians
		
		x += s * Math.cos(angleInRadians);		// tính toán tọa độ mới
		y += s * Math.sin(angleInRadians);
	}
	
	public void turnRight() {		// quay phải với tốc độ turnSpeed trong 1 giây
		angle -= turnSpeed;
		
		while (angle < 0) {
			angle += 360;
		}
	}
	
	public void turnLeft() {		// quay trái với tốc độ turnSpeed trong 1 giây
		angle += turnSpeed;
		
		while (angle >= 360) {
			angle -= 360;
		}
	}
	
	public void display() {	// hiển thị tọa độ và góc hiện tại
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Angle: " + angle);
		System.out.println("--------------------");
	}
	
	public void forward() {	// tiến từ từ về phía trước đến vận tốc maxVelocity
		while (velocity < maxVelocity) {
			velocity += acceleration;	// tăng vận tốc velocity theo gia tốc acceleration
			
			ahead();	// tiến lên phía trước
		}
		
		velocity = maxVelocity;
	}
	
	public void brake() {		// giảm tốc độ từ từ về 0
		while (velocity > 0) {
			velocity -= deceleration;	// giảm vận tốc velocity theo gia tốc giảm deceleration
			
			ahead();	// tiến lên phía trước
		}
		
		velocity = 0;
	}
	
	public void ahead(double distance) {
		double s = 0;
		
		while (s < distance) {
			velocity += acceleration;
			if (velocity > maxVelocity) {
				velocity = maxVelocity;
			}
			
			if (s + velocity > distance) {
				double angleInRadians = Math.toRadians(angle);
				
				x += (distance - s) * Math.cos(angleInRadians);
				y += (distance - s) * Math.sin(angleInRadians);
				
				s = distance;
			} else {
				ahead();
				s += velocity;
			}
		}
	}
	
	public void turnLeft(double degree) {
		double alpha = 0;
		
		while (alpha < degree) {
			if (alpha + turnSpeed > degree) {
				angle += (degree - alpha);
				alpha = degree;
			} else {
				angle += turnSpeed;
				alpha += turnSpeed;
			}
			
			while (angle >= 360) {
				angle -= 360;
			}
		}
	}
	
	public void turnRight(double degree) {
		double alpha = 0;
		
		while (alpha < degree) {
			if (alpha + turnSpeed > degree) {
				angle -= (degree - alpha);
				alpha = degree;
			} else {
				angle -= turnSpeed;
				alpha += turnSpeed;
			}
			
			while (angle < 0) {
				angle += 360;
			}
		}
	}
	
	public abstract void move();
}
