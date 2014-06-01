package oops;

import java.util.Scanner;

/**
 * 
 * @author Chanda
 *
 */
public class LoopLogicNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,c,n,msum=0,ct=0,j,cnt,s;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter N value:");
		n=sc.nextInt();
		System.out.println(" Enter C value:");
		c=sc.nextInt();
		for(i=0;i<c;i++){
			msum=msum+i;
			ct++;
		}
		ct++;
		//System.out.println("CNT"+ct+"SUM"+msum);
		for(i=c;ct<=n;ct++){
			for(j=i,s=1,cnt=1;cnt<=c;cnt++,j--){
				s=s*j;
			}
			i++;
			msum=msum+s;
			//break;
		}
		System.out.println(msum);	}
}