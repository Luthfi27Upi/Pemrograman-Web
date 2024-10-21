import java.util.Scanner;
public class Searching {
    public static int search(double keyword, double array[]) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (keyword == array[i]) {
                index = i;
                break;
            } else if (keyword < array[i]) {
                break;
            }
        }
        return index;
    }
    public static void show(double array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        double[] data = {2.7, 2.9, 3.04, 3.12, 3.54, 3.87, 3.9};
        show(data);
        System.out.println("Available array elements:");
Scanner input = new Scanner(System.in);
System.out.println("Index of element:");
for(int i = 0; i < data.length; i++) {
    double keySearch = data[i];
    int index = search(keySearch, data);
    if(index != -1) {
        System.out.println("Data " + keySearch + " found at index " + index);
    }
}
    }
}