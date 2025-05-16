package main01.class01;

public class SmartTelevisionEx {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		
		RemoteControl remoteControl = stv;
		Searchable searchable = stv;
	}
}
