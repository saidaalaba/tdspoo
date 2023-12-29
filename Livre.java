package td2;

public class Livre {

    String titre;
    String auteur;
    int prix;
    int annee;
    public Livre(){}
    public Livre(String titre){
        this.titre=titre;
    }
    public Livre(String titre,String auteur){
        this.titre=titre;
        this.auteur=auteur;
    }
    public Livre(String titre,String auteur, int prix){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }
    public Livre(String titre,String auteur,int prix,int annee){

        this.auteur=auteur;
        this.titre=titre;
        this.prix=prix;
        this.annee=annee;
    }
    public Livre(Livre l){
        this.titre=l.getTitre();
        this.auteur=l.getAuteur();
        this.annee=l.getAnnee();
        this.prix=l.getPrix();

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                ", prix=" + prix +
                '}';
    }

}
