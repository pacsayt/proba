package generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tamas_Pacsay on 8/4/2017.
 */
public class WildcardsWithExtends
{
  static void chapter2_2()
  {
    List<Integer> ints = Arrays.asList(1,2);
    List<? extends Number> nums = ints;
//    nums.add(3.14);  // compile-time error
//    nums.add( new Integer(1)); // compile-time error
//    nums.add( new Object()); // extends Number ! -> compile-time error

    assert ints.toString().equals("[1, 2, 3.14]");  // uh oh!

//    List<? super Number> numsVagyFelette = ints; // compile-time error
    List<Object> objectLista = Arrays.asList( "A", 1, 3.14); // de lehetett volna szajbaragosan is Arrays.<Object>asList(...);
    List<? super Number> numsVagyFelette = objectLista;
  }
}
