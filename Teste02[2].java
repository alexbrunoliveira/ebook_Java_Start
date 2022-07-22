package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Teste02 {

  public static void main(String[] args) {

    List<Double> notas = new ArrayList<Double>();

    notas.add(4.5);
    notas.add(8.4);
    notas.add(9.3);

    System.out.println(notas);

    // utilizando o método get

    System.out.println("Utilizando get " + notas.get(2));
  }
}
