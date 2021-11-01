package prob1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class MartianManager {
	
	//Instance Variables
	protected Map<Integer, Martian> martians = new HashMap<>();
	protected Map<Integer,Teleporter> teleporters = new HashMap<>();
	
	//Constructor
	public MartianManager() {
		
	}
	
//	Methods
	public boolean addMartian(Martian m) {
		boolean martian = martians.containsKey(m.getId());
		if(martian) {
			return false;
		}
		martians.put(m.getId(), m);
		if(m instanceof Teleporter) {
			int id = m.getId();
			teleporters.put(id, (Teleporter) m);
		}
		return true;
	}
	
//	public ArrayList<Martian> battle(ArrayList<Martian> invaders){
//		ArrayList<Martian> killed = new ArrayList<>();
//		for(Martian i: invaders) {
//			int power = getPower(i);
//			for(int j=0; j<martians.size();j++) {
//				Martian m = getMartianAt(j);
//				if(power>getPower(m)){
//					killed.add(m);
//					removeMartian(m.getId());
//					break;
//				}
//			}
//		}
//		return killed;
//	}
//	
//	public boolean contains(int id) {
//		for(Martian m: martians) {
//			if(m.getId()==id) {
//				return true;
//			}
//		}
//		return false;
//	}

//	public Martian getMartianClosestTo(int id) {
//		Collections.sort(martians);
//		int absMatch = 0;
//		for(Martian m: martians) {
//			if(Math.abs(id-m.getId())==absMatch) {
//				return m;
//			}
//			else {
//				absMatch++;
//			}
//		}
//		return null;
//	}
//	
//	public Martian getMartianClosestTo(Martian martian) {
//		return getMartianClosestTo(martian.getId());
//	}
//	
	public Martian getMartian(int id) {
		if(martians.containsKey(id)) {
			return martians.get(id);
		}
		return null;
	}
//	
	public int getNumMartians() {
		return martians.size();
	}
	
	public int getNumTeleporters() {
		return teleporters.size();
	}
//	
//	private int getPower(Martian m) {
//		if(m instanceof RedMartian) {
//			return m.getVolume() + ((RedMartian)m).getTenacity();
//		}
//		return m.getVolume();
//	}
//	
	public ArrayList<Martian> getSortedMartians(String sortType){
		Collection<Martian> sorted = martians.values();
		ArrayList<Martian> ALsorted = new ArrayList<>(sorted);
		String lCase=sortType.toLowerCase();
		if(lCase.equals("volume")) {
			Collections.sort(ALsorted, new MartianVolumeComparator());
		}
		else if(lCase.equals("id")) {
			Collections.sort(ALsorted, new MartianIdComparator());
		}
		else {
			return null;
		}
		return ALsorted;
	}
	
	public Teleporter getTeleporter(int id) {
		if(teleporters.containsKey(id)) {
			return teleporters.get(id);
		}
		return null;
	}
//	
//	public String groupSpeak() {
//		System.out.println("Martians Speaking");
//		System.out.println("------------------------");
//		String speak = "";
//		for(Martian m: martians) {
//			speak += "\n"+m.speak();
//		}
//		return speak;
//	}
//	
//	public String groupTeleport(String dest) {
//		System.out.println("Teleporters");
//		System.out.println("----------------------");
//		String teleport = "";
//		for(Teleporter t: teleporters) {
//			teleport += "\n" + t.teleport(dest);
//		}
//		return teleport;
//	}
	public void increaseTeleporterVolume(int idThreshold) {
		Set<Integer> IDs = martians.keySet();
		for(int id: IDs) {
			Martian m = martians.get(id);
			if(m instanceof Teleporter) {
				if(m.getId()<idThreshold) {
					int newVol = m.getVolume()+1;
					m.setVolume(newVol);
				}
			}
		}
	}
//	
//	public void obliterateTeleporters() {
//		for(int i=0; i<martians.size();i++) {
//			Martian m = getMartianAt(i);
//			if(m instanceof Teleporter) {
//				martians.remove(m);
//			}
//		}
//		teleporters.clear();
//	}
//	
//	public Martian removeMartian(int id) {
//		Martian m = new GreenMartian(id);
//		if(martians.contains(m)){
//			int loc = martians.indexOf(m);
//			m = martians.get(loc);
//			martians.remove(m);
//			if(m instanceof Teleporter) {
//				teleporters.remove((Teleporter)m);
//			}
//			return m;
//		}
//		return null;
//	}
//	
	public String toString() {
		Set<Integer> martianIDs = martians.keySet();
		Set<Integer> teleportersIDs = teleporters.keySet();
		String mPrint="Martian Manager\n---------------------\n\nMartians:";
		for(Integer mKey:martianIDs) {
			mPrint+="\n"+martians.get(mKey);
		}
		mPrint+="\n\nTeleporters:";
		for(Integer tKey:teleportersIDs) {
			mPrint+="\n"+teleporters.get(tKey);
		}
		return mPrint;
	}
//
}
