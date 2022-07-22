package testeLivro;

public class TestaArrayMult {

  public static void main(String[] args) {
   String competicoes [][];
   //Criando os arrays

   competicoes = new String[3][4];
   
   // Carregando do dados na array a
   
  competicoes[0][0] = "Corrida 100 m rasos";
 competicoes[0][1] ="Usain";
 competicoes[0][2] ="Florence";
 competicoes[0][3] ="Tuson";
 
 
 
   competicoes[1][0] ="Salto Triplo";
   competicoes[1][1] ="Inessa";
   competicoes[1][2] ="Jonathan";
   competicoes[1][3] ="Françoise";
   
   competicoes[2][0] = "Natação 50m. ";
   competicoes[2][1] = "César";
   competicoes[2][2] = "Ranoni";
   competicoes[2][3] = "Michael";
   
   // exibindo dados do array a

   System.out.println("Competição: " + competicoes[0][0]);
   
   System.out.println("Ouro: " + competicoes[0][1]);
   
   System.out.println("Prata: " + competicoes[0][2]);
   
   System.out.println("Bronze: " + competicoes[0][3]);
   
   System.out.println("-");
   
   System.out.println("Competição: " + competicoes[1][0]);
   
   System.out.println("Ouro: " + competicoes[1][1]);
   
   System.out.println("Prata: " + competicoes[1][2]);
   
   System.out.println("Bronze: " + competicoes[1][3]);
   
   System.out.println("-");
   
   System.out.println("Competição: " + competicoes[2][0]);
   
   System.out.println("Ouro: " + competicoes[2][1]);
   
   System.out.println("Prata: " + competicoes[2][2]);
   
   System.out.println("Bronze: " + competicoes[2][3]);
   
  }

}
