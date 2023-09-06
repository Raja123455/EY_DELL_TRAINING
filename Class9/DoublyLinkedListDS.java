package Class9;

public class DoublyLinkedListDS {

	class Node {
		int data;
		Node previous;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head, tail = null;

	public void addItem(int data) {
		Node newNode = new Node(data);

		if (head == null) { // that means list is empty
			head = tail = newNode;
			tail.next = null;
		} else { // list already has got some items

			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}

	}

	public void display() {
		Node current = head; // current elemnt will point to the head
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Node of double linked list : ");
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListDS obj = new DoublyLinkedListDS();
		obj.addItem(10);
		obj.addItem(15);
		obj.addItem(10);
		obj.addItem(10);
		obj.addItem(10);
		obj.display();

	}

}
