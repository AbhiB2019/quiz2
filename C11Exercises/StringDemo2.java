public class StringDemo2
{
  public static void main ( String[] args )
  {
    String str;
    int    len;

    str = new String( "Oh, you think darkness is your ally. But you merely adopted the dark; I was born in it, moulded by it. I didn't see the light until I was already a man, by then it was nothing to me but BLINDING!" );

    len = str.length();

    System.out.println("The length is: " + len );

  }
}