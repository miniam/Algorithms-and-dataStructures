public class Tree {
    private Integer value;
    private Tree left;
    private Tree right;

    public Tree(Integer value) {
        this.value = value;
    }

    public void add(Integer newValue) {
        if (this.value < newValue) {
            if (right == null) {
                right = new Tree(newValue);
            } else {
                right.add(newValue);
            }
        } else {
            if (left == null) {
                left = new Tree(newValue);
            } else {
                left.add(newValue);
            }
        }
    }

    public void printPrefixed() {
        if (left != null) {
            left.printPrefixed();
        }
        System.out.println(value);
        if (right != null) {
            right.printPrefixed();
        }
    }

    public void printSuffixed() {
        if (right != null) {
            right.printSuffixed();
        }
        System.out.println(value);
        if (left != null) {
            left.printSuffixed();
        }
    }

    public static void main(String[] args) {
        Tree root = new Tree(5);
        root.add(10);
        root.add(2);
        root.add(7);

        root.printPrefixed();
        System.out.println("-----");
        root.printSuffixed();
    }
}
