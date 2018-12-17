class ArraySameElements
{
  public static boolean sameElts( int[] a, int[] b )
  {
        boolean same = true;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if (b[j] != a[i]){
                    System.out.println("Not Equal")
                    break;
                }
            }
        }
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    if ( sameElts( arrayE, null ) )
      System.out.println( "Same Elements" );
    else
      System.out.println( "DIFFERENT elements" );      
 
  }
}