/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ4;

/**
 *
 * @author ALEW
 */
public class PigDiceGame {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        do {
            System.out.println("Jugador 1");
            jugador1.jugar();
            System.out.println("Jugador 2");
            jugador2.jugar();
        }while (jugador1.getValor() <= 10 || jugador2.getValor() <= 10);
    }

}
