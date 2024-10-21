public class DLL1 {
    static class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
        }
    }
    
    Node head, tail;
    
    boolean isEmpty() {
        return head == null;
    }
    
    int addFirst(int data) {
        int d = data;
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        return d;
    }
    int addLast(int data) {
        int d = data;
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        return d;
    }
    int remove(int key) {
        int k = key;
        if (isEmpty()) {
            System.out.println("Linked List is empty");
            return k;
        }
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data not found");
            return k;
        }
        if (current == head) {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
        } else if (current == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        return k;
    }
    int getData(int index) {
        Node temp = head;
        for (int i = 0; temp != null && i < index; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return -1;
        }
        return temp.data;
    }
    String print() {
        if (!isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Node temp = head;
            while (temp != null) {
                sb.append(temp.data).append(" ");
                temp = temp.next;
            }
            return sb.toString().trim();
        }
        return "Linked List is empty";
    }
    public static void main(String[] args) {
        DLL1 dll1 = new DLL1();
        int[] data = {65,90,43,49,98,14};
        dll1.remove(1);
        dll1.addFirst(data[0]);
        dll1.remove(1);
        dll1.getData(2);
        System.out.println("Success add: " + dll1.addFirst(data[0]));
        System.out.println("Success add: " + dll1.addLast(data[1]));
        System.out.println("Success add: " + dll1.addFirst(data[2]));
        System.out.println("Success add: " + dll1.addFirst(data[3]));
        System.out.println("Success add: " + dll1.addLast(data[4]));
        System.out.println("Success add: " + dll1.addFirst(data[5]));
        System.out.println("Data index 1: " + dll1.getData(1));
        System.out.println("Success remove: " + dll1.remove(data[1]));
        System.out.println("Linked List: " + dll1.print());
    }
}