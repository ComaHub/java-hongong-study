package main8;

public class ShopServiceEx {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		System.out.println(obj1 == obj2);
	}
}
