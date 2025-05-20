package main.class05;

public class ResourcePathEx {
	public static void main(String[] args) {
		Class myClass = Car.class;
		
		String photo1Path = myClass.getResource("photo1.png").getPath();
		String photo2Path = myClass.getResource("images/photo2.png").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
