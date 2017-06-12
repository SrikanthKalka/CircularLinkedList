package srikanth.circluarLinkedList;

public class CircularLinkedList {

	int length = 0;

	CLLNode cursor;

	public int getLengthofCLList() {

		return length;

	}

	/**
	 * Importance of the method. // Single line, 3 operation.. // Create a node
	 * and assign data and next node then make new node as a cursor element
	 * 
	 * @param newNodeData
	 */
	public synchronized void insertAtBegin(int newNodeData) {

		if (newNodeData == 0)
			return;
		CLLNode newNode = new CLLNode(newNodeData);

		if (cursor == null) {
			cursor = newNode;
			cursor.setNext(cursor);
		}

		else {
			// Single line, 3 operation..
			// Create a node and assign data and next node then make new node as
			// a cursor element
			newNode.setNext(cursor.getNext());
			cursor.setNext(newNode);
			cursor =newNode;
		}
	}

	public synchronized void insertAtEnd(int newNodeData) {

		if (newNodeData == 0)
			return;
		
		CLLNode newNode = new CLLNode(newNodeData);

		if (cursor == null) {
			cursor = newNode;
			cursor.setNext(cursor);
		}

		else {

			CLLNode temp = cursor;
			CLLNode prev = null;

			while ((temp.getNext()).getData() != cursor.getData()) {

				prev = temp;
				temp = temp.getNext();

			}

			prev.setNext(new CLLNode(newNodeData));

			printElements();

		}

	}

	public synchronized String printElements() {

		if (cursor == null) {
			return null;
		}

		String result = "\n" + "[";

		CLLNode temp = cursor;

		while ((temp.getNext()).getData() != cursor.getData()) {

			result = result + " [" + temp.getData() + "]<====>";
			temp = temp.getNext();

		}

		System.out.println(result + " null ]");

		return result + " null ]";

	}
}
