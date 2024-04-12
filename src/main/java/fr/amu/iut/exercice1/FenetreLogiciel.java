package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création d'un conteneur principal
        BorderPane borderPane = new BorderPane();

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
        borderPane.setTop(topMenu);

        // Création de la zone Boutons
        VBox boutons = new VBox();
        boutons.setAlignment(Pos.CENTER);
        Label l1 = new Label("Boutons :");
        Text vide1 = new Text();
        Button bouton1 = new Button("Bouton 1");
        Text vide2 = new Text();
        Button bouton2 = new Button("Bouton 2");
        Text vide3 = new Text();
        Button bouton3 = new Button("Bouton 3");

        boutons.getChildren().addAll(l1, vide1, bouton1, vide2, bouton2, vide3, bouton3);
        boutons.setPadding(new Insets(Pos.CENTER.ordinal(), Pos.CENTER.ordinal(), Pos.CENTER.ordinal(), Pos.CENTER.ordinal()));

        borderPane.setLeft(boutons);

        // Création de la ligne de séparation
        Separator sep1 = new Separator();

        // Création du menu de connexion
        VBox connexion = new VBox();
        connexion.setAlignment(Pos.CENTER);
        GridPane formulaire = new GridPane();
        formulaire.setAlignment(Pos.CENTER);
        formulaire.setHgap(10);
        formulaire.setVgap(10);
        Label name = new Label("Name");
        TextField champ1 = new TextField();
        Label email = new Label("Email");
        TextField champ2 = new TextField();
        Label password = new Label("Password");
        TextField champ3 = new TextField();

        formulaire.add(name, 0, 0);
        formulaire.add(champ1, 1, 0);
        formulaire.add(email, 0, 1);
        formulaire.add(champ2, 1, 1);
        formulaire.add(password, 0, 2);
        formulaire.add(champ3, 1, 2);

        HBox boutons2 = new HBox();
        boutons2.setAlignment(Pos.CENTER);
        Button submit = new Button("Submit");
        Text vide4 = new Text("    ");
        Button cancel = new Button("Cancel");

        boutons2.getChildren().addAll(submit, vide4, cancel);

        connexion.getChildren().addAll(formulaire, boutons2);

        borderPane.setCenter(connexion);

        // Création de la ligne de séparation
        Separator sep2 = new Separator();

        // Création du bandeau en bas de la fenêtre
        HBox basPage = new HBox();
        basPage.setAlignment(Pos.BOTTOM_CENTER);
        Label text = new Label("Ceci est un label de bas de page");

        basPage.getChildren().addAll(text);

        borderPane.setBottom(basPage);

        /*// Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                topMenu,
                milieu,
                sep1,
                sep2,
                basPage
        );*/

        // Ajout du conteneur à la scene
        Scene scene = new Scene(borderPane);

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

