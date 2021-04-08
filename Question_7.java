package assignments.assignments_3;

public class Question_7 {

	public static void main(String[] args) {
		int priceInCents = 95;
		int change = 100 - priceInCents;
		int quarters = change / 25;
		int dimes = (change % 25) / 10;
		int nickle = ((change % 25) % 10)/5;
		System.out.println("Price in cents: " + priceInCents);
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickle + " nickles");
	}

}
