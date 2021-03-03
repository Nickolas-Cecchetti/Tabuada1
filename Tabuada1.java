/* Aluno: Nickolas E. F. Cecchetti - MatrÃ­cula: 0050015711 */ 

package javaapplication1;
import java.util.Scanner;

//@author nicke

public class Tabuada1 {
    public static void main(String[] args)
    {
        int valor = 10;
        Scanner teclado = new Scanner(System.in);
        System.out.println("A seguir a tabuada de 10:");
        for(int i = 0; i < 11; i++)
        {
            System.out.println(valor + " X " + i + " = " + (valor * i));
        }
    }
}
