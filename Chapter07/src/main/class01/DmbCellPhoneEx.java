package main.class01;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("아이폰 15 프로", "티타늄 블랙", 10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		System.out.println("채널: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("여보 아닌데요?");
		dmbCellPhone.sendVoice("맞는데요?");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
