package application;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClassesJavaFx extends Application {
  
   @Override    
   public void start(Stage telaEmBranco) {
   
	   try {
		   
	   
   // NODES ISOLADOS

   Label labelA = new Label("Eu sou uma  Label isolada");
   
   //BRANCH NODE A
   
   Label labelB = new Label("Eu sou o primeiro Label do grupo A");
   
   labelB.setLayoutX(0);
   labelB.setLayoutY(0);
   
   Label labelC = new Label("Eu sou o segundo Label do grupo A");
   
   labelC.setLayoutX(0);
   labelC.setLayoutY(20);
   
   
   Group grupoA = new Group();
   grupoA.getChildren().add(labelB);
   
grupoA.getChildren().add(labelC);  

    // BRANCH NODE B

    Label labelD = new Label("Eu sou o primeiro Label do grupo B ");
     
   labelD.setLayoutX(0);
   labelD.setLayoutY(0);
   
   //
   
    Label labelE = new Label("Eu sou o segundo Label do grupo B. ");
    
   labelE.setLayoutX(0);
   labelE.setLayoutY(20);
   
   Group grupoB = new Group();
   
   grupoB.getChildren().add(labelD);
   grupoB.getChildren().add(labelE );
   
   // Primary Node
   
   FlowPane primaryNode = new FlowPane(Orientation.VERTICAL);
   
   primaryNode.getChildren().add(labelA);
   primaryNode.getChildren().add(grupoA);
   primaryNode.getChildren().add(grupoB);
   
 //SCENE
   
   Scene cena = new Scene(primaryNode,400,300);
   
   
   // JOGANDO TUDO NA STAGE
   
   telaEmBranco.setTitle("inter-ligação entre classes JavaFx. ");
   
   telaEmBranco.setScene(cena);
   telaEmBranco.sizeToScene();
   telaEmBranco.show();
	   } catch(Exception e) {
			e.printStackTrace();
		}
   }
   
   public static void main(String args[]) {
  
  Application.launch(args);
 
  }

}
