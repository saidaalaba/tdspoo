package td2;

public class Ex4 {
    public static void main (String[] args ){
        Temps t1=new Temps(5,10,10);
       System.out.println(t1.toString());
        t1.ajoutemininute(70);
        t1.ajouterheures(25);
        System.out.println(t1);


    }
}
