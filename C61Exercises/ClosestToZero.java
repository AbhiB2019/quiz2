import java.io.* ;
import java.lang.Math;

class ClosestToZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    int closestNumber = 1000000;
    int length = data.length;
    

    for (int i = 0; i < length; i++  )
    {
        if (Math.abs(data[i]) < closestNumber){
            closestNumber = data[i];
        } 
    }
      
    // write out the element nearest to zero
    System.out.println( "Closest number: " + closestNumber );

  }
}      