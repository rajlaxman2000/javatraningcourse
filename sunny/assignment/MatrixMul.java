
package assignment;
import java.util.*;
public class MatrixMul {

	public static void main(String[] args){
		    Scanner input = new Scanner(System.in);
		    int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int[][] C = new int[3][3];
		System.out.println("Enter elements for matrix A : ");
		for (int i=0 ; i < A.length ; i++)
		for  (int j=0 ; j < A[i].length ; j++){
		A[i][j] = input.nextInt();
		}
		System.out.println("Enter elements for matrix B : ");
		for (int i=0 ; i < B.length ; i++)
		for  (int j=0 ; j < B[i].length ; j++){
		B[i][j] = input.nextInt();
		}
		System.out.println("Matrix A: ");
		        for (int i=0 ; i < A.length ; i++){
		            System.out.println();
		            for  (int j=0 ; j < A[i].length ; j++){
		                System.out.print(A[i][j]+" ");
		                  }
		        }
		System.out.println();
		System.out.println();
		System.out.println("Matrix B: ");
		        for (int i=0 ; i < B.length ; i++){    
		            System.out.println();
		            for  (int j=0 ; j < B[i].length ; j++){
		                System.out.print(B[i][j]+" ");
		                  }
		        }
		System.out.println();
		System.out.println();
		System.out.println("Result is: ");
		System.out.println();

		for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		for(int k=0;k<3;k++){
		C[i][j]+=A[i][k]*B[k][j];
		}
		}
		}
		for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		System.out.print(+C[i][j]+" ");
		}
		System.out.println();
		} 
		}
}
  





   
