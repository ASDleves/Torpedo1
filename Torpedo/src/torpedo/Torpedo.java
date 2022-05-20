
package torpedo;

import java.util.Random;

public class Torpedo {
    public static final int PALYA = 7
    public static void main(String[] args) {
        torpedo();
        
    }
    private static void torpedo(){
        int[] pozicio = hajoPoz();
        Hajo hajo = new Hajo(pozicio);
        int talalatszam = 0;
        int loveSzam = 0;
        while();
    
}

    private static int[] hajoPoz() {
        int[] tomb = new int[3];
        Random hely = new Random();
        int pozicio = hely.nextInt(PALYA);
        tomb[0] =pozicio;
        tomb[1] =pozicio+1;
        tomb[2] =pozicio+2;
        return tomb;
    }
}