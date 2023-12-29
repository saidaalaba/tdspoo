package td2;

public class Ex6 {
    public static void main(String[] args){
        Banque B =new Banque(1,5000,"AB1200");
        System.out.println(B.toString());
        System.out.println(B.avoirsolde());
        B.deposer(500);
        System.out.println(B.toString());
        System.out.println(B.avoirsolde());
        B.retirer(200);
        System.out.println(B.toString());
        System.out.println(B.avoirsolde());
    }
}
