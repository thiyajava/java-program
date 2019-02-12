import java.util.*;
class Main {
  public static void main(String[] args) {
    int a,b;
    Scanner swap = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    a = swap.nextInt();
    System.out.println("Enter the value of b:");
    b = swap.nextInt();
    System.out.println("before swapping a:"+a+",b:"+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System. out.println("after swapping a:"+a+",b:"+b);
  }
}
