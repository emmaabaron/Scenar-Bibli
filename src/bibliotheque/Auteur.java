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
public class Auteur {
    String nom;
    String prenom;
    int datenaissance;
    
    public Auteur(String nom, String prenom, int datenaissance){
        this.nom=nom;
        this.prenom=prenom;
        this.datenaissance=datenaissance;
    }
    
    public void afficherAuteur(){
        System.out.println("Nom de l'auteur : "+nom);
        System.out.println("Prénom de l'auteur : "+prenom);
        System.out.println("Date de naissance de l'auteur : "+datenaissance);
    }
    
}
