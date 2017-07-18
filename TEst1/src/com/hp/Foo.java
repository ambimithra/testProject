package com.hp;

import java.util.ArrayList;


public  class Foo {

	ArrayList arrayList = new ArrayList();
	
	public static void main(String args[]) {
		
		Foo a = new Foo();
			a.arrayList.add(new TestNum());
			a.arrayList.add(new Test());
		
			System.out.println(a.arrayList.size());
			
			System.out.println(a.arrayList.get(0));
			System.out.println(a.arrayList.get(1));
	}

	

   
}
