/**
 * 
 */
package hospital_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;

public class Process {
	Scanner sc = new Scanner(System.in);

	public Process(int choice) {

		switch (choice) {

		case 1:
			getPatientDetails();
			break;

		case 2:
			getListOfVisitByPatientId();
			break;

		case 3:
			getListOfVisitByDateRange();
			break;

		case 4:
			getFollowUpNeededPatientDetails();
			break;

		case 5:
			getListOfPatientByDoctorId();
			break;

		case 6:
			getInPatientList();
			break;

		case 7:
			getOutPatientLists();
			break;

		case 8:
			getTodayVisitedPatientList();
			break;

		}

	}

	void getPatientDetails() {

		System.out.println("Enter Patient Id : ");
		int patientId = sc.nextInt();
		System.out.println("Enter Patient Name :");
		String patientName = sc.next();
		if (patientId > 99999 && patientId < 1000000 && patientName != null && !patientName.isEmpty()) {
			int recordCount = 0;
			DataStorage data = new DataStorage();
			HashMap<Integer, List<Patient>> listPatient = data.patientLists();

			System.out.println("Patient List");
			for (Map.Entry<Integer, List<Patient>> patient : listPatient.entrySet()) {

				List<Patient> list = new ArrayList<Patient>(patient.getValue());
				for (Patient patientList : list) {
					if (patientId == patient.getKey() && patientName.equalsIgnoreCase(patientList.patientName)) {

						System.out.println("\n*********************************\n");
						System.out.println("Patient Name :" + patientList.patientName);
						System.out.println(
								"Patient DOB :" + new SimpleDateFormat("dd/MM/yyyy").format(patientList.patientDob));
						System.out.println("Patient PhNo :" + patientList.patientPhoneNumber);
						System.out.println("Patient Location :" + patientList.patientAddress);
						System.out.println("Patient Type :" + patientList.patientType);

						recordCount++;
					}
				}
			}
			System.out.println("\n----------------------\n");
			System.out.println("Total Record found : " + recordCount);
		} else {
			System.out.println("Enter vaid Patient Details..");
		}

	}

	void getListOfVisitByPatientId() {
		System.out.println("Enter Patient Id : ");
		int patientId = sc.nextInt();
		if (patientId > 99999 && patientId < 1000000) {
			DataStorage dataStorage = new DataStorage();
			int recordCount = 0;
			List<Appointment> appointmentLists = dataStorage.appointmentsLists();
			System.out.println("Patient List");
			for (Appointment appointment : appointmentLists) {
				if (appointment.patientId == patientId) {
					System.out.println("\n**************************\n");
					System.out.println("Patient Id : " + appointment.patientId);
					System.out.println(
							"Date of Visit : " + new SimpleDateFormat("dd/MM/yyyy").format(appointment.dateOfVisit));
					System.out.println("Doctor Visitied : " + appointment.doctorToVisit);
					System.out.println("Purpose of visit : " + appointment.purposeOfVisit);
					System.out.println("Number of Visit : " + appointment.isFirstVisit);
					recordCount++;
				}
			}
			System.out.println("\n--------------------------\n");
			System.out.println("Total Record Found  : " + recordCount);
		} else {
			System.out.println("Enter a valid patient id");
		}
	}

	void getListOfVisitByDateRange() {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fromDate = null, toDate = null;
		try {
			System.out.println("After (dd/MM/yyyy) : ");
			fromDate = simpleDateFormat.parse(sc.next());
			System.out.println("Before (dd/MM/yyyy) : ");
			toDate = simpleDateFormat.parse(sc.next());
		} catch (ParseException e) {
			System.out.println(e.getLocalizedMessage());
		}
		int recordCount = 0;
		DataStorage dataStorage = new DataStorage();
		System.out.println("Patient List");
		List<Appointment> list = dataStorage.appointmentsLists();
		for (Appointment appointmentLists : list) {
			if (appointmentLists.dateOfVisit.after(fromDate) && appointmentLists.dateOfVisit.before(toDate)) {
				System.out.println("\n*****************************************\n");
				System.out.println("Patient Id : " + appointmentLists.patientId);
				System.out.println("Date of Visit: " + simpleDateFormat.format(appointmentLists.dateOfVisit));
				System.out.println("Purpose of visit : " + appointmentLists.purposeOfVisit);
				System.out.println("visited Doctor Id : " + appointmentLists.doctorToVisit);
				recordCount++;
			}
		}
		System.out.println("\n-----------------------\n");
		System.out.println("Total record found : " + recordCount);

	}

	void getFollowUpNeededPatientDetails() {
		int recordCount = 0;
		DataStorage dataStorage = new DataStorage();
		HashMap<Integer, List<ConsultationInformation>> consultationList = dataStorage.consultationInformationLists();

		System.out.println("Follow up needed Patient lists");
		for (Map.Entry<Integer, List<ConsultationInformation>> mv : consultationList.entrySet()) {
			List<ConsultationInformation> followUpNeededlists = new ArrayList<ConsultationInformation>(mv.getValue());
			for (ConsultationInformation list : followUpNeededlists) {
				if (list.followUpNeeded.equalsIgnoreCase("follow up need")) {
					System.out.println("\n******************************\n");
					System.out.println("Patient id : " + list.patientId);
					recordCount++;
				}
			}
			System.out.println("\n--------------------------------\n");
			System.out.println("Total record Found : " + recordCount);
			break;
		}
	}

	void getListOfPatientByDoctorId() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Doctor Id : ");
		int doctorid = scanner.nextInt();
		int recordCount = 0;
		DataStorage dataStorage = new DataStorage();
		HashMap<Integer, List<ConsultationInformation>> consultationInformationLists = dataStorage
				.consultationInformationLists();
		System.out.println("Patient List");
		for (Map.Entry<Integer, List<ConsultationInformation>> list : consultationInformationLists.entrySet()) {
			List<ConsultationInformation> lists = new ArrayList<ConsultationInformation>(list.getValue());
			for (ConsultationInformation informationList : lists) {
				if (informationList.doctorId == doctorid) {
					System.out.println("\n***************************************\n");
					System.out.println("Patient Id : " + informationList.patientId);
					System.out.println("Doctor recommendation : " + informationList.doctorRecommendation);
					recordCount++;
				}
			}
			System.out.println("\n---------------------------------\n");
			System.out.println("Total Record Found : " + recordCount);
			break;
		}
	}

	void getInPatientList() {
		DataStorage dataStorage = new DataStorage();
		int recordCount = 0;
		HashMap<Integer, List<Patient>> hashMap = dataStorage.patientLists();
		System.out.println("Patient List");
		for (Map.Entry<Integer, List<Patient>> list : hashMap.entrySet()) {
			List<Patient> inPatients = new ArrayList<Patient>(list.getValue());
			for (Patient inPatientLists : inPatients) {
				if (inPatientLists.patientType.equalsIgnoreCase("IN PATIENT")) {
					System.out.println("\n************************\n");
					System.out.println("Patient Name : " + inPatientLists.patientName);
					System.out.println("Patient Type : " + inPatientLists.patientType);
					recordCount++;
				}
			}
			System.out.println("\n--------------------------------\n");
			System.out.println("Total Record found : " + recordCount);
			break;
		}

	}

	void getOutPatientLists() {
		DataStorage dataStorage = new DataStorage();
		int recordCount = 0;
		HashMap<Integer, List<Patient>> hashMap = dataStorage.patientLists();
		System.out.println("Patient List");
		for (Map.Entry<Integer, List<Patient>> list : hashMap.entrySet()) {
			List<Patient> inPatients = new ArrayList<Patient>(list.getValue());
			for (Patient inPatientLists : inPatients) {
				if (inPatientLists.patientType.equalsIgnoreCase("OUT PATIENT")) {
					System.out.println("\n************************\n");
					System.out.println("Patient Name : " + inPatientLists.patientName);
					System.out.println("Patient type: " + inPatientLists.patientType);
					recordCount++;
				}
			}
			System.out.println("\n--------------------------------\n");
			System.out.println("Total Record found : " + recordCount);
			break;
		}

	}

	void getTodayVisitedPatientList() {
		DataStorage dataStorage = new DataStorage();
		int recordCount = 0;
		List<Appointment> list = dataStorage.appointmentsLists();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String todayDate = simpleDateFormat.format(new Date());
		System.out.println("Patient Lists");
		for (Appointment appointmentlists : list) {
			String appointMentDate = simpleDateFormat.format(appointmentlists.dateOfVisit);
			if (todayDate.equalsIgnoreCase(appointMentDate)) {
				System.out.println("\n*******************************\n");
				System.out.println("Patient Id: " + appointmentlists.patientId);
				System.out.println("Date of Visit : " + simpleDateFormat.format(appointmentlists.dateOfVisit));
				System.out.println("Doctor to visit : " + appointmentlists.doctorToVisit);
				System.out.println("Purpose of visit : " + appointmentlists.purposeOfVisit);
				recordCount++;
			}
		}
		System.out.println("\n---------------------------------\n");
		System.out.println("Total record found : " + recordCount);
	}

	

}
