import java.util.*; 
import java.io.*;

class Main {

  public static int First_Factorial(int num) {
    
    int sum = 1;

    for(int i=num; i>0; i--){
        sum *= i;
    }

    return sum;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}import java.util.*; 
import java.io.*;

class Main {

  public static int FirstFactorial(int num) {
    
    int sum = 1;

    for(int i=num; i>0; i--){
        sum *= i;
    }

    return sum;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}
