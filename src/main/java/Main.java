import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        //addNumber();
        //getInput();
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter a number here!");
        int n = scanObj.nextInt();

        int fact = 1;
        for (int i =2; i <= n; i++){
            fact = fact + i;
            System.out.println(fact);
        }
    }

    //first find the input using Scanner class
   /* public static int getInput() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter a number here!");
        int n = scanObj.nextInt();
        return n;
    }*/

}


    /* factor = 1;
        for (int i = 2; i < getInput(); i++){
            int sum = 0;
            int sumOfNumbers = sum + i;
        } return sumOfNumbers;*/
    
    // for Extra Credit
    /*int gaussianSumOfNumbers(int n) {
        return 0;
    }*/
   
    // for Extra extra credit - compare the methods and show which one is faster
    

