import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int i;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter an integer:");
    i = scan.nextInt();

    //if(i % 2 == 0){
      int count = 1;
      //System.out.println("even");
      for(int a = 1; a <= 2 * i - 1; a++){
        for(int b = count; b <= i; b++){
          System.out.print("  ");
        }
        for(int c = 1; c <= count * 2 - 1; c++){
          System.out.print("* ");
        }
        if(a < i){
          count++;
        }
        else{
          count--;
        }
        System.out.println("");
      }
    }
    //else{
      //System.out.println("odd");
    }
  //}
//}
