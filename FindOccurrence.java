import java.util.Scanner;

public class FindOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to find: ");
        int key = sc.nextInt();

        boolean found = false;

        // Find occurrences and positions
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}

output
1------    Enter array size: 3
Enter array elements:
1
2
3
Enter element to find: 4
Element not found in the array.

2--------   Enter array size: 3
Enter array elements:
1 
2
3
Enter element to find: 2
Element found at position: 1

