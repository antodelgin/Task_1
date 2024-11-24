import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //Scanner class object to get user input

        int num1=obj.nextInt(); // reads num1 int value
        int num2=obj.nextInt(); // reads num2 int value
        int num3=obj.nextInt(); // reads num3 int value

        if(num1<num2 & num1<num3){ //checks whether num1 is smaller
            System.out.println(num1 + " is the smallest number");
        }else if(num2<num1 & num2<num3) { //checks  whether num2 is smaller
            System.out.println(num2 + " is the smallest number");
        }else{
            // print num3 is smaller if previous conditions are false
            System.out.println(num3 + " is the smallest number");
        }
        obj.close();
        // close Scanner class object
    }
}
