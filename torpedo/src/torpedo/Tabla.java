package torpedo;

import java.util.Random;

public class Tabla {
    private int sor, sorHossz, hajoHossz,hajokSzama;
    private String [] tabla;
    private int [] hajoHelye;
    

    public void tablaLetrehoz() {
        
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < sorHossz; j++) {
                
            }
            
        }

    }

    public int [] hajoHelye() {
        Random rnd = new Random();
        int elsohely= rnd.nextInt(sorHossz)-(sorHossz-hajoHossz+1);
        for (int i = 0; i < hajoHossz; i++) {
            hajoHelye[i] = elsohely;
            elsohely++;
        }
        return hajoHelye;
    }
}
