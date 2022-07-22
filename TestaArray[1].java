package testeLivro;

public class TestaArray {

  public static void main(String[] args) {
 // Definindo os Arrays

   String a [] ;
   String []b;
   
   // Criando os arrays

   a = new String [5];
   b = new String[5];
   
   //Carregando dados no Array a

    a[0]="João";
    a[1]="Maria";
    a[2]="Marcos";
    a[3]="Clara";
    a[4]="Roberto";
   
    // Carregando dados do array b
      
      
    b[0]="Silva";
    b[1]="Fernandes";
    b[2]="Pereira";
    b[3]="Lins";
    b[4]="Gomes";
    
    // Exibindo o array a

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);
    
    System.out.println("<---------->");
    
    // Exibindo o array b
    System.out.println(b[0]);
    System.out.println(b[1]);
    System.out.println(b[2]);
    System.out.println(b[3]);
    System.out.println(b[4]);
    
    System.out.println("<---------->");

    // Exibindo o array a e b
    System.out.println(a[0] + " " + b[0]);
    System.out.println(a[1] + " " + b[1]);
    System.out.println(a[2] + " " + b[2]);
    System.out.println(a[3] + " " + b[3]);
    System.out.println(a[4] + " " + b[4]);
    
    System.out.println("<---------->");
    System.out.println();
    System.out.println("Testando dados array a com for");
    
    System.out.println();
    for(int n =0; n < a.length; n++){
      System.out.println(a[n]);
     
      }
    
    for(int i =0; i < b.length; i++){
      System.out.println(b[i]);
    }
    
    System.out.println("Exibindo dados do array a e b com for");
    
    System.out.println();
    
    for (int z=0; z < a.length; z++){
      System.out.println(a[z]+" " + b[z]);
    }
  }

}
