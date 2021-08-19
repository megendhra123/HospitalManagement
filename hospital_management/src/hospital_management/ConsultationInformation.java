/**
 * 
 */
package hospital_management;

public class ConsultationInformation {
	int visitId;
	int patientId;
	int doctorId;
	String doctorRecommendation;
	String meditionNeeded;
	String followUpNeeded;

	public ConsultationInformation(int visitId, int patientId, int doctorId, String doctorRecommendation,
			String meditionNeeded, String followUpNeeded) {
		this.visitId = visitId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.doctorRecommendation = doctorRecommendation;
		this.meditionNeeded = meditionNeeded;
		this.followUpNeeded = followUpNeeded;
	}

}
