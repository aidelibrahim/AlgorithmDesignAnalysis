package l10q2;

public class L10Q2 {

    public static void main(String[] args) {
        int A[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int size = A.length;
        System.out.println("Maximum price that can be obtained is " +cutRod(A, size));
    }
    
    // Returns the best obtainable price for a rod of length n and price[] as prices of different pieces
    static int cutRod(int price[],int s)
    {
        int val[] = new int[s+1];
        val[0] = 0;
 
        // Build the table val[] in bottom up manner and return the last entry from the table
        for (int i = 1; i<=s; i++)
        {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max = Math.max(max, price[j] + val[i-j-1]);
                val[i] = max;
        }
        return val[s];
    }
}
/* 
Integer.MIN_VALUE :

Instead of initializing the variables with arbitrary values (for example 
int smallest = 9999, largest = 0) it is safer to initialize the variables 
with the largest and smallest values representable by that number type.
*/

