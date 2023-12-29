package td2;

public class Rectangle {
    double longueur;
   double largeur ;

   public Rectangle(){};
   public Rectangle(double longueur,double largeur){
       this.longueur=longueur;
       this.largeur=largeur;
   }
   public Rectangle(Rectangle rectangle){
       this.largeur= rectangle.getLargeur();
       this.longueur= rectangle.getLongueur();
   }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public double perimetre(){
       return  2*(this.longueur + this.largeur) ;

    }
    public double aire(){
       return this.longueur*this.largeur;
    }
    public boolean iscarre(){

       if (this.longueur == this.largeur) return true;
         else return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}

