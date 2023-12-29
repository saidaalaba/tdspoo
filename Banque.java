package td2;

public class Banque {
   int NCompte;
   float solde;
   String CIN;
   public Banque(int NCopmte,float solde , String CIN){

       this.NCompte=NCopmte;
       this.solde=solde;
       this.CIN =CIN;
   }
   public void deposer(float somme ){
       this.solde+=somme;

   }
   public void retirer(float somme){
       if(this.solde >somme)
       this.solde-=somme;

   }
   public float avoirsolde(){
       return solde;
   }

    @Override
    public String toString() {
        return "Banque{" +
                "NCompte=" + NCompte +
                ", solde=" + solde +
                ", CIN='" + CIN + '\'' +
                '}';
    }
}
