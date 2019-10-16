public class LinkedList<T> {
	private LinkedList<T> next;
	private T data;

	public LinkedList(T data, LinkedList<T> next) {
		this.data = data;
		this.next = next;
	}

	public LinkedList(T data) {
		this(data, null);
	}

	public LinkedList<T> getNext() {
		return next;
	}

	public void setNext(LinkedList<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean hasNext() {
		return next != null;
	}
}