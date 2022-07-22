package Erros;

public class Disvisao {

  public static void main(String[] args) {
    
    
    int v1 = 10;
    int v2 = 0;
    
    System.out.println("Resultado da soma de " + v1 + " e " + v2 + " ->" + dividir(10,0));
    
  }
  
  public static int dividir(int a, int b){
  
    int r = 0;
    
    try{
    
    String[] s = new String[5];
    s[6]= "Não existe este elemento da Array";
    
      r = a/b;
    } 
    
    catch (ArithmeticException e){
      System.out.println("Aconteceu um erro aritmético detalhes : " + e.getMessage());
      
    }    
    catch (Exception e){
      System.out.println("Aconteceu um erro, não sei exatamente qual. Mas recebi a seguinte mensagem : ");
      
      System.out.println(e.getMessage());
      
     
    }
     return r;
  }

}
