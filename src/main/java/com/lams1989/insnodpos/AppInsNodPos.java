package com.lams1989.insnodpos;


public class AppInsNodPos {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void main(String args[]) {

		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };
		int position = 2;
		int data = 400;

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
			insertNodeAtPos(llist.head, data, position);
			printLinkedList(llist.head);
	}

	
	static SinglyLinkedListNode insertNodeAtPos(SinglyLinkedListNode head, int data, int position) {
		SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		int count = 0;
		SinglyLinkedListNode actual = head;
		if (position == 0) {
			head = nodeInsert;
			head.next = actual;
		} else {			
			while (count < position - 1) {

				actual = actual.next;
				count++;
			}
			nodeInsert.next = actual.next;

			actual.next = nodeInsert;
		}
		return head;
	}
	
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		 SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		    if (head == null) {
		    	return nodeInsert;
		    }
		    nodeInsert.next = head;
		    return nodeInsert;
	}
	
	static void printLinkedList(SinglyLinkedListNode head) {

        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

    }
}
