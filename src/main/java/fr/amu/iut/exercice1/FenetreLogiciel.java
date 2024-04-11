package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création d'un conteneur principal
        VBox vbox = new VBox();

        // Création du conteneur correspondant à la ligne de contrôle au dessus du tableau
        HBox topMenu= new HBox();
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Help");

        MenuItem file1 = new MenuItem("New");
        MenuItem file2 = new MenuItem("Open");
        MenuItem file3 = new MenuItem("Save");
        MenuItem file4 = new MenuItem("Close");

        MenuItem edit1 = new MenuItem("Cut");
        MenuItem edit2 = new MenuItem("Copy");
        MenuItem edit3 = new MenuItem("Paste");

        menu1.getItems().addAll(file1, file2, file3, file4);
        menu2.getItems().addAll(edit1, edit2, edit3);

        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        topMenu.getChildren().addAll(menuBar);
        // Création de la zone Boutons
        // HBox boutons = new


        // Création de la ligne de séparation
        Separator sep = new Separator();

        // Création du bandeau en bas de la fenêtre
        HBox basPage = new HBox();
        basPage.setAlignment(Pos.BOTTOM_CENTER);
        Label text = new Label("Ceci est un label de bas de page");

        basPage.getChildren().addAll(text);

        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                topMenu,
                sep,
                basPage
        );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

