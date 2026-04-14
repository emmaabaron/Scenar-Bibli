package bibliotheque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BBARON
 */

import java.util.ArrayList;

public class Livre {
    String titre;
    Auteur auteur;
    int pages;
    ArrayList<Genre>listeGenre;
    
    public Livre(String titre, Auteur auteur, int pages){
        this.titre=titre;
        this.auteur=auteur;
        this.pages=pages;
        this.listeGenre=new ArrayList<Genre>();
    }
    
    public void afficherLivre(){
        System.out.println("Titre du livre : "+titre);
        System.out.println("Nom & prénom de l'auteur : "+auteur.nom+" "+auteur.prenom);
        System.out.println("Il comprend "+pages+" pages.");
        for(int i=0;i<listeGenre.size();i++){
            System.out.println("Genre du livre : "+listeGenre.get(i).nom);
        }
    }
    
    public void ajouterGenre(Genre genre){
        this.listeGenre.add(genre);
    }
}
