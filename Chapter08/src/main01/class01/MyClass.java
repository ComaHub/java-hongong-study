package main01.class01;

public class MyClass {
	RemoteControl remoteControl = new Television();
	
	MyClass() {};
	
	MyClass(RemoteControl remoteControl) {
		this.remoteControl = remoteControl;
		
		remoteControl.turnOn();
		remoteControl.setVolume(5);
	}
	
	void methodA() {
		RemoteControl remoteControl = new Audio();
		
		remoteControl.turnOn();
		remoteControl.setVolume(5);
	}
	
	void methodB(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.setVolume(5);
	}
}
