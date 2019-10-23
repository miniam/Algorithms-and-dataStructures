import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * LinkedList with add, get, and traversal capabilities
 */
public class LinkedList<T> implements Iterable<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public void add(T newData) {
		++size;
		Node<T> newNode = new Node<>(newData);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		tail.setNext(newNode);
		tail =  newNode;
	}

	public T get(int index) {
		if (head == null || index < 0 || index >= size) {
			return null;
		}
		if (index == size - 1) {
			return tail.data;
		}
		int currentIndex = 0;
		Node<T> currentNode = head;
		do {
			if (currentIndex == index) {
				return currentNode.data;
			}
			++currentIndex;
			currentNode = currentNode.next;
		} while (currentNode.getNext() != null);
		return null;
	}

	@Override
	public Iterator<T> iterator() {
		final LinkedList<T> cloned = clone();

		return new Iterator<T>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < size;
			}

			@Override
			public T next() {
				++index;
				Node<T> nodeToReturn = cloned.head;
				cloned.head = cloned.head.next;
				return nodeToReturn.data;
			}
		};
	}

	@Override
	public void forEach(Consumer<? super T> action) {
		final LinkedList<T> cloned = clone();

		for (T t : cloned) {
			action.accept(t);
		}
	}

	@Override
	protected LinkedList<T> clone() {
		final LinkedList<T> cloned = new LinkedList<>();
		Node<T> currentNode = this.head;
		while (currentNode != null && currentNode.getNext() != null) {
			cloned.add(currentNode.data);
			currentNode = currentNode.getNext();
		}
		cloned.add(currentNode.data);
		return cloned;
	}

	@Override
	public Spliterator<T> spliterator() {
		return null;
	}


	private class Node<T> {
		private T data;
		private Node next;

		public Node(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

}
