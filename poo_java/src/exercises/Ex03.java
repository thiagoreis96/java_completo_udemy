package exercises;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Ex03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		st.name = sc.nextLine();
		st.n1 = sc.nextDouble();
		st.n2 = sc.nextDouble();
		st.n3 = sc.nextDouble();
		
		System.out.println(st);
		
		if (st.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f%n", st.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}