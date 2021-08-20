/**
 * 
 */
package hospital_management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DataStorage {
	
	HashMap<Integer, List<Hospital>> hospitalList(){
		
		Hospital hospital;
		List<Hospital> listHospitals=new ArrayList<Hospital>();
		HashMap<Integer, List<Hospital>> hospitalLists=new HashMap<Integer, List<Hospital>>();
		
		hospital=new Hospital("CMC", "Vellore");
		listHospitals.add(hospital);
		hospitalLists.put(1001, listHospitals);
		
		hospital=new Hospital("APOLLO", "Chennai");
		listHospitals.add(hospital);
		hospitalLists.put(1002, listHospitals);
		
		return hospitalLists;
	}
	
	HashMap<Integer, List<Medicine>> medicineList(){
		
		Medicine medicine;
		List<Medicine> listMedicine=new ArrayList<Medicine>();
		HashMap<Integer, List<Medicine>> medicineLists=new HashMap<Integer, List<Medicine>>();
		
		medicine=new Medicine( "Lipitor", "20/10/22", 102, "Blood Vessel damage");
		listMedicine.add(medicine);
		medicineLists.put(2001, listMedicine);
		
		medicine=new Medicine("Modafinil", "18/12/22", 203, "Sleepiness");
		listMedicine.add(medicine);
		medicineLists.put(2002, listMedicine);
		
		medicine=new Medicine("Fluoxeline", "01/12/21", 222, "Anxiety");
		listMedicine.add(medicine);
		medicineLists.put(2002, listMedicine);
		
		medicine=new Medicine("Neuropain", "30/07/23", 183, "Sleepiness");
		listMedicine.add(medicine);
		medicineLists.put(2002, listMedicine);
		
		medicine=new Medicine("PainIq", "16/02/21", 453, "Sleepiness");
		listMedicine.add(medicine);
		medicineLists.put(2002, listMedicine);
		
		return medicineLists;
	}

	
	HashMap<Integer, List<Doctor>> doctorLists(){
		
		Doctor doctor;
		List<Doctor> listDoctors=new ArrayList<Doctor>();
		HashMap<Integer, List<Doctor>> doctorLists=new HashMap<Integer, List<Doctor>>();
		
		doctor=new Doctor("Dr. Vanthiyanathan.D", "Cardiologist");
		listDoctors.add(doctor);
		doctorLists.put(30001, listDoctors);
		
		doctor=new Doctor("Dr. Vivek", "Dentist");
		listDoctors.add(doctor);
		doctorLists.put(30002, listDoctors);
		
		doctor=new Doctor("Dr. Goutham.D", "Psychiatrist");
		listDoctors.add(doctor);
		doctorLists.put(30003, listDoctors);
		
		doctor=new Doctor("Dr. Kamala", "Neurologist");
		listDoctors.add(doctor);
		doctorLists.put(30004, listDoctors);

		doctor=new Doctor("Dr Basheer Ahmed", "Allergists");
		listDoctors.add(doctor);
		doctorLists.put(30004, listDoctors);
		
		return doctorLists;
	}
	
	
	HashMap<Integer,List<Patient>> patientLists(){
		
		Patient patient1;
		List<Patient> listPatients=new ArrayList<Patient>();
		HashMap<Integer, List<Patient>> patientLists = new HashMap<Integer, List<Patient>>();
		
		patient1=new Patient( "Patient1", "01/02/2002", 9876543210L, "Vellore", "OUT PATIENT");
		listPatients.add(patient1);
		patientLists.put(100001, listPatients);
		
		patient1=new Patient( "Patient2", "01/02/2002", 9876543211L, "Vellore", "OUT PATIENT");
		listPatients.add(patient1);
		patientLists.put(100002, listPatients);
		
		patient1=new Patient( "Patient3", "01/02/2002", 9876543212L, "Vellore", "IN PATIENT");
		listPatients.add(patient1);
		patientLists.put(100003, listPatients);
		
		return patientLists;
	}
	
	List<Appointment> appointmentsLists(){
		Appointment appointment;
		List<Appointment> listAppointments =new ArrayList<Appointment>();
		
		appointment=new Appointment(100001,"21/08/21", "Patient not sleep for four days", 1, 120f, 36.7f, 30003);
		listAppointments.add(appointment);
		
		appointment=new Appointment(100002,"22/08/21", "Patient have high BP", 2, 220f, 38.7f, 30001);
		listAppointments.add(appointment);
		
		appointment=new Appointment(100001,"26/08/21", "Patient not cure from sleep disorder", 2, 150f, 36.7f, 30003);
		listAppointments.add(appointment);
		
		appointment=new Appointment(100003,"25/08/21", "Pattient have food poison", 1, 120f, 36.7f, 30004);
		listAppointments.add(appointment);
		
		appointment=new Appointment(100001,"28/08/21", "Patient not cure from sleep disorder", 3, 120f, 36.7f, 30003);
		listAppointments.add(appointment);
		return listAppointments;
	}
	
	HashMap<Integer, List<ConsultationInformation>> consultationInformationLists(){
		ConsultationInformation consultationInformation;
		List<ConsultationInformation> listConsultation=new ArrayList<ConsultationInformation>();
		HashMap<Integer, List<ConsultationInformation>> consultationLists=new HashMap<Integer, List<ConsultationInformation>>();
		
		consultationInformation=new ConsultationInformation(100001, 30003 , "to take medicine", "Fluoxeline", "follow up need");
		listConsultation.add(consultationInformation);
		consultationLists.put(100, listConsultation);
		
		consultationInformation=new ConsultationInformation(100002, 30001 , "to take medicine", "Lipitor", "follow up need");
		listConsultation.add(consultationInformation);
		consultationLists.put(101, listConsultation);
		
		consultationInformation=new ConsultationInformation(100003, 30004 , "to take medicine", "painIq", "follow not need");
		listConsultation.add(consultationInformation);
		consultationLists.put(102, listConsultation);
		
		return consultationLists;
	}
	
	HashMap<Integer, List<InPatient>> inPatientList(){
		InPatient inPatient;
		List<InPatient> listInPatients =new ArrayList<InPatient>();
		HashMap<Integer, List<InPatient>> inPatientLists=new HashMap<Integer, List<InPatient>>();
		
		inPatient=new InPatient(100003);
		listInPatients.add(inPatient);
		inPatientLists.put(800021, listInPatients);
		
		inPatient=new InPatient(100007);
		listInPatients.add(inPatient);
		inPatientLists.put(800024, listInPatients);
		
		return inPatientLists;
	}
	
	HashMap<Integer, List<Bed>> bedList(){
		Bed bed;
		List<Bed> listBeds=new ArrayList<Bed>();
		HashMap<Integer, List<Bed>> bedLists=new HashMap<Integer,List<Bed>>();
		
		bed=new Bed(100003, "Semi Fowler Bed", "Genral Ward");
		listBeds.add(bed);
		bedLists.put(501, listBeds);

		bed=new Bed(100007, "Plain Bed", "Genral Ward");
		listBeds.add(bed);
		bedLists.put(501, listBeds);
		
		return bedLists;
	}
	

}
