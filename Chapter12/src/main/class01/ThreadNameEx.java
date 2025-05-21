package main.class01;

public class ThreadNameEx {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Start Program Thread Name: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("Work Thread Name: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("Work Thread Name: " + threadB.getName());
		threadB.start();
	}
}
