/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ3;

import java.util.Scanner;

/**
 *
 * @author ALEW
 */
public class Usuario {
    Scanner sc;
    private Integer prediccion;

    public Usuario(){
        sc = new Scanner(System.in);
    }

    public void setPrediccion(){
        this.prediccion = sc.nextInt();
    }

    public Integer getPrediccion(){
        return this.prediccion;
    }

}
