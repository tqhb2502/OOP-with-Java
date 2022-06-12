package vehicle;

public class Map {
	Bike bike;
	Car car;
	
	public Map() {
		this.bike = new Bike(0, 0, 45, 20, 100, 5, 5, 10);
		this.car = new Car(10, 10, 180, 40, 200, 2.5, 10, 20);
	}
	
	public void update() {
		bike.move();
		bike.display();
		
		car.move();
		car.display();
	}
}
