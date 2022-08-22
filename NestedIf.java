package Conditional;

public class NestedIf {

	public static void main(String[] args) {
		String address="Patuli,Kolkata";
		if(address.startsWith("Patuli")) {
			if(address.contains("Garia")) {
				System.out.println("you are living in Garia");
			}
		else if(address.contains("New Garia")) {
			System.out.println("you are living in New Garia");
		}
		else {
			System.out.println(address.split(",")[0]);
		}
		}
		else {
			System.out.println("you are not living in kolkata");
		}


	}

}