/**
 * 
 */
package hospital_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Patient patient1;
		List<Patient> listPatient = new ArrayList<>();
		
		patient1=new Patient(100001, "Patient1", "01/02/2002", 9876543210L, "Vellore", "OUT PATIENT");
		listPatient.add(patient1);
		
		patient1=new Patient(100002, "Patient2", "01/02/2002", 9876543211L, "Vellore", "OUT PATIENT");
		listPatient.add(patient1);
		
		patient1=new Patient(100003, "Patient3", "01/02/2002", 9876543212L, "Vellore", "OUT PATIENT");
		listPatient.add(patient1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Patient Id : ");
		int id = scanner.nextInt();
		System.out.println("Enter Patient Name : ");
		String name = scanner.next();

		for (Patient patient : listPatient) {
			if(patient.patientId==id) {
				if(patient.patientName==name) {
					System.out.println("\n*********************************\n");
					System.out.println("Patient Id :" + patient.patientId);
					System.out.println("Patient Name :" + patient.patientName);
					System.out.println("Patient DOB :" + patient.patientDob);
					System.out.println("Patient PhNo :" + patient.patientPhoneNumber);
					System.out.println("Patient Location :" + patient.patientAddress);
					System.out.println("Patient Type :" + patient.patientType);
				}else {
					System.out.println("Enter Valid Patient Details");
				}
			}else {
					System.out.println("Enter Valid Patient Details");
				}
		}
		}

	
}
