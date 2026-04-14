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
public class Livre {
    String titre;
    Auteur auteur;
    int pages;
    
    public Livre(String titre, Auteur auteur, int pages){
        this.titre=titre;
        this.auteur=auteur;
        this.pages=pages;
    }
    
    public void afficherLivre(){
        System.out.println("Titre du livre : "+titre);
        System.out.println("Nom & prénom de l'auteur : "+auteur.nom+" "+auteur.prenom);
        System.out.println("Il comprend "+pages+" pages.");
    }
}
