package com.srm.lab1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class LinkOper {
	void findLength(LinkedList<Integer> l) {
		System.out.println("Length of the Linked List : " + l.size());
	}

	void sortLinkedList(LinkedList<Integer> l) {
		System.out.println("List Before Sorting : ");
		Iterator<Integer> iter1 = l.iterator();
		while (iter1.hasNext()) {
			System.out.print(iter1.next() + "\t");
		}
		System.out.println();
		Collections.sort(l);
		System.out.println("List After Sorting : ");
		Iterator<Integer> iter = l.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
	}

	void findMidElement(LinkedList<Integer> list) {
		int length = list.size();

		int round = 0;
		if (length % 2 != 0) {
			round = Math.round(length / 2);
			System.out.println("Length of the Elements : " + length);
			Collections.sort(list);
			System.out.println("Middle Element in the List : " + list.get(round));
		} else {
			int r1 = length / 2;
			int r2 = (length / 2) + 1;
			Collections.sort(list);
			int val1 = list.get(r1);
			int val2 = list.get(r2);
			int fval = (val1 + val2) / 2;
			System.out.println("Middle Element in the List : " + fval);
		}
	}
}

public class LinkOperationsDemo {
	public static void main(String[] args) {
		LinkOper lo = new LinkOper();
		System.out.println("-----------LinkedList Operations-----------");
		System.out.println("1.Length of the Linked List" + "\n2.Sort the Linked List"
				+ "\n3.To find Middle Element in Linked List");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Operation to be Performed :  ");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter the No.of.Elements : ");
				List<Integer> l = new LinkedList<Integer>();
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.println("Enter the Element " + (i + 1));
					l.add(sc.nextInt());
				}
				lo.findLength((LinkedList<Integer>) l);
				break;
			case 2:
				System.out.println("Enter the No.of.Elements to Add : ");
				int no = sc.nextInt();
				List<Integer> list = new LinkedList<Integer>();
				for (int i = 0; i < no; i++) {
					System.out.println("Enter the Element " + (i + 1));
					list.add(sc.nextInt());
				}
				lo.sortLinkedList((LinkedList<Integer>) list);
			case 3:
				System.out.println("Enter the No.of.Elements to Add : ");
				int num = sc.nextInt();
				List<Integer> list1 = new LinkedList<Integer>();
				for (int i = 0; i < num; i++) {
					System.out.println("Enter the Element " + (i + 1));
					list1.add(sc.nextInt());
				}
				lo.findMidElement((LinkedList<Integer>) list1);
			}
		}
	}
}
