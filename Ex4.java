package td2;
import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args ){
        Temps t1=new Temps(5,10,10);
        Scanner sc =new Scanner(System.in);
        System.out.println("donner le temps");
        int heur=sc.nextInt();
        int min=sc.nextInt();
        int sec=sc.nextInt();
 System.out.println();
       System.out.println(t1.toString());
        t1.ajoutemininute(70);
        t1.ajouterheures(25);
        System.out.println(t1);
        System.out.println();


    }
}
