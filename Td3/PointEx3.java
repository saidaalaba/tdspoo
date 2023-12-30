package td2.Td3;

public class PointEx3 {

public  PointEx3(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        public void affiche() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        private int x, y;

    public static void main(String[] args) {
        PointEx3 point = new PointEx3(1, 2);
        Centre centre = new Centre(2, 3, 'o');
        Cercle cercle = new Cercle(2, 3, 'c', 3);
        point.affCoord();
        centre.affCoord();
        centre.affNom();
        cercle.affNom();
    }
}
class Centre extends PointEx3{

    char nom;
    int x,y;
    public Centre(int x, int y,char nom) {
        super(x, y);
        this.nom=nom;
    }
    public void affNom(){
       System.out.println("le nom est " +this.nom);
    }
    public void affiche(){
        System.out.println("Centre{" +
                "Nom='" + nom + '\'' +
                " X = " +this.x+
                " y = " +this.y+'}');
    }

}
class Cercle extends Centre{
int rayon;
    public Cercle(int x, int y, char nom,int rayon) {
        super(x, y, nom);
        this.rayon=rayon;
    }
    public void perimetre(int Rayon){
        System.out.println("le perimetre");
    }
}
