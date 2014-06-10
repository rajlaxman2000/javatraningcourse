package assignment;
import java.util.Scanner;

class MatrixMultiplication
{
   public static void main(String args[])
   {
      int m, n, p, q, sum = 0, c, d, k;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows  of matrix a");
      m = in.nextInt();
      System.out.println("Enter the number of columns of matrix a");

      n = in.nextInt();
 
      int a[][] = new int[m][n];
 
      System.out.println("Enter the elements of first matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            a[c][d] = in.nextInt();
 
      System.out.println("Enter the number of rows of matrix b");
      p = in.nextInt();
      System.out.println("Enter the number of columns of  matrix b");

      q = in.nextInt();
 
      if ( n != p )
         System.out.println("Matrices with entered orders can't be multiplied with each other.");
      else
      {
         int b[][] = new int[p][q];
         int multiply[][] = new int[m][q];
 
         System.out.println("Enter the elements of second matrix");
 
         for ( c = 0 ; c < p ; c++ )
            for ( d = 0 ; d < q ; d++ )
               b[c][d] = in.nextInt();
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
            {   
               for ( k = 0 ; k < p ; k++ )
               {
                  sum = sum + a[c][k]*b[k][d];
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Product of entered matrices:-");
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
               System.out.print(multiply[c][d]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}