import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int i;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter an integer:");
    i = scan.nextInt();
    int count = 1;
    if(i % 2 == 0){     //Identify even input
      count -= 1;
      for(int a = count; a <= i; a++){
        for(int b = count; b <= (i -(i/2)); b++){
          System.out.print("  ");
        }
        for(int c = 1; c <= count * 2; c++){
          System.out.print(" *");
        }
        for(int d = count; d < i - (i-1); d++){
          System.out.print("*");
        }
        if(a < (i -(i/2))){
          count++;
        }
        else{
          count--;
        }
        System.out.println("");



    }

    }
    else{     //Identify odd input
      for(int a = 1; a <= i; a++){
        for(int b = count; b <= i - 1; b++){
          System.out.print(" ");
        }
        for(int c = 1; c <= count * 2 - 1; c++){
          System.out.print("*");
        }
        if(a < (i -(i/2))){
          count++;
        }
        else{
          count--;
        }
        System.out.println("");
    }
  }
}
}
