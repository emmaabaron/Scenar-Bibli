/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;
        import java.util.ArrayList;

/**
 *
 * @author BBARON
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        ArrayList<Livre> listeLivres=new ArrayList<>();
        
        Bibliotheque b1=new Bibliotheque("Bibli_test");
        
        Auteur a1=new Auteur("Saint-Exupéry","Antoine",1902);
        Auteur a2=new Auteur("Camus","Albert",1913);
        
        Livre livre1=new Livre ("Le Petit Prince",a1,96);
        Livre livre2=new Livre("Vol de nuit",a1,248);
        Livre livre3=new Livre("L'Etranger",a2,184);
        
        b1.ajouterLiver(livre1);
        b1.ajouterLiver(livre2);
        b1.ajouterLiver(livre3);
        
        a1.afficherAuteur();
        livre3.afficherLivre();
        b1.afficherBibliotheque();
    }
    
}
