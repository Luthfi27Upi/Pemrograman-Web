public class DLL2 {
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
    
    int insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Invalid index");
            return -1;
        }
        
        Node newNode = new Node(input);
        
        if (index == 0) {
            if (isEmpty()) {
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
            }
            head = newNode;
            return input;
        }

        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            } else {
                tail = newNode;
            }
        } else {
            System.out.println("Index out of bounds");
            return -1;
        }
        return input;
    }

    int insertAfter(int key, int input) {
        Node newNode = new Node(input);
        if (isEmpty()) {
            head = tail = newNode;
            return input;
        }
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            } else {
                tail = newNode;
            }
            temp.next = newNode;
        } else {
            System.out.println("Key not found");
        }
        return input;
    }
    int removeAt(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return -1;
        }
        int data = temp.data;
        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        return data;
    }
    public String print() {
        if (isEmpty()) return "Linked List is empty";
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString().trim();
    }
    
    public static void main(String[] args) {
        DLL2 dll2 = new DLL2();
        int[] data = {7, 9, 8};
        dll2.insertAt(-1, 10);
        dll2.insertAt(1, 10);
        dll2.insertAt(0, 10);
        dll2.insertAfter(1, 10);
        dll2.removeAt(-1);
        dll2.removeAt(2);
        System.out.println("Success insert: " + dll2.insertAt(0, data[0]));
        System.out.println("Success insert: " + dll2.insertAfter(7, data[1]));
        System.out.println("Success insert: " + dll2.insertAt(2, data[2]));
        System.out.println("Success remove: " + dll2.removeAt(0));
        System.out.println("Linked List: " + dll2.print());
    }
}