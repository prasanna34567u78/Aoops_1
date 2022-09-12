import java.util.Scanner;
import java.io.*;


public class Assignment_4 {
 
    public static void main(String[] args) {
        
        try{

            FileWriter w = new FileWriter("Alphabets.txt");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the data to write in the file :");
            String str = sc.nextLine();
            w.write(str);
            w.close();
            File file = new File("Alphabets.txt");

            Scanner reader = new Scanner(file);
            StringBuilder s = new StringBuilder(); 
            FileWriter write = new FileWriter("Consonate.txt");
            while(reader.hasNext()){
             String data  = reader.next();
             for (int i = 0; i < data.length(); i++) {
                if(isVowel(data.charAt(i))){
                    System.out.println("vowel found " + data.charAt(i));
                   
                }else{
                
                 s.append(data.charAt(i));
                }
             }
             write.write(s.toString());
            }
          
        
            write.close();

        }
    catch(VowelNotFoundException v){
        System.out.println("vowel found");
    }catch(FileNotFoundException e){
            System.out.println(e);

      }catch(IOException ex){
        System.out.println(ex);
      }
    }

    static boolean isVowel(char c) throws VowelNotFoundException{
        if(c == 'a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c =='I'|| c =='O'|| c =='U'){
            return true;
        }else{
            return false;
        }
    }
    class VowelNotFoundException extends Exception{

    String str;
    VowelNotFoundException(String str){
        this.str = str;
    }
    public String toString() {
        return this.str;
    }

}


}


