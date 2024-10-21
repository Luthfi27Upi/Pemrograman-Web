public class Stack {
    int size;
    int data[];
    int top;
    public Stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int push(int dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
            return dt;
        } else {
            return -1; // Atau kembalikan nilai lain untuk menunjukkan error
        }
    }
    public Integer pop() {
        if (!isEmpty()) {
            int x = data[top];
            top--;
            return x;
        } else {
            System.out.println("Stack is still empty");
            return null;
        }
    }
    public Integer peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }
    public String print() {
        if (!isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = top; i >= 0; i--) {
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        } else {
            return "Stack is empty";
        }
    }
    public int clear() {
        if (!isEmpty()) {
            top = -1;
            return 1; // Berhasil membersihkan stack
        } else {
            return 0; // Stack sudah kosong
        }
    }
    public static void main(String[] args) {
        int sizeStack = 5;
        Stack stk = new Stack(sizeStack);
        System.out.println("Stack size:" + sizeStack);
        System.out.println("Success push:" + stk.push(15));
        System.out.println("Success push:" + stk.push(27));
        System.out.println("Success push:" + stk.push(13));
        System.out.println("Success push:" + stk.push(11));
        System.out.println("Success push:" + stk.push(34));
        System.out.println("Success pop: " + stk.pop());
        System.out.println("Success peek:" + stk.peek());
        System.out.println("Success push:" + stk.push(18));
        System.out.println("Stack data:" + stk.print());
    }
}