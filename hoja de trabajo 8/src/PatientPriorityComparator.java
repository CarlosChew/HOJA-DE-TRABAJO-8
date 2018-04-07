import java.util.Comparator;
 
public class PatientPriorityComparator implements Comparator<Object> {
 
	public int compare(Patient patient, Patient priorityPatient) {
 
		
		Patient p1 = (Patient) patient;
		Patient p2 = (Patient) priorityPatient;	
	
		
 
		 if (p1.getPriority() < p2.getPriority()) return 1; if (p1.getPriority() > p2.getPriority())
		        return -1;
		    else { if (p1.getId() <(p2.getId())) return -1; if (p1.getId() > (p2.getId()))
		        return 1;
		    }
		    return 0; 
	
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}	
}