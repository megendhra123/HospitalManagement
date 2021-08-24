/**
 * 
 */
package hospital_management;


import java.util.Scanner;

public class Main {

	void home() {
		System.out.println("1. Display patient details for patient id and name");
		System.out.println("2. Display the list of visit for patient id");
		System.out.println("3. Display the Visit details for given date range");
		System.out.println("4. Display the list of patient who needs the follow up visit");
		System.out.println("5. Display the list of patient by doctor id");
		System.out.println("6. Display all in-patient");
		System.out.println("7. Display all out-patient");
		System.out.println("8. Display today visited patients");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Choice : ");
		int id = scanner.nextInt();
		if(id>0 || id<9) {
		new Process(id);
		exit();
		}else {
			System.out.println("Enter a valid option");
		}
	}
	void exit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("Press any Key to Exit");
		String any = sc.next();
		Main main = new Main();
		main.home();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.home();
		
		

	}
}
