package prob1;

public class GreenMartianTest {
	public static void main(String[] args) {
		testSpeakAndTeleportAndToString();
		testEquals_Success();
		testEquals_Fail();
		testEqualsRedAndGreen_Success();
		testCompareToRedAndGreen_Success();
		
	}
	
	/**
	 * Testing the speak, teleport and toString methods together 
	 *  and verifying that the string displays the outputs
	 *  correctly.
	 */
	public static void testSpeakAndTeleportAndToString() {
		System.out.println("\n-->testSpeakAndTeleportAndToString");
		
		//GreenMartian object
		GreenMartian g = new GreenMartian(2, 9);
		
		//Expected
		String msgETeleport = "Expected: id=2 teleporting to Mars";
		String msgESpeak = "Expected: id=2, Grobldy Grock";
		String msgEToString = "Expected: Green Martian - id=2, vol=9";
		
		//Actual
		String msgATeleport = "Actual: "+g.teleport("Mars");
		String msgASpeak = "Actual: "+g.speak();
		String msgAToString = "Actual: "+g.toString();
		
		//Results
		System.out.println(msgETeleport+"\n"+msgATeleport+"\n");
		System.out.println(msgESpeak+"\n"+msgASpeak+"\n");
		System.out.println(msgEToString+"\n"+msgAToString);
	}
	
	/**
	 * Same as the equals test in the RedMartianTest 
	 * class, however with two green Martians.
	 */
	public static void testEquals_Success() {
		System.out.println("\n-->testEquals_Success");
		
		//GreenMartian objects
		GreenMartian g1 = new GreenMartian(2, 9);
		GreenMartian g2 = new GreenMartian(2, 23);
		
		//Holds the result of the method in a variable
		boolean result = g1.equals(g2);
		
		//Expected and Actual
		String msgExpected = "Expected: These two Martians are the same.";
		String msgActual = "Actual: ";
		if(result==true) {
			msgActual+= "These two Martians are the same.";
		}
		else {
			msgActual+= "These two Martians are not the same.";
		}

		//Results
		System.out.println(msgExpected);
		System.out.println(msgActual);


	}
	
	public static void testEquals_Fail() {
		System.out.println("\n-->testEquals_Fail");
		//GreenMartian objects
		GreenMartian g1 = new GreenMartian(2, 9);
		GreenMartian g2 = new GreenMartian(7, 23);

		//Holds the result of the method in a variable
		boolean result = g1.equals(g2);

		//Expected and Actual
		String msgExpected = "Expected: These two Martians are not the same.";
		String msgActual = "Actual: ";
		if(result==true) {
			msgActual+= "These two Martians are the same.";
		}
		else {
			msgActual+= "These two Martians are not the same.";
		}

		//Results
		System.out.println(msgExpected);
		System.out.println(msgActual);


	}
	
	/**
	 * This verifies that martians will be consider 
	 * equal if they have the same id even if the 
	 * martians are of different types. 
	 */
	public static void testEqualsRedAndGreen_Success() {
		System.out.println("\n-->testEqualsRedAndGreen_Success");
		
		//Martian objects
		RedMartian r = new RedMartian(3, 7, 16);
		GreenMartian g = new GreenMartian(3, 22);
		
		//
		boolean result = r.equals(g);
		
		//Expected and Actual
		String msgExpected = "Expected: The red martian and the green martian have the same id.";
		String msgActual = "Actual: ";
		if(result==true) {
			msgActual+="The red martian and green martian have the same id.";
		}
		else {
			msgActual+="The red martian and green martian do not have the same id.";
		}
		
		//Results
		System.out.println(msgExpected);
		System.out.println(msgActual);
		
	}
	
	/**
	 * Compares a GreenMartian and a RedMartian to verify
	 * that two different Martians can still be compared.
	 */
	public static void testCompareToRedAndGreen_Success() {
		System.out.println("\n-->testCompareToRedAndGreen_Success");
		
		//Martians
		RedMartian r = new RedMartian(3, 7, 16);
		GreenMartian g = new GreenMartian(3, 22);
		
		//Holds result in a variable
		int result = r.compareTo(g);

		//Expected and Actual
		String msgExpected = "Expected: The red martian's id is equal to the green martian's id.";
		String msgActual = "Actual: ";

		if(result<0) {
			msgActual+="The red martian's id is bigger than the green martian's id.";
		}
		if(result==0) {
			msgActual+="The red martian's id is equal to the green martian's id.";
		}
		if(result>0) {
			msgActual+="The red martian's id is smaller than the green martian's id.";
		}

		//Outcome
		System.out.println(msgExpected);
		System.out.println(msgActual);

	}

}
