import java.io.* ;

class ThreeSums
{

  public static void main ( String[] args )  
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    int largest = 0;
    int secondLargest = 0;
    
    
    // compute the two largest
    for ( int index = 0; index < data.length; index++)
    {
        if (data[index] > largest){
            largest = secondLargest;
            data[index] = largest;
        } 
        
      
    // write out the two largest
  }

  System.out.println("Largest = " + largest);
    System.out.println("Second largest = " + secondLargest);


}      

}