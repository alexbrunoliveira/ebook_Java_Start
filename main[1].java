package com.livro.exemplofor;

public class main {

  public static void main(String[] args) {
   int [] a = {1,2,3,4};
   
      //Loop for basico
      for(int x = 0; x < a.length; x++) 
      System.out.print(a[x]);
      System.out.println();
      System.out.println(" For Aprimorando");
      
      for(int n : a)
      System.out.println(n);
  }
}
