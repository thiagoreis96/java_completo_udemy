package exercises;

import java.util.Scanner;
import entities.BoardingHouse;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BoardingHouse[] rent = new BoardingHouse[10];
		
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=N; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			rent[room] = new BoardingHouse(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
	
		for (int i=0; i<10; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		sc.close();
	}
}
