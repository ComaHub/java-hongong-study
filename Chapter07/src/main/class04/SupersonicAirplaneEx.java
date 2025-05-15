package main.class04;

public class SupersonicAirplaneEx {
	public static void main(String[] args) {
		SupersonicAirplane ssa = new SupersonicAirplane();
		
		ssa.takeOff();
		ssa.fly();
		ssa.flyMode = SupersonicAirplane.SUPERSONIC;
		ssa.fly();
		ssa.flyMode = SupersonicAirplane.NORMAL;
		ssa.fly();
		ssa.land();
	}
}
