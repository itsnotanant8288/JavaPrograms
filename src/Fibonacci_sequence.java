import java.util.Scanner;
public class Fibonacci_sequence {
    public static void main(String[] args) {
        int ft,n,i=1,t1=1,t2=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci terms do you want : ");
        n = sc.nextInt();
        while(i<=n)
        {
            if(i==1) {System.out.println("1");i++;continue;}
            if(i==2) {System.out.println("2");i++;continue;}
            ft = t1 + t2 ;
            System.out.println(ft);
            t1 = t2;
            t2 = ft;
            i++;
        }
    }
}
