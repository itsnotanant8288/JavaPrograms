import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args){
int a;
int b;
Scanner sc = new Scanner(System.in);
System.out.print("Enter two integer values (a and b): ");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("Addition: "+(a+b));
System.out.println("Subtraction: "+(a-b));
System.out.println("Multiplication: "+(a*b));
System.out.println("Division: "+(a/b));
    }
}
