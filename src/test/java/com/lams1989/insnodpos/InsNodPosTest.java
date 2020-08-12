package com.lams1989.insnodpos;

import com.lams1989.insnodpos.AppInsNodPos.SinglyLinkedList;
import com.lams1989.insnodpos.AppInsNodPos.SinglyLinkedListNode;

import junit.framework.TestCase;

public class InsNodPosTest extends TestCase {
	
	public void testInsNodPos() {
		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };
		int position = 2;
		int data = 400;

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = AppInsNodPos.insertNodeAtHead(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
		
		
		
	}
}
