namespace DataStructures
{
    public class DoublyLinkedList<T>
    {
        private T data;
        private DoublyLinkedList<T> left;
        private DoublyLinkedList<T> right;

        public DoublyLinkedList(T data, DoublyLinkedList<T> left, DoublyLinkedList<T> right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public DoublyLinkedList(T data) : this(data, null, null)
        {

        }

        public T Data
        {
            get { return data; }
            set { data = value; }
        }
        public DoublyLinkedList<T> Left
        {
            get { return left; }
            set { left = value; }
        }

        public DoublyLinkedList<T> Right
        {
            get { return right; }
            set { right = value; }
        }

        public bool HasLeft()
        {
            return left != null;
        }

        public bool HasRight()
        {
            return right != null;
        }
    }
}