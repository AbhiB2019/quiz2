import java.util.Arrays;

class Equality
{
  public static boolean myEquals( int[] a, int[] b )
  {
      int count = 0
      for (int i = 0, i < a.length; i++){
          if (a[i] == b[i]){
            count++;
          }
      }
      if (count == a.length){
          System.out.println("These are equal bruh.")
      }
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };

    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayE, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( Arrays.equals( arrayE, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }
}