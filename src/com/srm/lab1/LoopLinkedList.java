package com.srm.lab1;

public class LoopLinkedList {
	Node head;

	static class Node {
		int value;
		Node next;

		Node(int d) {
			value = d;
			next = null;
		}
	}

	public boolean checkLoop() {
		Node first = head;
		Node second = head;

		while (first != null && first.next != null) {
			first = first.next.next;
			second = second.next;
			if (first == second) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		LoopLinkedList linkedList = new LoopLinkedList();
		linkedList.head = new Node(56);
		Node second = new Node(72);
		Node third = new Node(88);
		Node fourth = new Node(90);
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = second;
		System.out.print("LinkedList: ");
		int i = 1;
		while (i <= 4) {
			System.out.print(linkedList.head.value + " ");
			linkedList.head = linkedList.head.next;
			i++;
		}
		boolean loop = linkedList.checkLoop();
		if (loop) {
			System.out.println("\nThere is a loop in LinkedList.");
		} else {
			System.out.println("\nThere is no loop in LinkedList.");
		}
	}
}