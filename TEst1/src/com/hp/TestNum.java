package com.hp;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestNum {

	List<Integer> sud = getAllSud();
	static Map<Integer, ArrayList<Integer>> mapFrnd = getFriends();

	static String abc = new String("a c");
	
	static Map<Integer, ArrayList<Integer>> getFriends() {
		
		mapFrnd = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(2);
		arrayList1.add(3);
		mapFrnd.put(1, arrayList1);
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(1);
		arrayList2.add(4);
		mapFrnd.put(2, arrayList2);
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
		arrayList3.add(1);
		arrayList3.add(4);
		mapFrnd.put(3, arrayList3);
		ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
		arrayList4.add(2);
		arrayList4.add(3);
		arrayList4.add(4);
		mapFrnd.put(4, arrayList4);
		ArrayList<Integer> arrayList5 = new ArrayList<Integer>();
		arrayList5.add(4);
		mapFrnd.put(5, arrayList5);

		return mapFrnd;
	}

	List<Integer> getAllSud() {
		sud = new ArrayList<Integer>();
		sud.add(1);
		sud.add(2);
		sud.add(3);
		sud.add(4);
		sud.add(5);
		return sud;
	}

	public static void main(String[] args) {

		String[]  test = abc.split(" ");
		for (String tesq : test){
			System.out.println(tesq);
		}
		
		if (args[0] != null) {

			if (mapFrnd.get(Integer.parseInt(args[0])).isEmpty()) {
				System.out.println("yes");
			} else {
				ArrayList<Integer> friends  = mapFrnd.get(Integer.parseInt(args[0]));
				if (args[1] != null) {
					if(friends.contains(Integer.parseInt(args[1]))){
						System.out.println("no");
					}else {
						System.out.println("yes");
					}
				}else  {
				System.out.println("no");}
			}
		}

	}

}
