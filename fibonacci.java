import java.util.Scanner;
class fibonacci
{
 public static void main(String[] args)
 {
 Scanner vasco = new Scanner(System.in);
 System.out.print("Enter the limit: ");
 int limit = vasco.nextInt();
 int first = 0 ,second =1;
 System.out.println("Fibonacci sequence up to (Devops practical)1" + limit + ":");

 for(int i=1;i<=limit;i++)
 {
 System.out.print(first+" ");
 int next = first + second;
 first = second;
 second = next;
 }
 
 }
}
