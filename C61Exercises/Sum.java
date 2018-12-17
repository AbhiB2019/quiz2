import java.io.* ;

class Sum
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    int sum1 = data[0] + data[1] + data[2] + data[3] + data[4] + data[5] + data[6] + data[7] + data[8];
    int sum2 = 0;
    for (int i = 0; i <= 8; i++){
        if (data[i] % 2 == 0){
            sum2 = sum2 + data[i];
        }
    }
    int sum3 = 0;
    for (int n = 0; n <= 8; n++){
        if (data[n] % 2 == 1){
            sum3 = sum3 + data[n];
        }
    }
    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
    }
      
    // write out the three sums
    System.out.println("Sum of all integers: " + sum1 +
                        " Sum of all even integers: " + sum2 +
                        " Sum of all odd integers: " + sum3);

  }
}      