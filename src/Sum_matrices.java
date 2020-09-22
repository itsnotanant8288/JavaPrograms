import java.util.Scanner;
public class Sum_matrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,row,col;
        System.out.print("Enter the number of rows and columns you want : ");
        row = sc.nextInt();
        col = sc.nextInt();
        int[][] a1 = new int[row][col];
        int[][] a2 = new int[row][col];
        int[][] a3 = new int[row][col];
        System.out.println("Enter "+row*col+" elements for array 1");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter "+row*col+" elements for array 2");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }
        //adding corresponding elements of 2d arrays a1 and a2 into a3
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a3[i][j]=a1[i][j]+a2[i][j];
            }
        }
        System.out.println("elements of both arrays after adding to each other ");
      for(i=0;i<row;i++)
      {
          for(j=0;j<col;j++)
          {
              System.out.print(a3[i][j]+" ");
          }
          System.out.println("");
      }
    }
}
