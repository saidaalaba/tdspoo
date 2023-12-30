package td2.Td3;

public class Batiment {
    String adresse;
    public Batiment(){}
    public Batiment(String adresse){
        this.adresse=adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
public static void main(String[]args){
        Batiment B=new Batiment("agadir");
        B.toString();
        System.out.println(B.toString());
        Maison M =new Maison("casa",12);
        M.toString();
        System.out.println(M.toString());
        Immeuble I =new Immeuble("taroudant",14);
    I.toString();
    System.out.println(I.toString());

}

}
class Maison extends Batiment{
    int nbChambres;
    public Maison(){}
    public Maison(String adresse, int nbChambres){
        super(adresse);
        this.nbChambres=nbChambres;

    }


    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbChambres=" + this.getNbChambres() +
                " adresse : "+this.getAdresse()+
                '}';
    }




}
class Immeuble extends Maison {
    int nbAppart;

    public Immeuble() {
        super();
    }

    public Immeuble(String adresse, int nbAppart) {
        this.adresse = adresse;
        this.nbAppart = nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbAppart=" + this.getNbAppart() +
                " adresse : "+this.getAdresse()+
                '}';
    }
}
