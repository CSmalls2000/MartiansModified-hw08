package prob1;

public class RedMartianTest {
	
	public static void main(String[] args) {
		testSpeakAndToString();
		testEquals_Success();
		testEquals_Fail();
		testCompareTo_Negative();
		testCompareTo_Positive();
		testCompareTo_Zero();
		
	}
	
	/**
	 *  Testing the speak and toString methods together 
	 *  and verifying that the string displays the outputs
	 *  correctly.
	 */
	public static void testSpeakAndToString() {
		System.out.println("-->testSpeakAndToString");
		RedMartian r = new RedMartian(0, 2, 4);
		
		String msgExpSpeak = "Expected: id=0, Rubldy Rock";
		String msgExpToString = "Expected: Red Martian - id=0, vol=2, ten=4";
		
		String actualSpeak = "Actual: " + r.speak();
		String actualToString = "Actual: " + r.toString();
		
		System.out.println(msgExpSpeak+"\n"+actualSpeak);
		System.out.println(msgExpToString+"\n"+actualToString);
		
		
	}
	
	/**
	 *  Creating two RedMartian objects
	 *  checking to see if they have the same id.
	 */
	public static void testEquals_Success() {
		System.out.println("\n-->testEquals_Success");
		
		//Martians
		RedMartian r1 = new RedMartian(0, 7, 16);
		RedMartian r2 = new RedMartian(0, 11, 14);
		
		//Method Call
		boolean result = r1.equals(r2);
		
		//Expected Actual
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
		
		//Martians
		RedMartian r1 = new RedMartian(0, 7, 16);
		RedMartian r2 = new RedMartian(12, 11, 14);

		//Method Call
		boolean result = r1.equals(r2);

		//Expected Actual
		String msgExpected = "Expected: These two Martians are not the same.";
		String msgActual = "Actual: ";
		if(result==true) {
			msgActual+= "These two Martians are the same.";
		}
		if(result==false){
			msgActual+= "These two Martians are not the same.";
		}

		//Results
		System.out.println(msgExpected);
		System.out.println(msgActual);
		
	}
	
	/**
	 * Creating two RedMartians and comparing two 
	 * see if one's id is bigger, smaller, or equal 
	 * to the other.
	 */
	public static void testCompareTo_Negative() {
		System.out.println("\n-->testCompareTo_Negative");
		
		RedMartian r1 = new RedMartian(0, 7, 16);
		RedMartian r2 = new RedMartian(12, 11, 14);
		
		//Holds result in a variable
		int result = r1.compareTo(r2);
		
		//Expected and Actual
		String msgExpected = "Expected: Martian r2 is bigger than r1";
		String msgActual = "Actual: ";
		
		if(result<0) {
			msgActual+="Martian r2 is bigger than r1";
		}
		if(result==0) {
			msgActual+="Martian r2 is equal to r1";
		}
		if(result>0) {
			msgActual+="Martian r2 is smaller than r1";
		}
		
		//Outcome
		System.out.println(msgExpected);
		System.out.println(msgActual);
		
	}
	
	public static void testCompareTo_Positive() {
		System.out.println("\n-->testCompareTo_Positive");
		
		RedMartian r1 = new RedMartian(20, 7, 16);
		RedMartian r2 = new RedMartian(12, 11, 14);
		
		//Holds result in a variable
		int result = r1.compareTo(r2);
		
		//Expected and Actual
		String msgExpected = "Expected: Martian r2 is smaller than r1";
		String msgActual = "Actual: ";
		
		if(result<0) {
			msgActual+="Martian r2 is bigger than r1";
		}
		if(result==0) {
			msgActual+="Martian r2 is equal to r1";
		}
		if(result>0) {
			msgActual+="Martian r2 is smaller than r1";
		}
		
		//Outcome
		System.out.println(msgExpected);
		System.out.println(msgActual);
		
	}
	
	public static void testCompareTo_Zero() {
		System.out.println("\n-->testCompareTo_Zero");
		
		RedMartian r1 = new RedMartian(12, 7, 16);
		RedMartian r2 = new RedMartian(12, 11, 14);
		
		//Holds result in a variable
		int result = r1.compareTo(r2);
		
		//Expected and Actual
		String msgExpected = "Expected: Martian r2 is equal to r1";
		String msgActual = "Actual: ";
		
		if(result<0) {
			msgActual+="Martian r2 is bigger than r1";
		}
		if(result==0) {
			msgActual+="Martian r2 is equal to r1";
		}
		if(result>0) {
			msgActual+="Martian r2 is smaller than r1";
		}
		
		//Outcome
		System.out.println(msgExpected);
		System.out.println(msgActual);
		
	}

}
