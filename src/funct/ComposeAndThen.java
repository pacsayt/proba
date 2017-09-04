package funct;

import java.util.function.Function;

public class ComposeAndThen
{
  static void composeAndThen()
  {
    Function<Integer, Integer> times2 = e -> e * 2;
    Function<Integer, Integer> squared = e -> e * e;

    //                    2.      1.
    System.out.println( times2.compose( squared).apply( 4)); // Returns 32

    //                    1.      2.
    System.out.println( times2.andThen( squared).apply( 4)); // Returns 64
  }

  public static void main(String[] args)
  {
    composeAndThen();
  }
}
