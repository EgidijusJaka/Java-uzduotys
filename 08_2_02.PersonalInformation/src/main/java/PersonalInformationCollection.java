
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

	public static void main(String[] args) {
		// implement here your program that uses the PersonalInformation class

		ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("First name");
			
			String name = scanner.nextLine();
			if (name.equals("")) {
				break;
			}

			System.out.println("Last name");
			String lastname = scanner.nextLine();
			if (name.equals("")) {
				break;
			}

			System.out.println("Identification number");
			String id = scanner.nextLine();
			if (name.equals("")) {
				break;
			}

			PersonalInformation pi = new PersonalInformation(name, lastname, id);
			infoCollection.add(pi);

	
		}
		
		for (PersonalInformation pi : infoCollection) {
			System.out.println(pi.getFirstName() +" "+ pi.getLastName()); 
		}
		
	}
}
