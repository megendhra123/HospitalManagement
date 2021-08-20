/**
 * 
 */
package hospital_management;


import java.util.Scanner;

public class Main {

	void home() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice : ");
		int id = scanner.nextInt();

		 new Process(id);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.home();

	}
}
