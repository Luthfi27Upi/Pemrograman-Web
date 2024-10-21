public class Sorting {
    public int[] data;
    public int numData;
    public Sorting(int Data[], int numData) {
        this.numData = numData;
        this.data = new int[numData];
        for (int i = 0; i < numData; i++) {
            this.data[i] = Data[i];
        }
    }
    public void showData() {
        System.out.println("Before sorting:");
        for (int i = 0; i < numData; i++) {
            System.out.println("data[" + i + "]:" + data[i]);
        }
        insertionSort();
        System.out.println("After ascending sorting:");
        for (int i = 0; i < numData; i++) {
            System.out.println("data[" + i + "]:" + data[i]);
        }
    }
    public void insertionSort() {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] a = {73, 67, 56, 32, 52, 41, 83, 37, 32, 10};
        Sorting sorting = new Sorting(a, a.length);
        sorting.showData();
    }
}