package oops;

public class SumLogic {
	
	public int n;
	public int c;
	
	public SumLogic(int n, int c){
		this.n=n;
		this.c=c;		
	}
	
	public double findSum(){
		double sum=0;
		for(int i=1;i<=this.n;i++){
			sum = sum+ getSum(i);
		}
		
		return sum;
	}

	public double getSum(int i){
		double sum=1;
		
		if(i==1){
			return 0;
		}else if(i-1>this.c){
			for(int j=i-1;j>=i-c;j--){
				sum = sum * j;
			}
		}else{
			for(int k=i-1;k>=1;k--){
				sum = sum * k;
			}
		}
		
		return sum;
	}
	
	
}
