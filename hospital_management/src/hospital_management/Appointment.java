/**
 * 
 */
package hospital_management;

import java.util.Date;

public class Appointment {
	int patientId;
	Date dateOfVisit;
	String purposeOfVisit;
	int isFirstVisit;
	float bloodPressure;
	float temperature;
	int doctorToVisit;

	public Appointment(int patientId, Date dateOfVisit, String purposeOfVisit, int isFirstVisit, float bloodPressure,
			float temperature, int doctorToVisit) {
		this.patientId = patientId;
		this.dateOfVisit = dateOfVisit;
		this.purposeOfVisit = purposeOfVisit;
		this.isFirstVisit = isFirstVisit;
		this.bloodPressure = bloodPressure;
		this.temperature = temperature;
		this.doctorToVisit = doctorToVisit;
	}

}
