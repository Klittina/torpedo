package torpedo;

public class Tabla {
<<<<<<< HEAD

    private int sor, sorHossz, hajoHossz, hajokSzama;

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
=======
    private int sor, sorHossz, hajoHossz,hajokSzama;
    private String [] tabla;
    
>>>>>>> 6bfbba4fabc128579c72f24cdc6b7811e0b42a42

    public void tablaLetrehoz() {
        
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < sorHossz; j++) {
                
            }
            
        }

    }

    public int hajoKezdete() {
        return 0;
    }
}
