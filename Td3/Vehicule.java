package td2.Td3;

public class Vehicule {
    private int nbrPassager;
    public Vehicule(int n){
        this.nbrPassager=n;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbrPassager=" + nbrPassager +
                '}';
    }
    public static void main(String[]args){
        Vehicule V =new Vehicule(13);
        System.out.println(V.toString());
        Moto M=new Moto(13,45);
        System.out.println(M.toString());
    }
}
class Moto extends Vehicule{
    int n;
    private int nbRoues=2;
    public Moto(int nbRoues,int n){
        super(n);
        this.nbRoues=nbRoues;
    }
}
class Avion extends Vehicule{

    private int nbMoteur;
    public Avion(int nbrPassager){
       super(nbrPassager);
    }
    public Avion(int nbMoteur,int nbrPassager){
       super(nbrPassager);
       this.nbMoteur=nbMoteur;
    }
}
class Triporteur extends Moto{

int nbTri;
        public Triporteur(int nbPassager , int nbRoues , int nbTri){
            super(nbPassager, nbRoues);
            this.nbTri=nbTri;
        }
    }

