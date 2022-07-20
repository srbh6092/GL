package com.globallogic.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList nonGenericList = new ArrayList();
		nonGenericList.add('@');
		nonGenericList.add("abc");
		nonGenericList.add(false);
		nonGenericList.add(3.68);
		nonGenericList.add(4567);

		nonGenericList.forEach(System.out::println);
		
		nonGenericList.remove(2);
		
		for(Object object: nonGenericList)
			System.out.print(object+" ");
		System.out.println();
		
		nonGenericList.clear();
		System.out.println(nonGenericList);

		ArrayList<Integer> genericList = new ArrayList<>();
		genericList.add(5);
		genericList.add(3);
		genericList.add(10);
		genericList.add(-2);
		genericList.add(4);
		
		System.out.println(genericList);
		Collections.sort(genericList);
		genericList.forEach(item ->System.out.print(item+" "));
		System.out.println();
		
		Collections.sort(genericList,Collections.reverseOrder());
		System.out.println(genericList);
	}
}