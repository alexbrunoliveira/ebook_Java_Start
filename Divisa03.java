package Erros;

/** classe divisao tratando erro em main*/

public class Divisa03 {

public static void main(String[] args) throws Exception {
    
    
    int v1 = 3;
    int v2 = 4;
    
    try{
    
    System.out.println("Resultado da soma de " + v1 + " e " + v2 + " ->" + dividir(v1,v2));
    
  } catch (Exception x){
    System.out.println("Sinto muito, ocorreu o seguinte erro : " + x.getMessage());
    }
   
  }
  
  public static int dividir(int a, int b) throws Exception {
  
  
  if(a < b) {
    throw new Exception("Primeiro valor deve ser maior que o segundo");
    
  }
  
    int r = 0;
    
    try{
    
      r = a/b;
    } 
    
    catch (ArithmeticException e){
      System.out.println("Erro aritmético detalhes : " + e.getMessage());
      
    }    
    catch (Exception e){
      System.out.println("Erro generico : " + e.getMessage());
      
     
    }
     return r;
  }

}




