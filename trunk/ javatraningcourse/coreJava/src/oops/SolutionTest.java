package oops;

public class SolutionTest {

	public static void main(String[] args){
		Solution obj = new Solution();
        int[] A = new int[]{-1,3,-4,5,1,-6,2,1};
        try {
			System.out.println(obj.solution(A));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
