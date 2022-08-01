
package aralarindaasal;
public class asalmi {
    public static int cevabibul(int s1, int s2)
    {
   int i;
        for( i=1; i<s1; i++)
        {
       if(s1%i==0 && s2%i==0)
           return i;     
        }
        return 0;
    }
}
