package oops;

class Solution {
    public int solution(int[] A) throws Exception {
        // write your code in Java SE 8
        // Default function result
            int equilibrium = -1;
            
            // Check arguments
            if (A == null)
            {
            	throw new Exception("A");
            }
            else if (A.length == 0)
            {
                throw new Exception("A cannot have 0 elements");
            }
            else
            {
                // Strategy: Consider the input array two separate sub-arrays, one to the
                // left of the element being considered, the other to the right. We step 
                // through the array sequentially until the sums of the sub-arrays are equal.

                // Get initial left and right sums
                long sumLeft = 0;
                long sumRight = 0;
                for (int i = 0; i < A.length; i++)
                {
                    sumRight += A[i];
                }

                // Traverse the array, looking for the first equilibrium
                for (int i = 0; i < A.length; i++)
                {
                    long tempRight = sumRight - A[i];
                    if (sumLeft == tempRight)
                    {
                        // We have found a solution at the i-th element
                        equilibrium = i;
                        break;
                    }
                    else
                    {
                        // Prepare for next comparison
                        sumLeft += A[i];
                        sumRight = tempRight;
                    }
                }
            }

            // Return the result
            return equilibrium;
    }
}

