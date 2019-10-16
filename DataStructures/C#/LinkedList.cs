namespace DataStrutures
{
    public class LinkedList<T>
    {
        private LinkedList<T> next;
        private T data;


        public LinkedList(T data, LinkedList<T> next)
        {
            this.data = data;
            this.next = next;
        }

        public LinkedList(T data) : this(data, null)
        {

        }

        public LinkedList<T> Next
        {
            get { return next; }
            set { next = value; }
        }

        public T Data
        {
            get { return data; }
            set { data = value; }
        }

        public bool HasNext()
        {
            return next != null;
        }
    }
}