package Ej1;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LEER NUMERO");
        int numero = scanner.nextInt();

        if (numero % 2 ==0) {
            System.out.println("El numero es par. \nDescendiendo, los numeros pares desde " + numero + " hasta 0 son:");
            for (int i = numero; i >= 0; i -= 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("El numero es impar. \nDescendiendo, los numeros impares desde " + numero + " hasta 1 son:");
            for (int i = numero; i >= 1; i -= 2) {
                System.out.print(i + " ");
            }
        }
    }
}
