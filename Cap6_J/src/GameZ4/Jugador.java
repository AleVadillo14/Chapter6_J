/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ALEW
 */
public class Jugador {
    private Integer valor;
    Scanner sc = new Scanner(System.in);
    private Die dado1;
    private Die dado2;

    public Jugador(){
        this.valor = 0;
        dado1 = new Die();
        dado2 = new Die();
    }

    public void jugar(){
        this.dado1.lanzar();
        System.out.println(this.dado1.getNumero());
        this.dado2.lanzar();
        System.out.println(this.dado2.getNumero());
        validar(dado1.getNumero(),dado2.getNumero());
        System.out.println(this.valor);
    }

    private void validar(int x, int y){
        if (x == 1 || y == 1){
            this.valor = this.valor;
            return;
        }if (x == 1 && y == 1){
            this.valor = 0;
            //checar();
        }else{
            this.valor = this.valor + x + y;
        }
    }

    public Integer getValor(){
        return this.valor;
    }

    public void checar(){
        if (this.dado1.getNumero() != 1 && this.dado2.getNumero() != 1){
            System.out.println("¿Quieres volver a tirar? [1] si [2] no");
            int opc = sc.nextInt();
            if (opc == 1){
                jugar();
            }else{

            }
        }
    }

}
