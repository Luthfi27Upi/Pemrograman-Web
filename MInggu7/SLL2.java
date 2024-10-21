public class SLL2 {
    public class Node {
        int data;
        Node next;
        Node(int data, Node next) {
            this.data = data; this.next = next;
        }
    }
    public Node head, tail;
    public boolean isEmpty() {
        return head == null;
    }
    public int insertAfter(int key, int input) {
        int in = input;
        Node newNode = new Node(input, null);
        for (Node temp = head; temp != null; temp = temp.next) {
            if (temp.data == key) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) tail = newNode;
                return in;
            } }return in;
    }
    public int insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Invalid index");
            return -1;
        }
        if (index == 0) {
            head = new Node(input, head);
            if (tail == null) tail = head;
            return input;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;}
        if (temp == null) {
            System.out.println("Index out of bounds");
            return -1;}
        temp.next = new Node(input, temp.next);
        if (temp.next.next == null) tail = temp.next;
        return input;
    }
    public int indexOf(int key) {
        int index = 0;
        Node temp = head;
        for (temp = head; temp != null && temp.data != key; temp = temp.next) {
            index++;
        }return (temp == null) ? -1 : index;
    }  
    public int removeAt(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return -1;
        }int data;
        if (index == 0) {
            data = head.data; head = head.next;
            if (head == null) tail = null;
            return data;
        }Node prev = head;
        for (int i = 1; i < index && prev.next != null; i++) {
            prev = prev.next;
        }
        if (prev.next == null) {
            System.out.println("Index out of bounds");
            return -1;
        }
        data = prev.next.data;
        prev.next = prev.next.next;
        if (prev.next == null) tail = prev;
        return data;
    }
    public String print() {
        if (isEmpty()) {return "linked list is empty";}
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }return sb.toString().trim();
    }
    public static void main(String[] args) {
        SLL2 sll2 = new SLL2();
        int[] data = {700, 999, 833, 270, 390, 533};
        sll2.insertAt(-1, data[0]);
        sll2.insertAt(0, data[0]);
        sll2.insertAt(5, data[0]);
        sll2.removeAt(-1);
        sll2.removeAt(5);
        System.out.println("Success insert: " + sll2.insertAt(0, data[1]));
        System.out.println("Success insert: " + sll2.insertAfter(700, data[2]));
        System.out.println("Success insert: " + sll2.insertAt(2, data[3]));
        System.out.println("Index data 999: " + sll2.indexOf(999));
        System.out.println("Success remove: " + sll2.removeAt(0));
        System.out.println("Data: " + sll2.print());
    }
}