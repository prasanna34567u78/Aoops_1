
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Assignment_2 {
    
    public static void main(String[] args)throws NegativeNumberNotAllowedException ,NumberNotPrimeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int input = sc.nextInt();
        if(input<0){
            throw new NegativeNumberNotAllowedException("Negative number are not please enter a valid number");

        }else if(isPrime(input)){

            throw new NumberNotPrimeException("Entered number is Not prime Plaese Enter prime number");
        }else{
            System.out.println("You Entered number = " +  input);
        }

       
    }
    static boolean isPrime(int num) {
        boolean flag = false;
    
        int i=2;
        for(i=2;i<=num/2;i++){
            if(num % i == 0){
                flag = true;
            }
        }    

        return flag;
    
    }

}

class NegativeNumberNotAllowedException extends Exception{


    String str;
    NegativeNumberNotAllowedException(String str){
        this.str = str;
    }
    public String toString() {
        return this.str;
    }

}


class NumberNotPrimeException extends Exception{

    String str;
    NumberNotPrimeException(String str){
        this.str = str;
    }
    public String toString() {
        return this.str;
    }

}