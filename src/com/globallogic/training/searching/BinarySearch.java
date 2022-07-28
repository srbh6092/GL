package com.globallogic.training.searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {1,3,5,8,10,13,24,36,46,48,57};
		Arrays.sort(a);
		int element = 10;
		int positionIter = serachBinIter(element,a);
		int positionRec = serachBinRec(element,0,a.length-1,a);
		System.out.println("\n--By sequential search--");
		if(positionIter==-1)
			System.out.println(element+" is not present!");
		else
			System.out.println(element+" is present at position: "+positionIter);
		System.out.println("\n--By sequential search--");
		if(positionRec==-1)
			System.out.println(element+" is not present!");
		else
			System.out.println(element+" is present at position: "+positionRec);
	}

	private static int serachBinIter(int element, int[] a) {
		int left=0;
		int right=a.length-1;
		while(left<=right) {
			int mid = left + (right-left)/2;
			if(a[mid]==element)
				return mid+1;
			else if(a[mid]<element)
				left=mid+1;
			else right=mid-1;
		}
		return -1;
	}

	private static int serachBinRec(int element,int left, int right, int[] a) {
		if(left>right)
			return -1;
		int mid =  left + (right-left)/2;
		if(a[mid] == element)
			return mid+1;
		return (a[mid]<element)?serachBinRec(element,mid+1, right,a):serachBinRec(element,left, mid-1,a);
	}
}
