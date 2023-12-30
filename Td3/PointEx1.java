package td2.Td3;

public class PointEx1 {

    public void PointEx1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
   public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    private int x;
    private int y;
}
 class PointA extends PointEx1{
    void affiche(){
        System.out.println("les coordonnées sont " +getx()+ "  est " +gety());
    }
    public static void main (String args[]){
        PointEx1 p =new PointEx1();
        p.PointEx1(3,5);
        System.out.println("les coordonnées sont " + p.getx()+ " est " + p.gety() );
      PointA p2=new PointA();
      p2.PointEx1(5,8);
      p2.affiche();
    }
 }
