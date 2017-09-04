package streamproba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Tamas_Pacsay on 12/9/2016.
 */

class FoOsztaly // Foo
{
  String name;
  List<AlOsztaly> alOsztalyok = new ArrayList<>();

  FoOsztaly( String name)
  {
    this.name = name;
  }
}

class AlOsztaly
{
  String name;

  AlOsztaly(String name)
  {
    this.name = name;
  }
}

public class FlatMapProba
{
  static void flatMapProba()
  {
    List<FoOsztaly> foOsztalyok = new ArrayList<>();

    // FoOsztaly-ok letrehozasa
    IntStream.range( 1, 4)
             .forEach(i -> foOsztalyok.add( new FoOsztaly("FoOsztaly" + i)));

    // AlOsztaly-ok letrehozasa
    foOsztalyok.forEach( f -> IntStream.range( 1, 4)
                                       .forEach( i -> f.alOsztalyok.add( new AlOsztaly("AlOsztaly" + i + " <- " + f.name))));

    // pt++ : Vegigiteralas a fenti strukturan ~ egymasba agyazott ciklus == flatMap()
    foOsztalyok.stream()
               .flatMap( f -> f.alOsztalyok.stream())
               .forEach( b -> System.out.println( b.name));

  }

  public static void main( String args[])
  {
    flatMapProba();
  }
}
