
public class Battery {
	private double capacity;
	private double amount;
	
	public Battery(double capacity) {
		this.capacity = capacity;
	}
	
	public void drain(double amount) {
		this.amount = amount;
	}
	
	public void charge() {
		
	}
	
	public double getRemainingCapacity() {
		return capacity;
	}
	
	
	
	
}
