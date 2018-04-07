import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample {
	private static Scanner option;

	public static void main(String[] args) {

 
		boolean exit = false;
 
		String pName;
		int pPriority;
		int pId;

		Comparator<?> queueComparator = new PatientPriorityComparator();
		
	
		PriorityQueue<Patient> priorityQueue = new PriorityQueue(10,queueComparator);
 
		do {

			System.out.println("1.Input");
			System.out.println("2.Display list");
			System.out.println("3.Exit");
			
			option = new Scanner(System.in);
			System.out.println("enter your choice");
			int num = option.nextInt();
			
			switch (num) {
			case 1:
				
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Patient ID:");
				pId = (input.nextInt());
				input.nextLine();
				System.out.println("Enter Patient name:");
				pName = input.nextLine();
				System.out.println("Enter priority:");
				pPriority = (input.nextInt());
 
				Patient obj = new Patient(pId,pName, pPriority);
				priorityQueue.add(obj);
				break;
 
			case 2:
				
				
				while (priorityQueue.size() != 0) {
					
					System.out.println("Patient\t"
							+ ((Patient) priorityQueue.poll()).getName());
				}
				break;
 
			case 3:
				exit = true;
				break;
			}
		} while (!exit);
 
	}

}