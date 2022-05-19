package torpedo;

import java.util.Random;

public class Tabla {

    private int sor, sorHossz, hajoHossz, hajokSzama;
    private String[] tabla;
    private int[] hajoHelye;

    public Tabla(int sor, int sorHossz, int hajoHossz, int hajokSzama) {
        this.sor = sor;
        this.sorHossz = sorHossz;
        this.hajoHossz = hajoHossz;
        this.hajokSzama = hajokSzama;
    }

    public Tabla(int sorHossz, int hajoHossz) {
        this(1, sorHossz, hajoHossz, 1);
    }

    public Tabla(int sorHossz) {
        this(1, sorHossz, 3, 1);
    }

    public void tablaLetrehoz() {
        int elemSzam = sor * sorHossz;
        tabla = new String[elemSzam];
        for (int i = 0; i < elemSzam; i++) {
            tabla[i] = " _ ";
        }
    }

    public int[] hajoHelyeGeneral() {
        Random rnd = new Random();
        hajoHelye = new int [hajoHossz]; 
        int elsohely = rnd.nextInt(sorHossz-hajoHossz);
        for (int i = 0; i < hajoHossz; i++) {
            System.out.println(elsohely);
            hajoHelye[i] = elsohely;
            elsohely++;
            
        }
        return hajoHelye;
    }

    public int getSor() {
        return sor;
    }

    public int getSorHossz() {
        return sorHossz;
    }

    public int getHajoHossz() {
        return hajoHossz;
    }

    public int getHajokSzama() {
        return hajokSzama;
    }

    public String[] getTabla() {
        return tabla;
    }

    public int[] getHajoHelye() {
        return hajoHelye;
    }

    @Override
    public String toString() {
        return "Tabla{" + "sor=" + sor + ", sorHossz=" + sorHossz + ", hajoHossz=" + hajoHossz + ", hajokSzama=" + hajokSzama + ", tabla=" + tabla + ", hajoHelye=" + hajoHelye + '}';
    }
    
}
