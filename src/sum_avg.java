import java.util.Scanner;
public class sum_avg {
    public static void main(String[] args){
        int n,num,i,sum=0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("how many numbers sum and avg you want : ");
        n = sc.nextInt();
        System.out.println("Enter the numbers one by one");
        for(i=0;i<n;i++)
        {   num = sc.nextInt();
            sum = sum + num;
        }
        avg = (float) sum / n ;
        System.out.println("Sum of all entered numbers is : "+sum);
        System.out.println("Average : "+avg);
    }
}
