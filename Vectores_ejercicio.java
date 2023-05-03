/* */
package vectores_ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Vectores_ejercicio {

    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        Random rnd=new Random();
        int n,cont=0;
        System.out.print("¿Cuantos elementos tiene el vector? ");
        n=objread.nextInt();
        int[] numeros=new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i]=rnd.nextInt(20);
            if (numeros[i] > 10)
                cont++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + "  ");
        }
        System.out.println("\n La cantidad de numeros mayores de 10 es " + cont);
    }
}
