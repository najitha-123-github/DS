import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > n) {
            System.out.println("Invalid position!");
            return;
        }

        int[] newArr = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {
            if (i != pos - 1) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Array after deletion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        sc.close();
    }
}



output
Enter array size: 5
Enter array elements:
2
3
4
5
6
Enter position to delete: 3
Array after deletion:
2 3 5 6    
