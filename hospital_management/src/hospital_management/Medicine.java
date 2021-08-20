/**
 * 
 */
package hospital_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Medicine {
	String medicineName;
	Date medicineExpireDate ;
	int medicineBatchNumber;
	String purposeOfMedicine;

	public Medicine( String medicineName, String medicineExpireDate, int medicineBatchNumber,
			String purposeOfMedicine)  {
		
		this.medicineName = medicineName;
		try {
			this.medicineExpireDate =new SimpleDateFormat("dd/MM/yyyy").parse(medicineExpireDate) ;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.medicineBatchNumber = medicineBatchNumber;
		this.purposeOfMedicine = purposeOfMedicine;

	}

}
