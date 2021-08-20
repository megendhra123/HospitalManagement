/**
 * 
 */
package hospital_management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Process {
	Scanner sc = new Scanner(System.in);

	public Process(int choice) {

		switch (choice) {

		case 1:
			getPatientDetails();
			break;
			
			

		}

	}

	void getPatientDetails() {

		System.out.println("Enter Patient Id : ");
		int patientId = sc.nextInt();
		System.out.println("Enter Patient Name :");
		String patientName = sc.next();
		if (patientId > 99999 && patientId < 1000000 && patientName != null && !patientName.isEmpty()) {
			
			DataStorage data = new DataStorage();
			HashMap<Integer, List<Patient>> listPatient = data.patientLists();
			
			for (Map.Entry<Integer, List<Patient>> patient : listPatient.entrySet()) {
				
				List<Patient> list=new ArrayList<Patient>(patient.getValue());
				for(Patient patientList : list)
				if (patientId == patient.getKey() && patientName.equalsIgnoreCase(patientList.patientName)) {

					System.out.println("\n*********************************\n");
					System.out.println("Patient Id :" + patient.getKey());
					System.out.println("Patient Name :" + patientList.patientName);
					System.out.println("Patient DOB :" + patientList.patientDob);
					System.out.println("Patient PhNo :" + patientList.patientPhoneNumber);
					System.out.println("Patient Location :" + patientList.patientAddress);
					System.out.println("Patient Type :" + patientList.patientType);
			}
			}
		} else {
			System.out.println("Enter vaid Patient Details..");
		}

	}

	void exit() {
		System.out.println("Press any Key to Exit");
		String any = sc.next();
		Main main = new Main();
		main.home();
	}

}
