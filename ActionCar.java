package week1.day2.assignments;

public class ActionCar {

	public static void main(String[] args) {
		ActionCar carobj = new ActionCar();
		carobj.applyBreak();
		carobj.applyGear();
		carobj.switchOnAc();
		carobj.applyAcclerate();

	}
	
	public void applyBreak() {
		System.out.println("Break Applied");
	}
	
	public void applyGear() {
		System.out.println("5th Gear Engaged");
	}
	
	public void switchOnAc() {
		System.out.println("AC On");
	}
	
	public void applyAcclerate() {
		System.out.println("Accelerating put on your seat belt");
	}
	
	

}
