public class DoublyLinkedList<T> {
	private T data;
	private DoublyLinkedList<T> left;
	private DoublyLinkedList<T> right;

	public DoublyLinkedList(T data, DoublyLinkedList<T> left, DoublyLinkedList<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public DoublyLinkedList(T data) {
		this(data, null, null);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DoublyLinkedList<T> getLeft() {
		return left;
	}

	public void setLeft(DoublyLinkedList<T> left) {
		this.left = left;
	}

	public DoublyLinkedList<T> getRight() {
		return right;
	}

	public void setRight(DoublyLinkedList<T> right) {
		this.right = right;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasRight() {
		return right != null;
	}
}