//: HumanExc.java
// Catching Exception Hierarchies

class Annoyance extends Exception {}

class Sneeze extends Annoyance {}

public class HumanExc
{
  public static void main(String[] args)
  {
    try
    {
      throw new Sneeze();
    }
    catch(Annoyance a)
    {
      System.out.println("Caught Annoyance");
    }
    catch(Sneeze s) // catch not reached !!! ha ez a bazis exc. utan van !!!
    {
      System.out.println("Caught Sneeze");
    }
  }
} ///:~