import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,fact=1,i;
        System.out.print("Enter the number you want factorial of (integer) : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of the entered number is : "+fact);
    }
}
