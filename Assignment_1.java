import java.io.*;
import java.util.*;
/**
 * Assignment_1
 */
public class Assignment_1 {

    public static void main(String[] args) {
        
        try {
            int a=0;
            int b= 57/a;
           
        } catch (ArithmeticException a) {
                    System.out.println(a);
        }

        System.out.println();
        try{
            int arr[]={4,3,2,3};
            int c= arr[5];
        } 
        catch(ArrayIndexOutOfBoundsException arr){
            System.out.println(arr);
        }
        
        System.out.println();
        try{
            File file = new File("parsa.txt");
            FileReader fr = new FileReader(file);           

        }catch(IOException i){
            System.out.println(i);

        }


    }
}