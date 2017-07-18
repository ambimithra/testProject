package com.hp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	static HashMap<String, String> allTowns = loadTowns();
	static HashMap<String, String> pathsB = loadPaths();
	static List<String> vistC = loadC();
	static String startPoint = "W";
	static boolean flag = false;
	
	private static HashMap<String, String> loadTowns(){
		allTowns =  new HashMap<String, String>();
		allTowns.put("W","Winterfell");
		allTowns.put("A","Astrapor");
		allTowns.put("B","Bravos");
		allTowns.put("C","CastleBlack");
		return allTowns;
	}
	
	private static HashMap<String, String> loadPaths(){
		pathsB =  new HashMap<String, String>();
		pathsB.put("Winterfell", "Winterfell-Bravos");
		pathsB.put("Bravos", "Bravos-Astrapor");
		pathsB.put("Astrapor", "Astrapor-CastleBlack");
		pathsB.put("CastleBlack", "CastleBlack-Winterfell");	
			
		return pathsB;
	}
	private static List<String> loadC() {
		vistC =  new ArrayList<String>();
		vistC.add("Winterfell");
		vistC.add("Bravos");
		vistC.add("Astrapor");
		vistC.add("CastleBlack");
		return vistC;
	}
	
	public static void main(String args[]){

		
		if (allTowns.containsKey("W")) {
			startSearch(allTowns.get("W"));
		}
//		for (String visit : vistC){
//			
//		
//			startSearch(visit);}
			
		
	}

	private static void startSearch(String visit) {
		
		
		String path  = pathsB.get(visit);
		String[] paths = path.split("-");
		if (visit.equalsIgnoreCase(paths[0])){
			System.out.println(paths[0] +"-"+paths[1]);
			if (paths[1].charAt(0) == startPoint.charAt(0)) {
				System.out.println("Yes");
				flag = true;
			}	else {
			startSearch(paths[1]);
			}
		}
		
	}
	
	
	
}
