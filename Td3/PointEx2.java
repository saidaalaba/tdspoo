package td2.Td3;

public class PointEx2 {
    public void PointEx2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " est " + y);
    }
    private int x, y;
}
class PointNom extends PointEx2 {
    int x,y;
   char nom;

   public void setPointNom(int x, int y, char nom){
       PointEx2(x,y);

       this.nom=nom;
   }
   public void setNom(char nom){
       this.nom=nom;
   }
   public void affCoordNom(int x,int y, char nom){
       System.out.println("les coordonnee sont " +x+"et "+y+" le nom est "+nom);
   }
   public static void main(String args[]){
       PointEx2 p1 =new PointEx2();
       p1.PointEx2(3,5);
       p1.affCoord();
       PointNom p2 =new PointNom();
       p2.setPointNom(6,5, 'k');
       p2.affCoord();
       p2.affCoordNom(13,45,'f');


   }
}
