/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ1;

/**
 *
 * @author ALEW
 */
public class TestQuiz {
    public static void main(String[] args) {
        Quizz pregunta1 = new Quizz();

        pregunta1.añadirPregunta("¿Cuanto es 2 + 2?");
        pregunta1.añadirRespuesta(0,new Respuesta("Cuatro",true));
        pregunta1.añadirRespuesta(1,new Respuesta("20",false));

        pregunta1.checar(0,0);
        
    }
}
