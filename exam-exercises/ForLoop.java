
/**
 * This is a
 * 
 * @author Barne Kleinen 
 */
public class ForLoop
{
    /**
     * Your assignment is to implement this method:
     * Sum up every element in the array passed as
     * an argument and return the sum
     * 
     * @param  a   an array of integers
     * @return     the sum of of all ints in a
     */
    public int sum(int[] a)
    {
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        return sum;  
    }
}
