import java.util.*;

class ArrayStringOperations {
    int[] arr;
    int size;

    ArrayStringOperations(int size) {
        this.size = size;
        arr = new int[size];
    }

    void inputArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void reverseArray() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sortArray() {
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void findMaximum() {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        System.out.println("Max = " + max);
    }

    void findAverage() {
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println("Avg = " + (double)sum / size);
    }

    void search(int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Found at " + (i + 1));
                return;
            }
        }
        System.out.println("Not Found");
    }

    void reverseString(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }
}

public class Main {   // 🔴 changed here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayStringOperations obj = new ArrayStringOperations(n);

        obj.inputArray();
        obj.reverseArray();
        obj.sortArray();

        int key = sc.nextInt();
        obj.search(key);

        obj.findMaximum();
        obj.findAverage();

        sc.nextLine();
        String str = sc.nextLine();
        obj.reverseString(str);
    }
}
