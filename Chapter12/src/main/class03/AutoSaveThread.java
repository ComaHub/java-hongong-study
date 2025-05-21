package main.class03;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("저장했습니다.");
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			
			save();
		}
	}
}
