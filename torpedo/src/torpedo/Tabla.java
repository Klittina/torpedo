package torpedo;

public class Tabla {

    private int sor, sorHossz, hajoHossz, hajokSzama;
    String[] tabla;

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
        int elemSzam = sor *sorHossz;
        tabla = new String[elemSzam];
        for (int i = 0; i < elemSzam; i++) {
            tabla[i] = " _ ";
        }
    }

    public int hajoKezdete() {
        return 0;
    }
}
