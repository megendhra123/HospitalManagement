/**
 * 
 */
package hospital_management;

public class Bed {
	int inPatientId;
	String bedType;
	String roomName;

	public Bed(int inPatientId, String bedType, String roomName) {
		this.inPatientId = inPatientId;
		this.bedType = bedType;
		this.roomName = roomName;
	}

}
