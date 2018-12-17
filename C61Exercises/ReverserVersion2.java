import java.io.* ;

class ReverserVersion2
{

  public static void main ( String[] args )  
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int[] result = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    int count = 0;
    // copy the data in reversed order to result
    for ( int j=data.length - 1; j >= 0 ; j--)
    {
        result[count] = data[j];
        count++;
    }
    for(int i = 0; i < data.length; i++){
        System.out.println(result[i]);
    }
  }
}      