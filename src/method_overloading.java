import java.util.Scanner;
public class method_overloading {
    public float method1(int n){
        int i;float s=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers one by one");
        for(i=0;i<n;i++)
        {   temp = sc.nextFloat();
            s = s + temp;
        }
        return s;
    }
    public float method1(float s){
         s = s * s;
         return s;
    }
    public static void main(String[] args){
        method_overloading obj1 = new method_overloading();
        int n;float sum,sq;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of numbers you want : ");
        n = sc.nextInt();
        sum = obj1.method1(n); // here we are passing only the amount of number we are going to input
        sq  = obj1.method1(sum);//here we are passing sum value
        System.out.println("Sum of all numbers : "+sum);
        System.out.println("Square of the sum of numbers : "+sq);
    }
}
