/**
 * 
 */
package hospital_management;

import java.util.Date;

public class Patient {
	String patientName;
	int patientId;
	String patientDob;
	long patientPhoneNumber;
	String patientAddress;
	String patientType;

	public Patient(int patientId, String patientName,String patientDob, long patientPhoneNumber, String patientAddress,
			String patientType) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientDob = patientDob;
		this.patientPhoneNumber = patientPhoneNumber;
		this.patientAddress = patientAddress;
		this.patientType = patientType;
	}

}
