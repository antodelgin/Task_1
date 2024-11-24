import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //Scanner class object to get user input

        int givenNumber=obj.nextInt();

        if(givenNumber>0){
            // checks givenNumber greater than zero
            System.out.println(givenNumber + " is a positive number.");
        }else if(givenNumber<0){
            // checks givenNumber less than zero
            System.out.println(givenNumber + " is a negative number.");
        }else{
            // executes if the above conditions are false
            // therefore givenNumber is zero
            System.out.println(givenNumber + " is neither a positive nor a negative");
        }
        obj.close(); // close Scanner class object
    }
}
