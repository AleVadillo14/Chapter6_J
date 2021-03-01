/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ5;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ALEW
 */
public class Count21 {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador pc = new Jugador();
        int local = 0;





        do {
            jugador1.jugar();
            pc.jugarPC(jugador1.getValor());
            System.out.println("La computadora lanzo el " + pc.getOpc());
            local += jugador1.getOpc()+pc.getOpc();
            System.out.println(local);
        }while (local <=21);

        if (local > 21){
            System.out.println("Perdiste");
        }else{
            System.out.println("Gano la PC");
        }
    }

}
