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

public class Bibliotheque {
    String nom_bibli;
    ArrayList<Livre>listeLivres;
    
    public Bibliotheque(String nom_bibli){
        this.nom_bibli=nom_bibli;
        this.listeLivres= new ArrayList<Livre>();
    }
    
    public void ajouterLiver(Livre livres){
        this.listeLivres.add(livres);
    }
    
    public void afficherBibliotheque(){
        System.out.println("Liste des livres de la bibliothèque :");
        for (int i=0; i<listeLivres.size();i++){
            listeLivres.get(i).afficherLivre();
        }
    }
    
}
