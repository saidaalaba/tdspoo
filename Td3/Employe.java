package td2.Td3;

public abstract class Employe {


    String nom,prenom;
    public Employe(){}
    public Employe(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
    public abstract int gain ();

}
class Patron extends Employe{
int salaire;
public Patron(){}
    public Patron(String nom,String prenom,int salaire){
    this.prenom=prenom;
    this.salaire=salaire;
    this.nom=nom;
    }
    @Override
    public int gain() {

        return 0;
    }

    public int getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "salaire=" + salaire +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    public int gains(){return salaire;}

}
class TravailleurCommission extends Employe{
int salair;
int commission;
int quantite;
public TravailleurCommission(){}
    public TravailleurCommission(String nom,String prenom,int salair, int commission ){}
    @Override
    public int gain() {
        return salair+commission;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "salair=" + salair +
                ", commission=" + commission +
                ", quantite=" + quantite +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }


}
class TravailleurHoraire extends Employe{

    @Override
    public int gain() {

        return 0;
    }
}
