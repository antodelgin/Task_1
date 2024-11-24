import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //Scanner class object to get user input

        double purchaseAmount = obj.nextDouble(); // reads user input as type double
        double discount=0; // initializing discount as 0.
        if(purchaseAmount<500){ // checks purchaseAmount is less than 500
            discount=0;; // discount will be 0.
        }else if(purchaseAmount>=500 & purchaseAmount<=1000){
            // checks purchaseAmount is between 500 and 1000
            discount=purchaseAmount*0.10; // mutiply purchaseAmount with 0.10 to find 10% discount
        }else{
            // executes if previous conditions failed -> purchaseAmount above 1000
            discount=purchaseAmount*0.20; // mutiply purchaseAmount with 0.10 to find 10% discount
        }
        // subtracting purchaseAmount and discount to find final payable amount.
        double finalAmount=purchaseAmount-discount;

        // print final payable amount with two decimal points
        System.out.printf("The final payable amount is %.2f ",finalAmount);
        obj.close(); // close Scanner class object
    }
}
