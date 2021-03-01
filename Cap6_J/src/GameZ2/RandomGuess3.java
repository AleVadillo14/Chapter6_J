/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ALEW
 */
public class RandomGuess3 {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> fallos;
    private Integer aleatorio;
    private Integer usuario;

    public void jugar(){
        setAleatorio();
        System.out.println(getAleatorio());
        fallos = new ArrayList<Integer>();
        jugador();
        do {
            fallos.add(this.usuario);
            jugador();
        }while (this.aleatorio != this.usuario);
        fallos();
    }

    private void jugador(){
        System.out.println("Predicción");
        this.usuario = sc.nextInt();
    }

    private Integer getAleatorio(){
        return this.aleatorio;
    }

    private void setAleatorio(){
        this.aleatorio = (int)(Math.random()*10+1);
    }

    public void fallos(){
        System.out.printf("A continuacion tus fallos compi");
        System.out.println("");

        for (int i = 0; i < fallos.size(); i++) {
            System.out.println(fallos.get(i));
        }

    }

}
