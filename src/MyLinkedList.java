public class MyLinkedList<E> {
    Node<E> head;
    int size;

    private class Node<E> {
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    public void push(E e) {
        head = new Node<>(e, head);
        size++;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}

class ListTestDrive {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.push(10);
        linkedList.push(20);
        linkedList.push(30);
        System.out.println(linkedList);
    }
}
