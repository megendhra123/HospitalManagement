/**
 * 
 */
package hospital_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Patient {
	
	String patientName;
	Date patientDob;
	long patientPhoneNumber;
	String patientAddress;
	String patientType;
	

	public Patient( String patientName,String patientDob, long patientPhoneNumber, String patientAddress,
			String patientType) {
		SimpleDateFormat dateformate =new SimpleDateFormat("dd/MM/yyyy");
		
		this.patientName = patientName;
		try {
			this.patientDob=dateformate.parse(patientDob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.patientPhoneNumber = patientPhoneNumber;
		this.patientAddress = patientAddress;
		this.patientType = patientType;
	}

}
