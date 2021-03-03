package application;

import java.util.Date;

import entities.Order2;
import entities.enums.OrderStatus;

public class Program9 {

	public static void main(String[] args) {
		
		Order2 order = new Order2(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}
}
