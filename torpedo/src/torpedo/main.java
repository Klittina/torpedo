package torpedo;

import java.util.Scanner;

public class main {

    static Tabla t1 = new Tabla(7);
    static int tipp = 0;

    public static void main(String[] args) {
        int tipp = 0;
        jatekKezdes();

    }
    
    public static void jatekKezdes(){
        Tabla t1 = new Tabla(1, 7, 3, 1);
    }

    public int bekeres() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A hajó egyik helye a " + t1.getHajoHossz() + "-ból/-ből: ");
        int bekertSzam = sc.nextInt();
        return bekertSzam;

    }


}
