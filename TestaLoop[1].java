package testeLivro;

public class TestaLoop {

  public static void main(String[] args) {
  
  
  System.out.println("Teste while");
  // A condição e testanda antes do bloco

  int n = 0;
  while (n < 5){
    System.out.println(n);
    
    if(n ==3) // interrompendo o loop de 5 
      break;
    
    n++;
    
    }
    
    System.out.println("-");

    // Testando a condição do/while

    System.out.println("Teste de do/while");
    // A condição e testanda depois do bloco
   
   int i =0;
   do{
     System.out.println(i);
     
     if(i==3)
     break;
     
     i++;
   }while(i<5);
   System.out.println("-");
   
   
   System.out.println("Testando a estrutura for");
  for(int z=0; z<5; z++){
    System.out.println(z);
    
    if(z == 3)
    break ;
  }
  System.out.println("-");
  
  
  
  // o loop toda sobre i numero de km rodado e mostra a cada mt a distância percorrida. Por fim, mostra qdo o carro esta com o tanque de gasolina vazio

  int distancia = 500;
  double tanqueGasolina = 50;
  double quilometrosPorLitro=8.5;
  
  
  double consumoPorQuilometro = 1/quilometrosPorLitro;
  
  for(int decorrido = 1; decorrido <= distancia; decorrido ++){
    
    tanqueGasolina -= consumoPorQuilometro;
    
    System.out.println("Quilômetros rodados " + decorrido);
    
    if(tanqueGasolina <=0) {
      System.out.println("Acabou a gasolina");
      
      break;
    }
  }
  
 }
  }
