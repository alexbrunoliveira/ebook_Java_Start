package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ExemploVBoxHBox extends Application {

@Override
public  void start(Stage telaEmBranco){
  
  // PAINEL E SEUS NODES
    /*Criando o painel*/
    
    HBox painel = new HBox();
    painel.setSpacing(4);
    
    /*colocar nodes dentro do pane*/
    
    for (int i = 1; i < 6; i++){
      Button b = new Button ("X" + i);
      
      /*Ajustando o codigo para 7 botoes */
      
      /* for(i=0; i < 8; i++){
       *
      }*/
      
      b.setPrefWidth(50);
      
      painel.getChildren().add(b);
    }
      // Scene
      Scene cena = new Scene(painel, 300, 300);
      
      // JOGANDO TUDO NA STAGE

     telaEmBranco.setTitle("Exemplo de Pane");
     
     telaEmBranco.setScene(cena);
     telaEmBranco.sizeToScene();
     telaEmBranco.show();
      }


  public static void main(String[] args) {
   Application.launch(args);
  }
}
