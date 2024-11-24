import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //Scanner class object to get user input
        int givenNumber=obj.nextInt();
        //reads input int value

        int revNumber=0;

        // Loop to reverse the digits of the number
        while (givenNumber > 0) {
            // Extract the last digit of the number using modulus operator
            revNumber = revNumber * 10 + givenNumber % 10;

            // Remove the last digit from the given number by dividing it by 10
            givenNumber /=10;

        }
        System.out.println("Reversed number is " +revNumber);
        obj.close();// close Scanner class object
    }
}
