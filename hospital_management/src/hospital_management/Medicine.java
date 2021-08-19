/**
 * 
 */
package hospital_management;

import java.util.Date;

public class Medicine {
	int medicineId;
	String medicineName;
	Date medicineExpireDate;
	int medicineBatchNumber;
	String purposeOfMedicine;

	public Medicine(int medicineId, String medicineName, Date medicineExpireDate, int medicineBatchNumber,
			String purposeOfMedicine) {
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineExpireDate = medicineExpireDate;
		this.medicineBatchNumber = medicineBatchNumber;
		this.purposeOfMedicine = purposeOfMedicine;

	}

}
