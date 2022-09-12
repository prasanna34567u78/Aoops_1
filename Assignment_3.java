import java.util.*;
import java.util.Scanner;

/**
 * Assignment_3
 */
public class Assignment_3 {

  public static void main(String[] args)throws SubstringNotFoundException {
   
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the String =");
    String testString = sc.nextLine();
  testString =  testString.toUpperCase();
    String subString="SDMCET";
    
    int i=0,j=0;
    while(i<testString.length()){
        if(testString.charAt(i)==subString.charAt(j) && j<subString.length()-1){
            i++;
            j++;
        }else{
            i++;
        }


    }  //end of while
    
    if(j == subString.length()-1){
        System.out.println("Substring is present");
    }else{
        throw new SubstringNotFoundException("Substring is not found !! please enter the valid input");
    }


   }
    
}

class SubstringNotFoundException extends Exception{

    String str;
    SubstringNotFoundException(String str){
        this.str = str;
    }
    public String toString() {
        return this.str;
    }

}
