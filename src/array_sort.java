import java.util.Scanner;
public class array_sort{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Size,i,j,temp;
        System.out.print("Size of array : ");
        Size = sc.nextInt();
        int[] a= new int[Size];
        System.out.println("Enter elements one by one");
        for(i=0;i<Size;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements before sorting");
        for(i=0;i<Size;i++)
        {
            System.out.println(a[i]);
        }
        for(i=0;i<Size;i++)
        {
            for(j=0;j<Size-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Array elements after sorting");
        for(i=0;i<Size;i++)
        {
            System.out.println(a[i]);
        }
    }
}
