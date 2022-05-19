package torpedo;

import java.util.Scanner;

public class main {

    static Tabla t1 = new Tabla(7);
    static int tipp = 0;

    public static void main(String[] args) {
        
    }

    public int bekeres() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A hajó egyik helye a " + t1.getHajoHossz() + "-ból/-ből: ");
        int bekertSzam = sc.nextInt();
        return bekertSzam;

    }

    public static void jatekKezdes() {
        t1.tablaLetrehoz();
    }

}
