package prob1;

import java.util.ArrayList;

public class MartianManagerTest {

	public static void main(String[] args) {
		testAddMartian_Red_Success();
		testAddMartian_Green_Success();
		testAddMartian_RedGreen_Failure();
		testAddMartian_GreenRed_Failure();
//		testContains_Success();
//		testContains_Failure();

//		testGetMartianClosestTo_Index_LowerMatch();
//		testGetMartianClosestTo_Martian_LowerMatch();
		testGetMartian_Success();
		testGetMartian_Failure();
		testGetSortedMartians();
		testGetTeleporter_Valid();
		testGetTeleporter_Invalid();
		testIncreaseTeleporterVolume();

//		testGroupSpeak();
//		testGroupTeleport();
//		testObliterateTeleporters_One();
//		testObliterateTeleporters_Many();
//		testRemoveMartianWithId_Success_Red();
//		testRemoveMartianWithId_Success_Green();
//		testRemoveMartianWithId_Failure();
		testToString();
//		testBattle_small();
//		testBattle_larger();

	}
	
	/**
	 * Adds a Red martian which will 
	 * increase the martian arraylist size
	 * but not the teleports arraylist.
	 */
	public static void testAddMartian_Red_Success() {
		System.out.println("-->testAddMartian_Red_Success");
		MartianManager rManage = new MartianManager();
		rManage.addMartian(new RedMartian(1,8,5));
		
		//Expected and Actual
		String msgExpected = "Expected: Size of Martians ArrayList: 1 \nSize of Teleporters ArrayList: 0";
		int mSize=rManage.getNumMartians();
		int tSize=rManage.getNumTeleporters();
		String msgActual = "Actual: Size of Martians ArrayList: "+mSize+"\nSize of Teleporters ArrayList: " + tSize;
		
		//Outcomes
		System.out.println(msgExpected);
		System.out.println("\n"+msgActual);
		
		
	}
	
	/**
	 * Adds a Green martian which will 
	 * increase the martian arraylist 
	 * and the teleports arraylist sizes.
	 */
	public static void testAddMartian_Green_Success() {
		System.out.println("\n-->testAddMartian_Green_Success");
		MartianManager rManage = new MartianManager();
		rManage.addMartian(new GreenMartian(1,8));
		
		//Expected and Actual
		String msgExpected = "Expected: Size of Martians ArrayList: 1 \nSize of Teleporters ArrayList: 1";
		int mSize=rManage.getNumMartians();
		int tSize=rManage.getNumTeleporters();
		String msgActual = "Actual: Size of Martians ArrayList: "+mSize+"\nSize of Teleporters ArrayList: " + tSize;
		
		//Outcomes
		System.out.println(msgExpected);
		System.out.println("\n"+msgActual);
		
	}
	
	/**
	 * Will verify that even a different martian can 
	 * not be added to if it has the same id as a martian 
	 * that's already in the arraylist.  
	 */
	public static void testAddMartian_RedGreen_Failure() {
		System.out.println("\n-->testAddMartian_RedGreen_Failure");
		MartianManager rManage = new MartianManager();
		boolean redMartian = rManage.addMartian(new RedMartian(1,8,5));
		boolean greenMartian = rManage.addMartian(new GreenMartian(1,8));
		
		//Expected and Actual
		String msgExpected = "Expected: The Red Martian was added. The Green Martian was not added because "
				+ "\nthere's already a Martian with that id in the manager.";
		String msgActual = "\nActual: ";
		
		if(redMartian==true) {
			msgActual+="The Red Martian was added.";
		}
		else {
			msgActual+="The Red Martian was not added because \nthere's already a Martian with that id in the manager.";
		}
		if(greenMartian==true) {
			msgActual+= " The Green Martian was added.";
		}
		else {
			msgActual+=" The Green Martian was not added because \nthere's already a Martian with that id in the manager.";
		}
		
		//Outcomes
		System.out.println(msgExpected);
		System.out.println(msgActual);


		
	}
	
	public static void testAddMartian_GreenRed_Failure() {
		System.out.println("\n-->testAddMartian_GreenRed_Failure");
		MartianManager rManage = new MartianManager();
		boolean greenMartian = rManage.addMartian(new GreenMartian(1,8));
		boolean redMartian = rManage.addMartian(new RedMartian(1,8, 5));
		
		//Expected and Actual
		String msgExpected = "Expected: The Green Martian was added. The Red Martian was not added because "
				+ "\nthere's already a Martian with that id in the manager.";
		String msgActual = "\nActual: ";
		
		if(greenMartian==true) {
			msgActual+="The Green Martian was added.";
		}
		else {
			msgActual+="The Green Martian was not added because \nthere's already a Martian with that id in the manager.";
		}
		if(redMartian==true) {
			msgActual+= " The Red Martian was added.";
		}
		else {
			msgActual+=" The Red Martian was not added because \nthere's already a Martian with that id in the manager.";
		}
		
		//Outcomes
		System.out.println(msgExpected);
		System.out.println(msgActual);
		
	}
	
	/**
	 * These two will test the contains method to verify 
	 * that it can search through arraylist to see 
	 * if there's a martian with the matching id.  
	 */
//	public static void testContains_Success() {
//		System.out.println("\n-->testContains_Success");
//		MartianManager r = new MartianManager();
//		r.addMartian(new GreenMartian(0, 7));
//		r.addMartian(new RedMartian(5, 3, 8));
//		r.addMartian(new RedMartian(3, 1));
//		
//		boolean mExists = r.contains(5);
//		
//		String msgExpected = "Expected: A Martian with the id 5 exists in the ArrayList.";
//		String msgActual = "Actual: ";
//		if(mExists==true) {
//			msgActual+="A Martian with the id 5 exists in the ArrayList.";
//		}
//		else {
//			msgActual+="A Martian with the id 5 does not exists in the ArrayList.";
//		}
//		
//		System.out.println(msgExpected);
//		System.out.println(msgActual);
//		
//		
//	}
//	
//	public static void testContains_Failure() {
//		System.out.println("\n-->testContains_Failure");
//		MartianManager r = new MartianManager();
//		r.addMartian(new GreenMartian(0, 7));
//		r.addMartian(new RedMartian(5, 3, 8));
//		r.addMartian(new RedMartian(3, 1));
//		
//		boolean mExists = r.contains(10);
//		
//		String msgExpected = "Expected: A Martian with the id 10 does not exists in the ArrayList.";
//		String msgActual = "Actual: ";
//		if(mExists==true) {
//			msgActual+="A Martian with the id 10 exists in the ArrayList.";
//		}
//		else {
//			msgActual+="A Martian with the id 10 does not exists in the ArrayList.";
//		}
//		
//		System.out.println(msgExpected);
//		System.out.println(msgActual);
//		
//	}
//	
	/**
	 * (1) Gets Martian from an index that is zero and between one minus size.
	 * (2)Tries to get a martian if a negative index and should fail.
	 * (3) Like 2, however tries to get a martian from an index greater than the size. 
	 */

	/**
	 * 
	 */
//	public static void testGetMartianClosestTo_Index_LowerMatch() {
//		System.out.println("\n-->testGetMartianClosestTo_Index_LowerMatch");
//		MartianManager r = createManagerWith2RsAnd2Gs();
//		
//		//
//		Martian m1 = r.getMartianClosestTo(4);
//		
//		String msgExpected = "Expected: The Martian closest to id 4 is the Martian with id 3.";
//		String msgActual = "Actual: ";
//		
//		if(m1==null) {
//			msgActual += "Martian cannot be found.";
//		}
//		else {
//			msgActual+= "The Martian closest to id 4 is the Martian with id " + m1.getId() + ".";
//		}
//		
//		System.out.println(msgExpected);
//		System.out.println(msgActual);
//	}
	
	/**
	 * 
	 */
//	public static void testGetMartianClosestTo_Martian_LowerMatch() {
//		System.out.println("\n-->testGetMartianClosestTo_Martian_LowerMatch");
//		MartianManager r = createManagerWith2RsAnd2Gs();
//		
//		
//		//
//		Martian m1 = new RedMartian(6, 3);
//		Martian find = r.getMartianClosestTo(m1);
//		
//		String msgExpected = "Expected: The Martian closest to id 6 is the Martian with id 8.";
//		String msgActual = "Actual: ";
//		
//		if(find==null) {
//			msgActual += "Martian cannot be found.";
//		}
//		else {
//			msgActual+= "The Martian closest to id 6 is the Martian with id " + find.getId() + ".";
//		}
//		
//		System.out.println(msgExpected);
//		System.out.println(msgActual);
//		
//	}
	
	/**
	 * 
	 */
	public static void testGetMartian_Success() {
		System.out.println("\n-->testgetMartian_Success");
		MartianManager r = new MartianManager();
		r.addMartian(new GreenMartian(2,7));
		r.addMartian(new RedMartian(9,4, 5));
		r.addMartian(new GreenMartian(10, 3));
		r.addMartian(new RedMartian(5, 6));
		
		//
		int id = 5;
		Martian m = r.getMartian(id);
		
		String msgExpected = "Expected: The Martian with id "+id+" was found. "
				+ "The Martian with the matching id is " + m.toString();
		String msgActual = "Actual: ";
		if(m==null) {
			msgActual+= "The Martian with the id "+id+" was not found.";
		}
		else {
			msgActual+="The Martian with the id "+id+" was found. The Martian with the matching id is "+ m.toString();
		}
		System.out.println(msgExpected);
		System.out.println(msgActual);
		
	}
	
	public static void testGetMartian_Failure() {
		System.out.println("\n-->testgetMartian_Failure");
		MartianManager r = new MartianManager();
		r.addMartian(new GreenMartian(2,7));
		r.addMartian(new RedMartian(9,4, 5));
		r.addMartian(new GreenMartian(10, 3));
		r.addMartian(new RedMartian(5, 6));
		
		//
		int id = 7;
		Martian m = r.getMartian(id);
		
		String msgExpected = "Expected: The Martian with id "+id+" was not found";
		String msgActual = "Actual: ";
		if(m==null) {
			msgActual+= "The Martian with the id "+id+" was not found.";
		}
		else {
			msgActual+="The Martian with the id "+id+" was found. The Martian with the matching id is "+ m.toString();
		}
		System.out.println(msgExpected);
		System.out.println(msgActual);
		
	}
	
	/**
	 * 
	 */
	public static void testGetSortedMartians() {
		System.out.println("\n-->testGetSortedMartians");
		MartianManager r = forSortedTest();
		
		//Sorts martians based on volume 
		ArrayList<Martian> Vsorted = r.getSortedMartians("VOLUME"); //Valid
		ArrayList<Martian> Vsorted2 = r.getSortedMartians("V"); //Invalid
		System.out.println("getSortedMartians(\"VOLUME\")\n----------------------");
		if(Vsorted==null) {
			System.out.println("ArrayList(Vsorted): The parameter for getting the sorted ArrayList may be invalid");
		}
		else {
			System.out.println("ArrayList(Vsorted): "+Vsorted);
		}

		if(Vsorted2==null) {
			System.out.println("ArrayList(Vsorted2): The parameter for getting the sorted ArrayList may be invalid");
		}
		else {
			System.out.println("ArrayList(Vsorted2): "+Vsorted2);
		}
		
		System.out.println();
		System.out.println("getSortedMartians(\"ID\")\n----------------------");
		//Sorts martians based on id
		ArrayList<Martian> Isorted = r.getSortedMartians("ID"); //Valid
		ArrayList<Martian> Isorted2 = r.getSortedMartians("I"); //Invalid
		if(Isorted==null) {
			System.out.println("ArrayList(Isorted): The parameter for getting the sorted ArrayList may be invalid");
		}
		else {
			System.out.println("ArrayList(Isorted): "+Isorted);
		}
		if(Isorted2==null) {
			System.out.println("ArrayList(Isorted2): The parameter for getting the sorted ArrayList may be invalid");
		}
		else {
			for(Martian m: Isorted2) {
				
			}
		}
	}
	
	/**
	 * Like the getMartianAt test, but with the teleporters arraylist.
	 */
	public static void testGetTeleporter_Valid() {
		System.out.println("\n-->testGetTeleporter_Valid");
		MartianManager r = sixMartians4Greens();
		
		int id = 5;
		Teleporter t = r.getTeleporter(id);
		
		 String msgExpected = "The expected result should be the Teleporter with id 5.";
		 String msgActual = "";
		 if(t==null) {
			 msgActual += "Teleporter can not be found because there is no teleporter with id "+id;
		 }
		 else {
			 msgActual+= "The Teleporter at id "+id+" is "+t.toString();
		 }
		 
		 System.out.println(msgExpected);
		 System.out.println(msgActual);
		
	}
	
	public static void testGetTeleporter_Invalid() {
		System.out.println("\n-->testGetTeleporter_Invalid");
		MartianManager r = sixMartians4Greens();
		int id = 2;
		Teleporter t = r.getTeleporter(id);
		
		 String msgExpected = "The expected result should a message saying that the teleporter could not be found because there is no teleporter with that id.";
		 String msgActual = "";
		 if(t==null) {
			 msgActual += "Teleporter can not be found because there is no teleporter with id " + id;
		 }
		 if(t instanceof Teleporter) {
			 msgActual+= "The Teleporter with id "+id+" is "+t.toString();
		 }
		 
		 System.out.println(msgExpected);
		 System.out.println(msgActual);
		
	}
	
	public static void testIncreaseTeleporterVolume() {
		System.out.println("\n-->testIncreaseTeleporterVolume()");
		MartianManager r = sixMartians4Greens();
		
		ArrayList<Martian> original = r.getSortedMartians("Volume");
		System.out.println("Martians before IncreaseTV():");
		for(Martian m: original) {
			System.out.println(m);
		}
		int id = 6;
		r.increaseTeleporterVolume(id);
		System.out.println("All of the teleporters with an id below "+id+" should their volume increased by one.");
		ArrayList<Martian> updated = r.getSortedMartians("Volume");
		for(Martian m1: updated) {
			System.out.println(m1);
		}
		
	}
	
	/**
	 * Loops over the martian arraylist 
	 * and gets all of the martians to speak.
	 */
//	public static void testGroupSpeak() {
//		System.out.println("\n-->testGroupSpeak");
//		 MartianManager r = new MartianManager();
//		 
//		 r.addMartian(new RedMartian(4, 7));
//		 r.addMartian(new GreenMartian(9, 5));
//		 r.addMartian(new RedMartian(5, 11, 17));
//		 
//		 //Expected
//		 String msgExpected = "Expected:";
//		 for(Martian m: r.martians) {
//			 msgExpected += "\n" + m.speak();
//		 }
//		 
//		 //Actual
//		 String msgActual = "Actual:\n" + r.groupSpeak();
//		
//		 //Outcomes
//		 System.out.println(msgExpected);
//		 System.out.println(msgActual);
//	}
	
	/**
	 * Loops over the teleporters arraylist and 
	 * teleports the martians to the destination.
	 */
//	public static void testGroupTeleport() {
//		System.out.println("\n-->testGroupTeleport");
//		MartianManager r = new MartianManager();
//		 
//		 r.addMartian(new GreenMartian(4, 7));
//		 r.addMartian(new GreenMartian(9, 5));
//		 r.addMartian(new RedMartian(5, 11, 17));
//		 r.addMartian(new GreenMartian(8, 3));
//		 
//		 //Expected
//		 String msgExpected = "Expected:";
//		 for(Teleporter t: r.teleporters) {
//			 msgExpected += "\n" + t.teleport("Mars");
//		 }
//		 
//		 //Actual
//		 String msgActual = "Actual:\n" + r.groupTeleport("Mars");
//		
//		 //Outcomes
//		 System.out.println(msgExpected);
//		 System.out.println(msgActual);
//		
//	}
	
	/**
	 * Test the obliterate method so no Green 
	 * martians will exist in the martian arraylist and 
	 * teleporter arraylist size will be zero.
	 */
//	public static void testObliterateTeleporters_One() {
//		System.out.println("\n-->testObliterateTeleporters_One");
//		MartianManager r = managerWith3Martians1Green();
//		
//		System.out.println("Martian Manager before ObliteratingTeleporters: "+r.getNumMartians());
//		for(int i=0;i<r.martians.size();i++) {
//			System.out.println((i+1)+". "+r.getMartianAt(i));
//		}
//		System.out.println("Number of Teleporter(s) before obliteration: "+r.getNumTeleporters());
//		
//		//Call to Method
//		r.obliterateTeleporters();
//		
//		System.out.println("\nMartian Manager after ObliteringTeleporters: "+r.getNumMartians());
//		for(int j=0; j<r.martians.size();j++) {
//			System.out.println((j+1)+". "+ r.getMartianAt(j));
//		}
//		System.out.println("Number of Teleporter(s) after obliteration: "+r.getNumTeleporters());
//		
//	}
	
//	public static void testObliterateTeleporters_Many() {
//		System.out.println("\n-->testObliterateTeleporters_Many");
//		MartianManager r = managerWith6Martians3Green();
//		
//		System.out.println("Martian Manager before ObliteratingTeleporters: "+r.getNumMartians());
//		for(int i=0;i<r.martians.size();i++) {
//			System.out.println((i+1)+". "+r.getMartianAt(i));
//		}
//		System.out.println("Number of Teleporter(s) before obliteration: "+r.getNumTeleporters());
//		
//		//Call to Method
//		r.obliterateTeleporters();
//		
//		System.out.println("\nMartian Manager after ObliteringTeleporters: "+r.getNumMartians());
//		for(int j=0; j<r.martians.size();j++) {
//			System.out.println((j+1)+". "+ r.getMartianAt(j));
//		}
//		System.out.println("Number of Teleporter(s) after obliteration: "+r.getNumTeleporters());
//		
//	}
	
	/**
	 * Each of these loops over the martians ArrayList to see if a martian has the matching id 
	 * and removes it from the martian if it is found.
	 */
//	public static void testRemoveMartianWithId_Success_Red() {
//		System.out.println("\n-->testRemoveMartianWithId_Success_Red");
//		MartianManager r = createManagerWith2RsAnd2Gs();
//		
//		System.out.println("Martians before removeMartian(): ");
//		for(int i=0; i<r.martians.size();i++) {
//			System.out.println((i+1)+". "+r.getMartianAt(i));
//		}
//		//Stores the Martian that will be removed
//		int id = 8;
//		Martian mRemoved = r.removeMartian(id);
//		
//		System.out.println("\nMartians after removeMartian(8): ");
//		for(int i=0; i<r.martians.size();i++) {
//			System.out.println((i+1)+". "+r.getMartianAt(i));
//		}
//		if(mRemoved==null) {
//			System.out.println("Martian with id "+id+ "does not exist in the Manager.");
//		}
//		else {
//			System.out.println("Martian removed: "+mRemoved);
//		}
//		
//	}
	
//	public static void testRemoveMartianWithId_Success_Green() {
//		System.out.println("\n-->testRemoveMartianWithId_Success_Green");
//		MartianManager r = createManagerWith2RsAnd2Gs();
//		
//		System.out.println("Martians before removeMartian(): ");
//		for(int i=0; i<r.martians.size();i++) {
//			System.out.println((i+1)+". "+r.getMartianAt(i));
//		}
//		//Stores the Martian that will be removed
//		int id = 13;
//		Martian mRemoved = r.removeMartian(id);
//		
//		System.out.println("\nMartians after removeMartian(13): ");
//		for(int i=0; i<r.martians.size();i++) {
//			System.out.println((i+1)+". "+r.getMartianAt(i));
//		}
//		if(mRemoved==null) {
//			System.out.println("Martian with id "+id+ " does not exist in the Manager.");
//		}
//		else {
//			System.out.println("Martian removed: "+mRemoved);
//		}
//		
//
//	}

//	public static void testRemoveMartianWithId_Failure() {
//		System.out.println("\n-->testRemoveMartianWithId_Failure");
//		MartianManager r = createManagerWith2RsAnd2Gs();
//		
//		System.out.println("Martians before removeMartian(): ");
//		for(int i=0; i<r.martians.size();i++) {
//			System.out.println((i+1)+". "+r.getMartianAt(i));
//		}
//		//Stores the Martian that will be removed
//		int id = 20;
//		Martian mRemoved = r.removeMartian(id);
//		
//		System.out.println("\nMartians after removeMartian(20): ");
//		for(int i=0; i<r.martians.size();i++) {
//			System.out.println((i+1)+". "+r.getMartianAt(i));
//		}
//		if(mRemoved==null) {
//			System.out.println("Martian with id "+id+ " does not exist in the Manager.");
//		}
//		else {
//			System.out.println("Martian removed: "+mRemoved);
//		}
//		
//
//	}
	
	/**
	 * Loops over the martians arraylist and prints all the martians.
	 */
	public static void testToString() {
		System.out.println("\n-->testToString");
		MartianManager r = new MartianManager();
		Martian m1 = new RedMartian(1, 7, 4);
		Martian m2 = new GreenMartian(3, 10);
		Martian m3 = new RedMartian(8, 5, 2);
		Martian m4 = new GreenMartian(13, 5);
		r.martians.put(m4.getId(), m4);
		r.teleporters.put(m4.getId(), (Teleporter) m4);
		r.martians.put(m3.getId(), m3);
		r.martians.put(m2.getId(), m2);
		r.teleporters.put(m2.getId(), (Teleporter) m2);
		r.martians.put(m1.getId(), m1);
		
		
		//Expected and Actual
		String msgExpected = "Expected: The output should be a list of 4 Martians and 2 Teleporters.";
		String msgActual = "Actual: \n" + r.toString();
		
		//Outcomes
		System.out.println(msgExpected);
		System.out.println(msgActual);
	}
	
	/**
	 * Test the battle method with a small list of invaders, and 
	 * with return a list of the Martians killed in the battle.
	 */
//	public static void testBattle_small() {
//		System.out.println("\n-->testBattle_small");
//		MartianManager r = createManagerWith2RsAnd2Gs();
//		
//		System.out.println("Martians before the battle:");
//		System.out.println(r.toString());
//		
//		//Call Method
//		ArrayList<Martian> causality = r.battle(invaders_Small());
//		
//		//Expected and Actual
//		String msgExpected = "Expected: At least one Martian should have been killed during the invasion.";
//		String msgActual = "Actual: Number of Martians killed during battle: "+causality.size();
//		
//		//Results
//		System.out.println(msgExpected);
//		System.out.println(msgActual);
//		
//		System.out.println("\nMartians who survived the Battle:");
//		System.out.println(r.toString());
//		
//		System.out.println("\nMartian(s) killed during Battle:");
//		for(int i=0;i<causality.size();i++) {
//			System.out.println((i+1)+". "+causality.get(i));
//		}
//		
//		
//		
//	}
	
//	public static void testBattle_larger() {
//		System.out.print("\n-->testBattle_larger");
//		MartianManager r = fiveMartians();
//		
//		System.out.println("Martians before the battle:");
//		System.out.println(r.toString());
//		
//		//Call Method
//		ArrayList<Martian> causality = r.battle(invaders_Larger());
//		
//		//Expected and Actual
//		String msgExpected = "Expected: one or more Martian should have been killed during the invasion.";
//		String msgActual = "Actual: Number of Martians killed during battle: "+causality.size();
//		
//		//Results
//		System.out.println(msgExpected);
//		System.out.println(msgActual);
//		
//		System.out.println("\nMartians who survived the Battle:");
//		System.out.println(r.toString());
//		
//		System.out.println("\nMartian(s) killed during Battle:");
//		for(int i=0;i<causality.size();i++) {
//			System.out.println((i+1)+". "+causality.get(i));
//		}
//		
//	}
	//--------------
	//Helper Methods
	//----------------------
	
	private static MartianManager createManagerWith2RsAnd2Gs() {
		MartianManager manage = new MartianManager();
		Martian m1 = new RedMartian(1, 7, 4); //power = 11
		Martian m2 = new GreenMartian(3, 10); //power = 10
		Martian m3 = new RedMartian(8, 5, 2); //power = 7
		Martian m4 = new GreenMartian(13, 5); //power = 5
		manage.addMartian(m1);
		manage.addMartian(m2);
		manage.addMartian(m3);
		manage.addMartian(m4);
		return manage;
	}
	
	private static MartianManager fiveMartians() {
		MartianManager manage = createManagerWith2RsAnd2Gs();
		Martian m1 = new RedMartian(9, 2, 11); //power = 13
		manage.addMartian(m1);
		return manage;
	}
	
	private static MartianManager forSortedTest() {
		MartianManager manage = new MartianManager();
		Martian m1 = new GreenMartian(4, 3);
		manage.addMartian(m1);
		Martian m2 = new RedMartian(8,5);
		manage.addMartian(m2);
		Martian m3 = new GreenMartian(1,6);
		manage.addMartian(m3);
		Martian m4 = new RedMartian(2, 7, 11);
		manage.addMartian(m4);
		return manage;
	}
	
	private static MartianManager sixMartians4Greens() {
		MartianManager manage = new MartianManager();
		Martian m1 = new GreenMartian(3,7);
		manage.addMartian(m1);
		
		Martian m2 = new RedMartian(4, 3, 9);
		manage.addMartian(m2);
		
		Martian m3 = new GreenMartian(5, 2);
		manage.addMartian(m3);
		
		Martian m4 = new GreenMartian(14, 5);
		manage.addMartian(m4);
		
		Martian m5 = new RedMartian(11, 6, 3);
		manage.addMartian(m5);
		
		Martian m6 = new GreenMartian(12, 7);
		manage.addMartian(m6);
		return manage;
	}
	
	private static MartianManager managerWith3Martians1Green() {
		MartianManager manage = new MartianManager();
		Martian m1 = new RedMartian(1, 3, 4);
		manage.addMartian(m1);
		
		Martian m2 = new GreenMartian(2, 5);
		manage.addMartian(m2);
		
		Martian m3 = new RedMartian(3, 7, 2);
		manage.addMartian(m3);
		return manage;
	}
	
	private static MartianManager managerWith6Martians3Green() {
		MartianManager manager = managerWith3Martians1Green();
		Martian m1 = new GreenMartian(4, 3);
		manager.addMartian(m1);
		
		Martian m2 = new RedMartian(5, 8, 1);
		manager.addMartian(m2);
		
		Martian m3 = new GreenMartian(6, 7);
		manager.addMartian(m3);
		
		return manager;
	}
	
	private static ArrayList<Martian> invaders_Small(){
		ArrayList<Martian> invade = new ArrayList<>();
		Martian m1 = new GreenMartian(1, 4); //power = 4
		invade.add(m1);
		Martian m2 = new RedMartian(3, 5); //power = 6
		invade.add(m2);
		return invade;
	}
	
	private static ArrayList<Martian> invaders_Larger(){
		ArrayList<Martian> invade = new ArrayList<>(invaders_Small());
		
		Martian m3 = new GreenMartian(5, 8);
		invade.add(m3);
		return invade;
	}

	
}
