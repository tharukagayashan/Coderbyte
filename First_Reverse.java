import java.util.*; 
import java.io.*;

class Main {

  public static String First_Reverse(String str) {
    
      String rev = "";

      int r = str.length()-1;

      for(int i=r; i>=0; i--){
        rev += str.charAt(i);
      }

    return rev;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}
