import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in); // Scanner class object to get user input
        int n = obj.nextInt(); // Reads user input as int variable

        for (int i=0; i<n; i++) { // Outer loop for rows
            for (int j=n; j>n-i; j--) {  // Inner loop for decreasing numbers
                System.out.print(j); // Print decreasing numbers
            }
            for (int k=0; k <n-i; k++) { //Inner loop for repeated numbers
                System.out.print(n-i); // Print repeated numbers
            }
            System.out.println(); // Move to the next row
        }
        obj.close(); // close Scanner class object
    }
}
