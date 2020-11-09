import java.util.*;


class Main {
  public static void main(String[] args) {
    
       // Task 1
  int a = 1; int b = 2;
  int swap = a;
   a = b;
   b = swap;
  System.out.println("a: "+ a + " b: "+ b);
   int x = 5; int y = 6;
   y = x;
   x = y;
 System.out.println("x: "+ x + " y: "+ y);

 // Task 2

   System.out.println("Task 2");

int val1 =0,val2=0;
  while(val1 <= 0 || val1 > 10 || val2 <= 0 || val2 > 10){
    Scanner in = new Scanner(System.in);
  System.out.println("Enter first numbers between 1 and 10");
 val1 = in.nextInt();
     System.out.println("Enter second numbers between 1 and 10");
   
    val2 = in.nextInt();

  }
 
 
    int z = val1 + val2;

    int result = z + 30;

    System.out.println(result);



  }
}
