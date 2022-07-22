package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ExemploPane extends Application {
@Override

public void start(Stage telaEmBranco){
  //PAINEL E SEUS NODES
  //CRIAR O PAINEL
  Pane painel = new BorderPane();
  
  /* Criar o node circulo */
  
  Circle cabeca = new Circle(135,60,35);
  
  /*Criar o node de retângulo*/
  
  Rectangle tronco = new Rectangle(100,100,70,90);
  
  Rectangle brancoEsquerdo = new Rectangle(70,100,25,75);
  
  Rectangle brancoDireito = new Rectangle(175,100,25,75);
  
  Rectangle pernaEsquerda = new Rectangle(100,195,30,80);
  
  Rectangle pernaDireita = new Rectangle(140,195,30,80);
  
  
  /* Que tal um poco de cor? */
  
  cabeca.setFill(Color.RED);
  tronco.setFill(Color.ORANGE);
  brancoEsquerdo.setFill(Color.BLUE);
  brancoDireito.setFill(Color.BLUE);
  
  /* Adicionar nodes no painel */
  
  painel.getChildren().add(cabeca);
     painel.getChildren().add(brancoEsquerdo);
     painel.getChildren().add(tronco);
     painel.getChildren().add(brancoDireito);
     
  painel.getChildren().add(pernaEsquerda);
  painel.getChildren().add(pernaDireita);
  
  // SCENE

Scene cena = new Scene(painel,280, 330);

 // Jogando tudo na Stage

telaEmBranco.setTitle("Exemplo de Pane");
telaEmBranco.setScene(cena);
telaEmBranco.sizeToScene();
telaEmBranco.show();

}
  public static void main(String[] args) {
  
  Application.launch(args);
   
  }
}
