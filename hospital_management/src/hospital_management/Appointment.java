/**
 * 
 */
package hospital_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
	int patientId;
	Date dateOfVisit;
	String purposeOfVisit;
	int isFirstVisit;
	float bloodPressure;
	float temperature;
	int doctorToVisit;

	public Appointment(int patientId, String dateOfVisit, String purposeOfVisit, int isFirstVisit, float bloodPressure,
			float temperature, int doctorToVisit) {
		this.patientId = patientId;
		try {
			this.dateOfVisit = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfVisit);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.purposeOfVisit = purposeOfVisit;
		this.isFirstVisit = isFirstVisit;
		this.bloodPressure = bloodPressure;
		this.temperature = temperature;
		this.doctorToVisit = doctorToVisit;
	}

}
