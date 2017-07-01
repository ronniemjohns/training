package com.berkeley.cs61b.classlectures.linkedlists;

public class ListNode {
	public int item;
	public ListNode next;
	
	// constructor for MOST items (non-last)
	public ListNode(int item, ListNode next) {
		this.item = item;
		this.next = next;
	}
	
	// constructor for the LAST item
	public ListNode(int item) {
		this(item, null);
	}
	
	// inserts a new list node after THIS ListNode
	public void insertAfter(int item) {
		next = new ListNode(item, next);
	}
}
